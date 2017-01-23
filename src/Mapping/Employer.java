/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapping;

/**
 *
 * @author ITU
 */
public class Employer {
   private int idemployer;         
   private int idsalire   ;          
   private int idhoraire  ;       
   private int idposte     ;       
   private String nomemployer  ;   
   private double cinemployer  ;   
   private boolean sexeemployer ;

   public Employer(int idemployer,int idsalire,int idhoraire,int idposte,String nomemployer,double cinemployer,boolean sexeemployer) 
   {
        this.idemployer = idemployer;
        this.idsalire = idsalire;
        this.idhoraire = idhoraire;
        this.idposte = idposte;
        this.nomemployer = nomemployer;
        this.cinemployer = cinemployer;
        this.sexeemployer = sexeemployer;
    }

    public int getIdemployer() {
        return idemployer;
    }

    public void setIdemployer(int idemployer) {
        this.idemployer = idemployer;
    }

    public int getIdsalire() {
        return idsalire;
    }

    public void setIdsalire(int idsalire) {
        this.idsalire = idsalire;
    }

    public int getIdhoraire() {
        return idhoraire;
    }

    public void setIdhoraire(int idhoraire) {
        this.idhoraire = idhoraire;
    }

    public int getIdposte() {
        return idposte;
    }

    public void setIdposte(int idposte) {
        this.idposte = idposte;
    }

    public String getNomemployer() {
        return nomemployer;
    }

    public void setNomemployer(String nomemployer) {
        this.nomemployer = nomemployer;
    }

    public double getCinemployer() {
        return cinemployer;
    }

    public void setCinemployer(double cinemployer) {
        this.cinemployer = cinemployer;
    }

    public boolean isSexeemployer() {
        return sexeemployer;
    }

    public void setSexeemployer(boolean sexeemployer) {
        this.sexeemployer = sexeemployer;
    }
   

}
