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
public class InfosEmp {
    private int idemployer;
    private String nomemployer;
    private String heuredebut;
    private String heurefin;
    public InfosEmp(int idemployer,String nomemployer,String heuredebut,String heurefin) 
   {
        this.idemployer = idemployer;
        this.nomemployer = nomemployer;
        this.heuredebut = heuredebut;
        this.heurefin = heurefin;
    }

    public int getIdemployer() {
        return idemployer;
    }

    public void setIdemployer(int idemployer) {
        this.idemployer = idemployer;
    }

    public String getNomemployer() {
        return nomemployer;
    }

    public void setNomemployer(String nomemployer) {
        this.nomemployer = nomemployer;
    }

    public String getHeuredebut() {
        return heuredebut;
    }

    public void setHeuredebut(String heuredebut) {
        this.heuredebut = heuredebut;
    }

    public String getHeurefin() {
        return heurefin;
    }

    public void setHeurefin(String heurefin) {
        this.heurefin = heurefin;
    }

    
}
