
package chezjombi;

//import java.math.MathContext;

/**
 * Classe Fille Serveur
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Serveur extends Humain {
    
    protected double tailleBiceps;
    protected double  coefCharme;
    
    public Serveur(String prenom, String surnom, float porteMonaie, int cotePopularite, String crieSignificatif, int tailleBiceps, int coefCharme) {
        super(prenom,surnom,porteMonaie,cotePopularite,crieSignificatif);
        this.coefCharme = coefCharme;
        this.tailleBiceps = tailleBiceps;
    }

    public double getTailleBiceps() {
        return tailleBiceps;
    }

    public double getCoefCharme() {
        return coefCharme;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.tailleBiceps) ^ (Double.doubleToLongBits(this.tailleBiceps) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.coefCharme) ^ (Double.doubleToLongBits(this.coefCharme) >>> 32));
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
        final Serveur other = (Serveur) obj;
        if (this.tailleBiceps != other.tailleBiceps) {
            return false;
        }
        if (this.coefCharme != other.coefCharme) {
            return false;
        }
        if((Humain)this != (Humain)obj){
            return false;
        }

        return true;
    }

   
    @Override
    void Sexe(){
       
        if(this.sexe == "Woman"){
            this.coefCharme=Math.random()*100;
            this.tailleBiceps = -1;
        }
        if(this.sexe == "Man"){
            this.tailleBiceps =  Math.random()*100;
            this.coefCharme = -1;
        }
    }

    
    @Override 
    void TalkTo(Humain personne,String talk){
        System.out.println(this.prenom + " say to " + personne.prenom +" : " + talk);
    }
       
    @Override
    void Presentation(){

        if(this. sexe == "Woman"){
           System.out.println("I am your waitress my name is "+this.prenom+" but you can call me "+this.surnom);
           System.out.println("what do you want to drink ? ");
        }
        if(this.sexe == "Man"){
           System.out.println("I am your server my name is "+this.prenom+" but you can call me "+this.surnom);
           System.out.println("what do you want to drink ? ");
        }
        
    }
    /**
 * Methode permettant que la serveuse apporte le verre et de recuperer l'argent
 * @param personne 
 */
    void BringAdrink(Humain personne){
        personne.setVerre(this.verre);// Service du verre
        this.verre = null;
    }
    
    
}
