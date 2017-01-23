/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finance;

import Base.ConnexionPostgres;
import Mapping.Netapayer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Apayer {

    static Connection conn;
    static PreparedStatement pst;
    static Statement stmt;

    public int countNetPayer(String dateDebut, String dateFin) {

        int rep = 0;
        try {
            String sql = "select count(*) as nbr from netpaye where datenetpaye BETWEEN '" + dateDebut + "' AND '" + dateFin + "'";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();

            while (res.next()) {
                rep = res.getInt("nbr");
            }
        } catch (SQLException ex) {

            System.out.println("Erreur de requete");
        }
        return rep;
    }

    public Netapayer[] selectNetapayer(String dateDebut, String dateFin) {
        int size = countNetPayer(dateDebut, dateFin);
        Netapayer[] rep = new Netapayer[size];
        try {
            String sql = "select * from netpaye where datenetpaye BETWEEN '"+dateDebut+"' AND '"+dateFin+"' order by datenetpaye asc";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            int i = 0;
            while (res.next()) {

                rep[i] = new Netapayer(res.getInt(1),res.getInt(2),res.getDate(3),res.getDouble(4));
                i++;
                //System.out.println(rep[i]);
            }
        } catch (SQLException ex) {

            System.out.println("Erreur de requete");
        }

        return rep;
    }
}
