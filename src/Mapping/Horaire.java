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
public class Horaire {

    private int idHoraire;
    private String heureDebut;
    private String heureFin;

    public Horaire(int idHoraire, String heureDebut, String heureFin) {
        this.idHoraire = idHoraire;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;

    }

    public int getIdHoraire() {
        return idHoraire;
    }

    public void setIdHoraire(int idHoraire) {
        this.idHoraire = idHoraire;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

}
