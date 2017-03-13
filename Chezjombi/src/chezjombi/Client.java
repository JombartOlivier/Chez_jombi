package chezjombi;

import java.util.Scanner;

/**
 * Classe Fille Client Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Client extends Humain {

    public Client(String prenom, String surnom, Order boissonPreferee, Order boissonSecours, String sexe, int tailleBiceps, int agilite, int charme, int argent) {
        super(prenom, surnom, boissonPreferee, boissonSecours, sexe, tailleBiceps, agilite, charme, argent);
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
        

    }

    @Override
    protected void ApporterBoisson(Humain personne) {
        
        System.out.println("Voici ta boisson abolu : " + this.boissonDe.getPrix());
        personne.maBoisson = this.boissonDe;
        this.boissonDe = null;
    }

   

    @Override
    public void SePresenter() {
        System.out.println("Bonjour je suis un client du barre mon prenom est : "+this.prenom+" mais vous pouvez m'appeler "+this.surnom+" ma boisson favourite "+this.boissonPreferee);
    }

    @Override
    protected void PrendreUneCommande(Humain personne, Barman personne1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
