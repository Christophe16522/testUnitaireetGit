/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapping;

/**
 *
 * @author Lai.C
 */
public class Salaire {
    private int idSalaire;  
    private double salaire; 
    
    public Salaire(int idSalaire,double salaire) 
   {
        this.idSalaire = idSalaire;
        this.salaire = salaire;
       
    }
    
    public int getIdSalaire() {
        return idSalaire;
    }

    public void setIdSalaire(int idSalaire) {
        this.idSalaire = idSalaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
}
