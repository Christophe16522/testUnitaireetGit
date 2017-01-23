/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapping;

import java.sql.Date;

/**
 *
 * @author USER
 */
public class Retenue {
  private int idretard;
  private int idemployer;
  private Date dateretard;
  private long tempsretard;
  
  public Retenue(int idretard,int idemployer,Date dateretard,long tempsretard) 
   {
        this.idretard = idretard;
        this.idemployer = idemployer;
        this.dateretard = dateretard;
        this.tempsretard = tempsretard;
    }
 
    public int getIdretard() {
        return idretard;
    }

    public void setIdretard(int idretard) {
        this.idretard = idretard;
    }

    public int getIdemployer() {
        return idemployer;
    }

    public void setIdemployer(int idemployer) {
        this.idemployer = idemployer;
    }

    public Date getDateretard() {
        return dateretard;
    }

    public void setDateretard(Date dateretard) {
        this.dateretard = dateretard;
    }

    public long getTempsretard() {
        return tempsretard;
    }

    public void setTempsretard(long tempsretard) {
        this.tempsretard = tempsretard;
    }
  
}
