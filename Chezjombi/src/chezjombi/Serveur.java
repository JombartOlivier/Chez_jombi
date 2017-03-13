package chezjombi;
import java.util.Scanner;

//import java.math.MathContext;
/**
 * Classe Fille Serveur Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */

public class Serveur extends Humain {
    private float  monnaie;
    private Order commande;
    
    public Serveur(String prenom, String sexe, int tailleBiceps) {
        super(prenom, sexe, tailleBiceps);
        monnaie = 0;
    }

    public void setMonnaie(int monnaie) {
        this.monnaie = monnaie;
    }

    /**
     *
     * @param personne
     * @param phrase
     */
    @Override
    public void Parler(Humain personne, String phrase) {
        System.out.println(this.prenom + " dit a " + personne.prenom + " : " + phrase);
    }

    /**
     *
     * @param boisson
     * @param personne
     */
    @Override
    protected void OffrirUnVerre(Order boisson, Humain personne) {
        String str;
        if ("Homme".equals(this.sexe)) {
            str = "je ne suis qu'un serveur je peux pas vous offrire un verre";
            Parler(personne, str);
        }
        if ("Femme".equals(this.sexe)) {
            str = "je ne suis qu'une serveuse je peux pas vous offrire un verre";
            Parler(personne, str);
        }
    }

    @Override
    protected void ApporterBoisson(Humain personne) {

        System.out.println("Voici votre boisson cela fera" + this.boissonDe.getPrix());
        personne.maBoisson = this.boissonDe;
        this.boissonDe = null;

    }
    

    
    @Override
    protected void PrendreUneCommande(Humain personne) {
        Scanner sc = new Scanner(System.in);
        String str = "Souhaiter vous boire votre boisson preferer ou voulez vous la composer vous meme";
        this.Parler(personne, str);
        str = "boisson preferer [1]";
        System.out.println(str);
        str = "composer sois meme [2]";
        System.out.println(str);
        str ="0";
        while(!("1".equals(str) || "2".equals(str))){
            str = sc.nextLine();
        }
        if("1".equals(str)){
            this.commande = personne.boissonPreferee;
        }
        if("2".equals(str)){
          str = ""; 
        }
        
        
        
       
    }

    @Override
    public void SePresenter() {
        if ("Homme".equals(this.sexe)) {
            System.out.println("Bonjour je suis votre serveur je m'appelle " + this.prenom);
        }
        if ("Femme".equals(this.sexe)) {
            System.out.println("Bonjour je suis votre serveuse je m'appelle " + this.prenom);
        }
    }

    @Override
    protected void Boire() {
        if (this.maBoisson.isAlcoolise() == true) {
            System.out.println("Je ne peut pas boire de boisson alcoolisée");
        } else {
            super.Boire();
        }
    }
/**
 * Methode pour Transmettre l'argent au barman dans la caisse
 * @param personne 
 */    
    protected void TransmettreArgentBarman(Barman personne){
        String str = "Voici de l'argent a mettre dans la caisse " + this.monnaie;
        this.Parler(personne, str);
        personne.setCaisse(this.monnaie);
        this.monnaie = 0;  
    }
    
}
