/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fonction;

/**
 *
 * @author ITU
 */
public class CalculeSalaire {
    public double salaireHoraire(double salaire)
    {       
        double heureW = 173.3;
        double salaireH = salaire/heureW;
        return salaireH;       
    }
    public double retenueCnaps(double salaire)
    {
        double retenue = salaire/100;
        return retenue;
    }
    
}
