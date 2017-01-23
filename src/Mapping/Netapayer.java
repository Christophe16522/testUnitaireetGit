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
public class Netapayer {

    private int idnetpaye;
    private int idemployer;
    private Date datenetpaye;
    private double montantnet;

    public Netapayer(int idnetpaye,int idemployer,Date datenetpaye,double montantnet) 
    {
        this.idnetpaye = idnetpaye;
        this.idemployer = idemployer;
        this.datenetpaye = datenetpaye;
        this.montantnet = montantnet;

    }

    public int getIdnetpaye() {
        return idnetpaye;
    }

    public void setIdnetpaye(int idnetpaye) {
        this.idnetpaye = idnetpaye;
    }

    public int getIdemployer() {
        return idemployer;
    }

    public void setIdemployer(int idemployer) {
        this.idemployer = idemployer;
    }

    public Date getDatenetpaye() {
        return datenetpaye;
    }

    public void setDatenetpaye(Date datenetpaye) {
        this.datenetpaye = datenetpaye;
    }

    public double getMontantnet() {
        return montantnet;
    }

    public void setMontantnet(double montantnet) {
        this.montantnet = montantnet;
    }

}
