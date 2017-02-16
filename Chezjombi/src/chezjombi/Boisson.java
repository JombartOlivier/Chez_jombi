/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chezjombi;

import java.util.Objects;

/**
 *
 * @author ISEN
 */
public class  Boisson {
    
    private final String nom;
    private  int quantite;
    private final float prix;
    private final boolean alcoolise;
    private final float tauxAlcool;
    
    
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
        if(alcoolise == false){
            this.tauxAlcool = 0;
        }
        else{
           this.tauxAlcool = tauxAlcool; 
        }
        
}

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public float getPrix() {
        return prix;
    }

    public boolean isAlcoolise() {
        return alcoolise;
    }

    public float getTauxAlcool() {
        return tauxAlcool;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return nom + " au prix de : "+prix+" avec un degres d'aclool a "+tauxAlcool;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nom);
        hash = 29 * hash + this.quantite;
        hash = 29 * hash + Float.floatToIntBits(this.prix);
        hash = 29 * hash + (this.alcoolise ? 1 : 0);
        hash = 29 * hash + Float.floatToIntBits(this.tauxAlcool);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Boisson other = (Boisson) obj;
        if (this.quantite != other.quantite) {
            return false;
        }
        if (Float.floatToIntBits(this.prix) != Float.floatToIntBits(other.prix)) {
            return false;
        }
        if (this.alcoolise != other.alcoolise) {
            return false;
        }
        if (Float.floatToIntBits(this.tauxAlcool) != Float.floatToIntBits(other.tauxAlcool)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
    



}
