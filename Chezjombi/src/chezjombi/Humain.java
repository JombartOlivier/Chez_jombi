package chezjombi;


/**
 * Classe Mere Humain
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */

public class Humain {
    
    private final String prenom;
    protected String surnom;
    protected float porteMonaie;
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
        this.porteMonaie = porteMonaie;
        this.cotePopularite = cotePopularite;
        this.crieSignificatif = crieSignificatif;
        
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSurnom() {
        return surnom;
    }

    public float getPorteMonaie() {
        return porteMonaie;
    }

    public String getCrieSignificatif() {
        return crieSignificatif;
    }
    
   
    
    
    
}
