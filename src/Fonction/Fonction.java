/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fonction;

import Base.ConnexionPostgres;
import Mapping.Employer;
import Mapping.Ferier;
import Mapping.Horaire;
import Mapping.Salaire;
import Mapping.InfosEmp;
import Mapping.Poste;
import Mapping.Retenue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author ITU
 */
public class Fonction {
    static Connection conn;
    static PreparedStatement pst;
    static Statement stmt;

   
    public int countFerier()
    {
        
        int rep=0;
        try 
        {
            String sql="select count(*) as nbr from ferier";
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
        return rep;
    }
    public int countSalaire()
    {
        
        int rep=0;
        try 
        {
            String sql="select count(*) as nbr from salaire";
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
        return rep;
    }
    public int countPoste()
    {
        
        int rep=0;
        try 
        {
            String sql="select count(*) as nbr from poste";
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
        return rep;
    }
    public int countHoraire()
    {
        
        int rep=0;
        try 
        {
            String sql="select count(*) as nbr from horaire";
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
        return rep;
    }
    public static boolean empExistByidName(int id,String name)
    {
        
        int rep=0;
        try 
        {
            String sql="select count(*) as nbr from employer where idemployer ="+id+" and nomemployer='"+name+"'";
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
        //return rep;
        boolean j=false;
        if(rep==1)
        {
            j= true;
        }
        else{
            throw new UnsupportedOperationException("Employer Non Enregistrez : "+name);
        }
        return j;
    }
    public int countEmployer()
    {
        
        int rep=0;
        try 
        {
            String sql="select count(*) as nbr from employer";
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
        return rep;
    }
    //public int countRetenue()
     public int countRetenue(String idEmp,String dateDebut,String dateFin)
    {
        
        int rep=0;
        try 
        {
            String sql="SELECT count(*) as nbr FROM retard WHERE dateretard BETWEEN '"+dateDebut+"' AND '"+dateFin+"' and idemployer ='"+idEmp+"'";
            //String sql="SELECT count(*) as nbr FROM retard WHERE dateretard BETWEEN '2016/11/01' AND '2016/11/30' and idemployer ='1'";
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
        return rep;
    }
    public Ferier[] selectFerier(){
        
        int size = countFerier();
        Ferier[] rep=new Ferier[size];
        try {
            
            String sql="select * from ferier";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            int i=0;
            while(res.next()){
                
                rep[i]=new Ferier(res.getInt(1),res.getDate(2),res.getTime(3),res.getDate(4),res.getTime(5),res.getString(6));
                i++;
                //System.out.println(rep[i]);
            }
        } catch (SQLException ex) {
            
            System.out.println("Erreur de requete");
        }
        
        return rep;
    }
    public Employer[] selectEmployer(){
        
        int size = countEmployer();
        Employer[] rep=new Employer[size];
        try {
            
            String sql="select * from employer";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            int i=0;
            while(res.next()){
                
                rep[i]=new Employer(res.getInt(1),res.getInt(2),res.getInt(3),res.getInt(4),res.getString(5),res.getDouble(6),res.getBoolean(7));
                i++;
                //System.out.println(rep[i]);
            }
        } catch (SQLException ex) {
            
            System.out.println("Erreur de requete");
        }
        
        return rep;
    }
    //public Retenue[] selectRetenue(){
    public Retenue[] selectRetenue(String idEmp,String dateDebut,String dateFin){    
        int size = countRetenue(idEmp,dateDebut,dateFin);
       // int size = countRetenue();
        Retenue[] rep=new Retenue[size];
        try {
            //String sql="SELECT *FROM retard WHERE dateretard BETWEEN '2016/11/01' AND '2016/11/30' and idemployer = '1'";
            String sql="SELECT *FROM retard WHERE dateretard BETWEEN '"+dateDebut+"' AND '"+dateFin+"' and idemployer = '"+idEmp+"'";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            int i=0;
            while(res.next()){
                
                rep[i]=new Retenue(res.getInt(1),res.getInt(2),res.getDate(3),res.getLong(4));
                i++;
                //System.out.println(rep[i]);
            }
        } catch (SQLException ex) {
            
            System.out.println("Erreur de requete");
        }
        
        return rep;
    }
    public static int firstPoint(String idEmp)
    {
        
        int rep=0;
        try 
        {
            LocalDate date = LocalDate.now();
            String sql="select count(*) as nbr from presence where datepoint = '"+date+"' and idemployer ='"+idEmp+"'";
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
    public static String getEntrer(String idEmp)
    {
        String val ="";
        try
        {
            conn = ConnexionPostgres.getConn();
            String req;
               
            req = "select horaire.heuredebut from horaire as horaire join employer as employer on horaire.idhoraire = employer.idhoraire where employer.idemployer='"+idEmp+"';";       
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(req);
            while(rs.next())
            {
                val = rs.getString(1);
                //System.out.println( "Heure Debut = " + val );
                
            }
            rs.close();
            stmt.close();           
            conn.close();
        }
       catch(Exception e)
        {
            System.out.println(e);
        }
        //System.out.println( "Heure Debut = " + val );
        return val;
    }
    public static String getSortie(String idEmp)
    {
        String val ="";
        try
        {
            conn = ConnexionPostgres.getConn();
            String req;
            req = "select horaire.heurefin from horaire as horaire join employer as employer on horaire.idhoraire = employer.idhoraire where employer.idemployer='"+idEmp+"';";       
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(req);
            while(rs.next())
            {
                val = rs.getString(1);
                
            }
            rs.close();
            stmt.close();           
            conn.close();
        }
       catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println( "Heure Fin = " + val );
        return val;
    }
   public static void insertPresence(String idEmp,String type,String heure,String date)
    {
        try
        {
            conn = ConnexionPostgres.getConn();
            String req;
            req = "INSERT INTO public.presence(idemployer, type, heurepoint, datepoint)VALUES ('"+idEmp+"','"+type+"','"+heure+"','"+date+"');";       
            
            stmt = conn.createStatement();
            stmt.executeUpdate(req);
            stmt.close();
            conn.commit();
            conn.close();
        }
       catch(Exception e)
        {
            System.out.println(e);
        }
    }
   public static void insertEmployer(int idsal,int idhor,int idpos,String nom,String cin,String sexe)
    {
        try
        {
            conn = ConnexionPostgres.getConn();
            String req;
            req = "INSERT INTO public.employer(idsalire, idhoraire, idposte, nomemployer, cinemployer, sexeemployer)VALUES ("+idsal+","+idhor+","+idpos+",'"+nom+"', '"+cin+"','"+sexe+"')";       
            
            stmt = conn.createStatement();
            stmt.executeUpdate(req);
            stmt.close();
            conn.commit();
            conn.close();
        }
       catch(Exception e)
        {
            System.out.println(e);
        }
    }

     public static boolean canPoint(String idEmp, String heureAriver) throws ParseException {
        java.util.Date dEnter = new java.util.Date();
        //InfosEmploye e = new InfosEmploye();
        String date = getEntrer(idEmp);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        dEnter = sdf.parse(date);
        //Fidiran le mpiasa
        java.util.Date dE = new java.util.Date();
        dE.setHours(dEnter.getHours());
        dE.setMinutes(dEnter.getMinutes());
        dE.setSeconds(dEnter.getSeconds());

        //heure Tolerer
        java.util.Date dT = new java.util.Date();
        dT.setHours(dE.getHours() + 8);
        dT.setMinutes(00);
        dT.setSeconds(01);

        //Heure nahatongavany
        java.util.Date dA = new java.util.Date();
        java.util.Date dArriver = new java.util.Date();
        dArriver = sdf.parse(heureAriver);
        dA.setHours(dArriver.getHours());
        dA.setMinutes(dArriver.getMinutes());
        dA.setSeconds(dArriver.getSeconds());

        //SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        // String dateString = LocalTime.now().toString();
        //  dA = sdf.parse(dateString);
        //System.out.println("Date Tolerer : "+dT.getHours()+":"+dT.getMinutes()+":"+dT.getSeconds());
        System.out.println("Date Tolerer : " + dT.getHours() + ":" + dT.getMinutes() + ":" + dT.getSeconds());

        if (dA.before(dT)) {
            System.out.println("Mahazo miditra");
            //mpointe iz zn.
            return true;
        } else {
            System.out.println("Tsy mahazo miditra");
            return false;
            //tsy mi pointe intsony
            //retard = + 8h
        }
    }
     public Salaire[] selectSalaire(){
        
        int size = countSalaire();
        Salaire[] rep=new Salaire[size];
        try {
            
            String sql="select * from salaire";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            int i=0;
            while(res.next()){
                
                rep[i]=new Salaire(res.getInt(1), res.getDouble(2));
                i++;
                //System.out.println(rep[i]);
            }
        } catch (SQLException ex) {
            
            System.out.println("Erreur de requete");
        }
        
        return rep;
    }
     public Poste[] selectPoste(){
        
        int size = countPoste();
        Poste[] rep=new Poste[size];
        try {
            
            String sql="select * from poste";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            int i=0;
            while(res.next()){
                
                rep[i]=new Poste(res.getInt(1), res.getString(2));
                i++;
                //System.out.println(rep[i]);
            }
        } catch (SQLException ex) {
            
            System.out.println("Erreur de requete");
        }
        
        return rep;
    }
     public Horaire[] selectHoraire(){
        
        int size = countHoraire();
        Horaire[] rep=new Horaire[size];
        try {
            
            String sql="select * from horaire";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            int i=0;
            while(res.next()){
                
                rep[i]=new Horaire(res.getInt(1), res.getString(2),res.getString(3));
                i++;
                //System.out.println(rep[i]);
            }
        } catch (SQLException ex) {
            
            System.out.println("Erreur de requete");
        }
        
        return rep;
    }
    public InfosEmp[] selectInfosEmp() {
        int size = countEmployer();
        InfosEmp[] rep=new InfosEmp[size];
        try {
            
            String sql="select employer.idemployer,employer.nomemployer,horaire.heuredebut,horaire.heurefin from employer as employer join horaire as horaire on employer.idhoraire = horaire.idhoraire";
            ResultSet res;
            res = ConnexionPostgres.getConn().prepareStatement(sql).executeQuery();
            int i=0;
            while(res.next()){
                
                rep[i]=new InfosEmp(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
                i++;
                //System.out.println(rep[i]);
            }
        } catch (SQLException ex) {
            
            System.out.println("Exception : " +ex);
        }
        
        return rep;
    }
}
