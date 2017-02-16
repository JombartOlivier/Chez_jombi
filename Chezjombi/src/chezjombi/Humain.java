package chezjombi;

import java.util.Objects;

/**
 * Classe Mere Humain Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Humain {

    protected String prenom;
    protected String surnom;
    protected float porteMonnaie;
    protected int cotePopularite;
    protected String crieSignificatif;
    protected Boisson verre;

    /**
     * Construteur de la classe humain
     *
     * @param prenom
     * @param surnom
     * @param porteMonaie
     * @param cotePopularite
     * @param crieSignificatif
     */
    public Humain(String prenom, String surnom, float porteMonaie, int cotePopularite, String crieSignificatif) {

        this.prenom = prenom;
        this.surnom = surnom;
        this.porteMonnaie = porteMonaie;
        this.cotePopularite = cotePopularite;
        this.crieSignificatif = crieSignificatif;

    }
    public Humain(){
        this.prenom = "none";
        this.surnom = "none";
        this.porteMonnaie = 0;
        this.cotePopularite = 0;
        this.crieSignificatif = "none"; 
    }
    public Humain(String prenom,float porteMonaie){
        this.prenom = prenom;
        this.porteMonnaie = porteMonaie;
        this.surnom = "none";
        this.cotePopularite = 0;
        this.crieSignificatif = "none";
    }

    /**
     * Getteur de l'attribue prenom
     *
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Getteur de l'attribue surnom
     *
     * @return
     */
    public String getSurnom() {
        return surnom;
    }

    public float getPorteMonnaie() {
        return porteMonnaie;
    }

    public String getCrieSignificatif() {
        return crieSignificatif;
    }

    public Boisson getVerre() {
        return verre;
    }
    

    /**
     * Setteur de l'attribue surnom
     *
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

    public void setVerre(Boisson verre) {
        this.verre = verre;
    }
    
    

    /**
     * Modification du hash code pour la fonction equals
     *
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
     *
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
        return "je suis un huamin mon prenom est : " + prenom + " J'ai comme surnom : " + surnom + " Je dispose de : " + porteMonnaie + " euro pour boire ma cote de popularite est de : " + cotePopularite + " et mon crie est : " + crieSignificatif;
    }
/**
 * methode permettant de faire parler un humain
 * @param je_dit
 * @param a_qui 
 */
    public void Talk(String je_dit, Humain a_qui) {
        if (surnom == "none" && prenom == "none") {

            System.out.println("Je n'ai pas de prenom ni de surnom je ne peux donc pas parler");

        }
        if (surnom != "none" && prenom == "none" && a_qui.surnom != "none") {
            
            System.out.println(prenom + " à " + a_qui.prenom + " : " + je_dit);
            
        }
        if (surnom == "none" && prenom != "none" && a_qui.prenom == "none" && a_qui.surnom != "none") {
            
            System.out.println(prenom + " à " + a_qui.surnom + " : " + je_dit);
            
        } 
        if(surnom != "none" && prenom == "none" && a_qui.prenom != "none" && a_qui.surnom == "none"){
            
            System.out.println(surnom + " à " + a_qui.prenom + " : " + je_dit);
        
        }
        else {
            System.out.println(prenom + " à " + a_qui.prenom + " : " + je_dit);
        }
    }
/**
 * methode permettant de payer une boisson 
 * @param verre 
 */
    public void Pay(Boisson verre) {
        porteMonnaie = porteMonnaie - verre.getPrix();
    }
/**
 * methode permettant de boire 25% de son verre
 * @param verre 
 */
    public void Boire(Boisson verre) {
        int quantite = verre.getQuantite();
        verre.setQuantite(quantite-25);     
    }
/**
 * methode pour finir son verre d'une traite
 * @param verre 
 */
    public void FinirSonVerre(Boisson verre){
        verre.setQuantite(0);
    }
/**
 * methode pour offrire un verre à quelqu'un
 * @param personne 
 */    
    public void OffrireUnVerre(Humain personne){
       personne.setVerre(this.verre);
       Pay(this.verre);
       
    }
            
    
    

}
