package chezjombi;

import java.util.Objects;


/**
 * Classe Mere Humain
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */

public class Humain {
   
    protected String prenom;
    protected String surnom;
    protected float porteMonnaie;
    protected int cotePopularite;
    protected String crieSignificatif;
    
/**
 * Construteur de la classe humain  
 * @param prenom
 * @param surnom
 * @param porteMonaie
 * @param cotePopularite
 * @param crieSignificatif 
 */
    
    public Humain(String prenom, String surnom, float porteMonaie, int cotePopularite,String crieSignificatif){
        
        this.prenom = prenom;
        this.surnom = surnom;
        this.porteMonnaie = porteMonaie;
        this.cotePopularite = cotePopularite;
        this.crieSignificatif = crieSignificatif;
        
    }


/**
 * Getteur de l'attribue prenom
 * @return prenom 
 */
    
    
    public String getPrenom() {
        return prenom;
    }

    public String getSurnom() {
        return surnom;
    }

    public float getPorteMonnaie() {
        return porteMonnaie;
    }

    public String getCrieSignificatif() {
        return crieSignificatif;
    }
    

/**
 * Setteur de l'attribue surnom
 * @param surnom 
 */    

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public void setPorteMonnaie(float porteMonnaie) {
        this.porteMonnaie = porteMonnaie;
    }

    public void setCrieSignificatif(String crieSignificatif) {
        this.crieSignificatif = crieSignificatif;
    }
/**
 * Modification du hash code pour la fonction equals
 * @return hash 
 */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.prenom);
        hash = 71 * hash + Objects.hashCode(this.surnom);
        hash = 71 * hash + Float.floatToIntBits(this.porteMonnaie);
        hash = 71 * hash + this.cotePopularite;
        hash = 71 * hash + Objects.hashCode(this.crieSignificatif);
        return hash;
    }
/**
 * redefinition de la methode equal
 * @param obj
 * @return boolean true => equal, false => no equal
 * 
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
        final Humain other = (Humain) obj;
        if (Float.floatToIntBits(this.porteMonnaie) != Float.floatToIntBits(other.porteMonnaie)) {
            return false;
        }
        if (this.cotePopularite != other.cotePopularite) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.surnom, other.surnom)) {
            return false;
        }
        if (!Objects.equals(this.crieSignificatif, other.crieSignificatif)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "je suis un huamin mon prenom est : "+prenom+" J'ai comme surnom : "+surnom+" Je dispose de : "+porteMonnaie+" euro pour boire ma cote de popularite est de : "+cotePopularite+" et mon crie est : "+crieSignificatif;
    }
    

    
    
}
