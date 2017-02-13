package chezjombi;


/**
 * Created by ISEN on 13/02/2017.
 */
public class Humain {
    
    private final String prenom;
    protected String surnom;
    protected float porteMonaie;
    protected int cotePopularite;
    protected String crieSignificatif;
    
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
