package chezjombi;

import java.util.Random;
import java.util.Scanner;

//import java.math.MathContext;
/**
 * Classe Fille Serveur Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Serveur extends Humain {

    private float monnaie;
    private Order commande;
/**
 * Construteur de serveur
 * @param prenom
 * @param sexe 
 */
    public Serveur(String prenom, String sexe) {
        super(prenom, sexe);
        Random r = new Random();
        int aleatoire = r.nextInt(101);
        this.tailleBiceps = aleatoire;
        this.monnaie = 0;
    }
/**
 * Setteur Monnaie serveur
 * @param monnaie 
 */
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

    protected void PrendreUneCommande(Humain personne, Barman personne1) {
        Scanner sc = new Scanner(System.in);
        String str = "Souhaiter vous boire votre boisson preferer ou voulez vous la composer vous meme";
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
            personne1.setBoissonApreparer(personne.boissonPreferee);
        }
        if ("2".equals(str)) {
            System.out.println("Vous avez choisi de faire votre boisson vous meme");
            str = "Quel est le nom de votre boisson ?";
            this.Parler(personne, str);
            str = sc.nextLine();
            personne1.setNomBoisson(str);
            str = "Votre boisson est elle alcoolisée ?";
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
                str = "quel est le degrée d'acool de votre boisson";
                this.Parler(personne, str);
                str = sc.nextLine();
                int degreedalcool = Integer.parseInt(str);
                personne1.setDegresDalcool(degreedalcool);
            } 
            else {
                personne1.setAlcoolise(false);
            }
        }
        str = "Je vous rapporte ça tout de suite";
        this.Parler(personne, str);
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
     *
     * @param personne
     */
    protected void TransmettreArgentBarman(Barman personne) {
        String str = "Voici de l'argent a mettre dans la caisse " + this.monnaie;
        this.Parler(personne, str);
        personne.setCaisse(this.monnaie);
        this.monnaie = 0;
    }

}
