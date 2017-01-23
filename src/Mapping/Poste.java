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
public class Poste {
    private int idPoste;  
    private String nomPoste; 
    
    public Poste(int idPoste,String nomPoste) 
   {
        this.idPoste = idPoste;
        this.nomPoste = nomPoste;
       
    }
    
    public int getIdPoste() {
        return idPoste;
    }

    public void setIdPoste(int idPoste) {
        this.idPoste = idPoste;
    }

    public String getPoste() {
        return nomPoste;
    }

    public void setPoste(String nomPoste) {
        this.nomPoste = nomPoste;
    }
    
}
