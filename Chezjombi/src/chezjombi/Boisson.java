/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chezjombi;

/**
 *
 * @author ISEN
 */
public class Boisson {
    
    private String nom;
    private int quantite;
    private float prix;
    private boolean alcoolise;
     private float tauxAlcool;
    
/**
 * Construteur de la classe boisson 
 * @param nom
 * @param quantite
 * @param prix
 * @param alcoolise
 * @param tauxAlcool 
 */

public Boisson(String nom, int quantite, float prix, boolean alcoolise, float tauxAlcool) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        this.alcoolise = alcoolise;
        this.tauxAlcool = tauxAlcool;
}


    
    
}
