package chezjombi;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe Fille Client Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Client extends Humain {

    public Client(String prenom, String surnom, Order boissonPreferee,String sexe, int argent) {
        super(prenom, surnom, boissonPreferee, sexe, argent);
        Random r = new Random();
        int aleatoire = r.nextInt(101);
        this.charme = aleatoire;
        aleatoire = r.nextInt(101);
        this.tailleBiceps = aleatoire;
        aleatoire = r.nextInt(101); 
        this.agilite = aleatoire;
    }
    
    

    @Override
    protected void Parler(Humain personne, String phrase) {
        if(this.degreeAlcoolemie<5 && this.degreeAlcoolemie>0){
             System.out.println(this.prenom + " dit a " + personne.prenom + " : "+ phrase);
        }
        if(this.degreeAlcoolemie<10 && this.degreeAlcoolemie>5){
            System.out.println(this.prenom + " dit a " + personne.prenom + " : "+ phrase + "Hip");
        }
        if(this.degreeAlcoolemie<15 && this.degreeAlcoolemie>10){
            System.out.println(this.prenom + " dit a " + personne.prenom + " : " +personne.prenom+ phrase);
        }
        if(this.degreeAlcoolemie>15){
            System.out.println(this.prenom + " dit a " + personne.prenom + " : "+ "LALALALA");
        }
            
        
       
        
    }

    @Override
    protected void OffrirUnVerre(Order boisson, Humain personne) {
        
        String str = "Allez, celle ci est pour moi";
        this.Parler(personne, str);
        personne.maBoisson = boisson;
        this.Payer((int) boisson.getPrix());

    }

    @Override
    protected void ApporterBoisson(Humain personne) {
        
        System.out.println("Voici ta boisson abolu : " + this.boissonDe.getPrix());
        personne.maBoisson = this.boissonDe;
        this.boissonDe = null;
    }

   

    @Override
    public void SePresenter() {
        System.out.println("Bonjour je suis un client du bar mon prenom est : "+this.prenom+" mais vous pouvez m'appeler "+this.surnom+" ma boisson favourite "+this.boissonPreferee);
    }

    @Override
    protected void PrendreUneCommande(Humain personne, Barman personne1) {
        if("homme".equals(this.sexe)){
            System.out.println("Tu m'as prit pour qui je suis pas un serveur....");
        }
        if("Femme".equals(this.sexe)){
            System.out.println("Tu m'as prit pour qui je suis pas un serveuse....");
        }
        
    }
}
