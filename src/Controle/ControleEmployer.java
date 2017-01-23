/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Base.ConnexionPostgres;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ITU
 */
public class ControleEmployer {
    public static int empExist(String idEmp)
    {
        
        int rep=0;
        try 
        {
            String sql="select count(*) as nbr from employer where idemployer ='"+idEmp+"'";
            //stmt = conn.prepareStatement(sql);
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            
            while(res.next())
            {
                rep=res.getInt("nbr");
            }
        } catch (SQLException ex) {
            
            System.out.println("Erreur de requete");
        }
        System.out.println(rep);
        return rep;
    }
}
