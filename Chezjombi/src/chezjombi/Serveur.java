
package chezjombi;

/**
 * Classe Fille Serveur
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Serveur extends Humain {
    
    int tailleBiceps;
    int coefCharme;
    
    public Serveur(String prenom, String surnom, float porteMonaie, int cotePopularite, String crieSignificatif, int tailleBiceps, int coefCharme) {
        super(prenom,surnom,porteMonaie,cotePopularite,crieSignificatif);
        this.coefCharme = coefCharme;
        this.tailleBiceps = tailleBiceps;
    }
    
    
    @Override
    String Sexe(){
        String sexe;
        if(this.coefCharme !=0 && this.tailleBiceps == 0){
            return sexe = "Woman";
        }
        if(this.tailleBiceps != 0 && this.coefCharme == 0){
            return sexe = "Man"; 
        }
        else{
            return sexe = "error";
        }
    }
    
    @Override 
    void TalkTo(Humain personne,String talk){
        System.out.println(this.prenom + " say to " + personne.prenom +" : " + talk);
    }
       
    @Override
    void Presentation(){
        String sexe = Sexe();
        if( sexe == "Woman"){
           System.out.println("I am your waitress my name is "+this.prenom+" but you can call me "+this.surnom);
           System.out.println("what do you want to drink ? ");
        }
        if(sexe == "Man"){
           System.out.println("I am your server my name is "+this.prenom+" but you can call me "+this.surnom);
           System.out.println("what do you want to drink ? ");
        }
        
    }
    
}
