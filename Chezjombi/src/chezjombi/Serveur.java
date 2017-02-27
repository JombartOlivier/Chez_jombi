
package chezjombi;



/**
 * Classe Fille Serveur
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Serveur extends Humain {
    
    final int tailleBiceps;
    final int coefCharme;
    
    public Serveur(String prenom, String surnom, float porteMonaie, int cotePopularite, String crieSignificatif, int tailleBiceps, int coefCharme) {
        super(prenom,surnom,porteMonaie,cotePopularite,crieSignificatif);
        this.coefCharme = coefCharme;
        this.tailleBiceps = tailleBiceps;
    }

    public int getTailleBiceps() {
        return tailleBiceps;
    }

    public int getCoefCharme() {
        return coefCharme;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.tailleBiceps;
        hash = 59 * hash + this.coefCharme;
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
    String Sexe(){
        String sexe;
        if(this.coefCharme !=0 && this.tailleBiceps == -1){
            return sexe = "Woman";
        }
        if(this.tailleBiceps != 0 && this.coefCharme == -1){
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
/**
 * Methode permettant que la serveuse apporte le verre et de recuperer l'argent
 * @param personne 
 */
    void BringADrink(Humain personne){
        personne.setVerre(this.verre);// Service du verre
        this.verre = null;
        //TalkTo(personne,"Et voila votre verre cela fera :" +verre.getPrix());
    }
    
}
