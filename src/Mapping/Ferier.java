/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapping;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author ITU
 */
public class Ferier {
   private int idferier;
   private Date datedebutferier;
   private Time euredebutferier;
   private Date datefinferier;
   private Time heurefinferier;
   private String designation;

   public Ferier(int idferier, Date datedebutferier,Time euredebutferier, Date datefinferier,Time heurefinferier,String designation) {
        this.idferier = idferier;
        this.datedebutferier = datedebutferier;
        this.euredebutferier = euredebutferier;
        this.datefinferier = datefinferier;
        this.heurefinferier = heurefinferier;
        this.designation = designation;
    }

      
    public int getIdferier() {
        return idferier;
    }

    public void setIdferier(int idferier) {
        this.idferier = idferier;
    }

    public Date getDatedebutferier() {
        return datedebutferier;
    }

    public void setDatedebutferier(Date datedebutferier) {
        this.datedebutferier = datedebutferier;
    }

    public Time getEuredebutferier() {
        return euredebutferier;
    }

    public void setEuredebutferier(Time euredebutferier) {
        this.euredebutferier = euredebutferier;
    }

    public Date getDatefinferier() {
        return datefinferier;
    }

    public void setDatefinferier(Date datefinferier) {
        this.datefinferier = datefinferier;
    }

    public Time getHeurefinferier() {
        return heurefinferier;
    }

    public void setHeurefinferier(Time heurefinferier) {
        this.heurefinferier = heurefinferier;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

 
}
