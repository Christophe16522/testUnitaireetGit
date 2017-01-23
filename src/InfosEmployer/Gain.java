/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfosEmployer;

import Base.ConnexionPostgres;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author ITU
 */
public class Gain 
{
  
    public static int salaireEmployer(String idEmp)
    {
        
        int rep=0;
        try 
        {
            LocalDate date = LocalDate.now();
            String sql="select salaire.salaire as nbr from employer as employer join salaire as salaire on employer.idsalire=salaire.idsalire where idemployer = '"+idEmp+"'";
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
