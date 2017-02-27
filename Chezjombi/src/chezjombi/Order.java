
package chezjombi;

import java.util.Objects;

/**
 * Classe Mere Humain Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */

public class  Order {
    
    private final String nom;
    private  int quantite;
    private final float prix;
    private final boolean alcoolise;
    private final float tauxAlcool;
    
    
/**
 * Construteur de la classe boisson pour les boisson alcoolisée
 * @param nom
 * @param quantite
 * @param prix
 * @param alcoolise
 * @param tauxAlcool 
 */

public Order(String nom, float prix, boolean alcoolise, float tauxAlcool) {
        this.nom = nom;
        this.quantite = 100;
        this.prix = prix;
        this.alcoolise = alcoolise;
        if(alcoolise == false){
            this.tauxAlcool = 0;
        }
        else{
           this.tauxAlcool = tauxAlcool; 
        }
        
}

/**
 * Construteur de la classe boisson pour les boisson non alcoolisée
 * @param nom
 * @param quantite
 * @param prix 
 */

public Order(String nom, int quantite, float prix){
        this.nom = nom;
        this.quantite = 100;
        this.prix = prix;
        this.alcoolise = false;
        this.tauxAlcool = 0;
}
/**
 * Getteur de l'attribue nom  
 * @return nom
 */

    public String getNom() {
        return nom;
    }
    
/**
 * Getteur de l'attribue quantite
 * @return quantite
 */
    
    public int getQuantite() {
        return quantite;
    }
    
/**
 * Getteur de l'attribue prix
 * @return prix
 */
    
    public float getPrix() {
        return prix;
    }
    
/**
 * Getteur de l'attribue alcoolise
 * @return alcoolise
 */
    
    public boolean isAlcoolise() {
        return alcoolise;
    }
    
/**
 * Getteur de l'attribue taux d'alcool
 * @return taux d'alcool
 */
    public float getTauxAlcool() {
        return tauxAlcool;
    }
    
/**
 * Setteur de l'attribue quantite 
 * @param quantite 
 */
    
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
/**
 * override de la methode toString 
 * @return nom + " au prix de : "+prix+" avec un degres d'aclool a "+tauxAlcool
 */
    
    @Override
    public String toString() {
        return nom + " au prix de : "+prix+" avec un degres d'aclool a "+tauxAlcool;
    }
    
/**
 * Override de la methode hasCode 
 * Necessaire pour Override la methode equals
 * @return hash
 */
    
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
    
/**
 * Override la methode equals 
 * @param obj
 * @return boolean
 */
    
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
        final Order other = (Order) obj;
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
