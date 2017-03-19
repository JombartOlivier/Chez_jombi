
package chezjombi;

import java.util.Scanner;

/**
 * Classe Fille Patron
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */

public class Patron extends Humain implements ActionCommune{

    public Patron(String prenom, Order boissonPreferee, String sexe, int tailleBiceps, int agilite, int charme) {
        super(prenom, boissonPreferee, sexe, tailleBiceps, agilite, charme);
    }
    

    
    public void Parler(Humain personne, String phrase) {
        if(this.degreeAlcoolemie<5 && this.degreeAlcoolemie>0){
             System.out.println(this.prenom + " dit a " + personne.prenom + " : "+ phrase +"Oublie pas c'est moi le patron.");
        }
        if(this.degreeAlcoolemie<10 && this.degreeAlcoolemie>5){
            System.out.println(this.prenom + " dit a " + personne.prenom + " : "+ phrase + "Oublie pas c'est moi le bosse.");
        }
        if(this.degreeAlcoolemie<15 && this.degreeAlcoolemie>10){
            System.out.println(this.prenom + " dit a " + personne.prenom + " : " + phrase+" I am the king.");
        }
        if(this.degreeAlcoolemie>15){
            System.out.println(this.prenom + " dit a " + personne.prenom + " : "+ "LALALALA");
        }
    }

    
    public void OffrirUnVerre(Order boisson, Humain personne) {
        
        String str = "c'est la maison qui offre";
        this.Parler(personne, str);
        personne.maBoisson = boisson;
        
    }

    
    public void ApporterBoisson(Humain personne) {
        System.out.println("Tu m'as prit pour ton chien ? ");
    }

 

    
    public void SePresenter() {
        
        if ("Homme".equals(this.sexe)) {
            System.out.println("Bonjour je suis le patron du bar c'est moi qui dirige mon nom est "+this.prenom+" et ma boisson preferer est "+this.boissonPreferee);
        }
        if ("Femme".equals(this.sexe)) {
            System.out.println("Bonjour je suis la patronne du bar c'est moi qui dirige mon nom est "+this.prenom+" et ma boisson preferer est "+this.boissonPreferee);
        }
    }

    
    public void PrendreUneCommande(Humain personne, Barman personne1) {
        Scanner sc = new Scanner(System.in);
        String str = "Bonjour je vais personnellement m'occupe de vous aujourd'hui attention sa ne se produit pas tout les jours. que voulais vous boire ?";
        this.Parler(personne, str);
        str = "boisson preferer [1]";
        System.out.println(str);
        str = "composer sois meme [2]";
        System.out.println(str);
        str = "0";
        while (!("1".equals(str) || "2".equals(str))) {
            str = sc.nextLine();
        }
        if ("1".equals(str)) {
            System.out.println("Vous avez choisi votre boisson preferé");
            personne1.setNomBoisson(personne.boissonPreferee.getNom());
            personne1.setDegresDalcool(personne.boissonPreferee.getTauxAlcool());
            personne1.setAlcoolise(personne.boissonPreferee.isAlcoolise());
        }
        if ("2".equals(str)) {
            System.out.println("Vous avez choisi de faire votre boisson vous meme");
            str = "Quel est le nom de ta bibine ?";
            this.Parler(personne, str);
            str = sc.nextLine();
            personne1.setNomBoisson(str);
            str = "on picole aujourd'hui ou pas ?";
            this.Parler(personne, str);
            str = "oui [1]";
            System.out.println(str);
            str = "non [2]";
            System.out.println(str);
            while (!("1".equals(str) || "2".equals(str))) {
                str = sc.nextLine();
            }
            if ("1".equals(str)) {
                personne1.setAlcoolise(true);
                str = "aller faut pas ta filliette";
                this.Parler(personne, str);
                str = sc.nextLine();
                int degreedalcool = Integer.parseInt(str);
                personne1.setDegresDalcool(degreedalcool);
            } 
            else {
                personne1.setAlcoolise(false);
            }
        }
        str = "Je fait apporter ça tout de suite";
        this.Parler(personne, str);
    }
  
    
}
