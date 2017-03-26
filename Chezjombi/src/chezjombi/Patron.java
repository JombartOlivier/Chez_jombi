package chezjombi;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe Fille Patron Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Patron extends Humain {

    /**
     * Construteur de la classe patron
     *
     * @param prenom
     * @param boissonPreferee
     * @param sexe
     */
    public Patron(String prenom, Commande boissonPreferee, String sexe) {
        super(prenom, boissonPreferee, sexe);
        Random r = new Random();
        int aleatoire = r.nextInt(101);
        this.charme = aleatoire;
        aleatoire = r.nextInt(101);
        this.tailleBiceps = aleatoire;
        aleatoire = r.nextInt(101);
        this.agilite = aleatoire;
        aleatoire = r.nextInt(201);
        while (aleatoire <= 25) {
            aleatoire = r.nextInt(201);
        }
        this.argent = (float) aleatoire;
    }

    /**
     * Méthode permettant au personnage de type Patron de parler
     *
     * @param personne
     * @param phrase
     */
    @Override
    public void parler(Humain personne, String phrase) {
        if (this.degreeAlcoolemie < 5 && this.degreeAlcoolemie > 0) {
            System.out.println(this.prenom + " dit à " + personne.prenom + " : " + phrase + "Oublie pas, c'est moi le paaaatroon.");
        }
        if (this.degreeAlcoolemie < 10 && this.degreeAlcoolemie > 5) {
            System.out.println(this.prenom + " dit à " + personne.prenom + " : " + phrase + "Oublie pas, c'est moi le boosse.");
        }
        if (this.degreeAlcoolemie < 15 && this.degreeAlcoolemie > 10) {
            System.out.println(this.prenom + " dit à " + personne.prenom + " : " + phrase + "I am THE king.");
        }
        if (this.degreeAlcoolemie > 15) {
            System.out.println(this.prenom + " dit à " + personne.prenom + " : " + "LALALALA");
        }
    }

    /**
     * Méthode permettant au personnage de type Patron d'offrir un verre
     *
     * @param boisson
     * @param personne
     */
    @Override
    public void offrirUnVerre(Commande boisson, Humain personne) {

        String str = "C'est la maison qui offre.";
        this.parler(personne, str);
        personne.maBoisson = boisson;

    }

    /**
     * Méthode bloquant l'action apporter une boisson
     *
     * @param personne
     */
    @Override
    public void apporterBoisson(Humain personne) {
        System.out.println("Tu m'as pris pour ton chien ? ");
    }

    /**
     * Méthode permettant au personnage de type Patron de se presenter
     */
    @Override
    public void sePresenter() {

        if ("Homme".equals(this.sexe)) {
            System.out.println("Bonjour, je suis le patron du bar et c'est moi qui dirige. Mon nom est " + this.prenom + " et ma boisson preferée est " + this.boissonPreferee);
        }
        if ("Femme".equals(this.sexe)) {
            System.out.println("Bonjour, je suis la patronne du bar et c'est moi qui dirige. Mon nom est " + this.prenom + " et ma boisson preferée est " + this.boissonPreferee);
        }
    }

    /**
     * Méthode permettant au personnage de type Patron de prendre une commande
     *
     * @param personne
     * @param personne1
     */
    @Override
    public void prendreCommande(Humain personne, Barman personne1) {
        Scanner sc = new Scanner(System.in);
        String str = "Bonjour, je vais personnellement m'occupe de vous aujourd'hui. Je suisd désolé ça ne se produira plus. Que voulez vous boire ?";
        this.parler(personne, str);
        str = "Boisson preferée [1]";
        System.out.println(str);
        str = "Composer sois-même [2]";
        System.out.println(str);
        str = "0";
        while (!("1".equals(str) || "2".equals(str))) {
            str = sc.nextLine();
        }
        if ("1".equals(str)) {
            System.out.println("Vous avez choisi votre boisson preferée");
            personne1.setNomBoisson(personne.boissonPreferee.getNom());
            personne1.setDegresDalcool(personne.boissonPreferee.getTauxAlcool());
            personne1.setAlcoolise(personne.boissonPreferee.isAlcoolise());
        }
        if ("2".equals(str)) {
            System.out.println("Vous avez choisi de faire votre boisson vous-même");
            str = "Quel est le nom de ta bibine ?";
            this.parler(personne, str);
            str = sc.nextLine();
            personne1.setNomBoisson(str);
            str = "On picole aujourd'hui ou pas ?";
            this.parler(personne, str);
            str = "oui [1]";
            System.out.println(str);
            str = "non [2]";
            System.out.println(str);
            while (!("1".equals(str) || "2".equals(str))) {
                str = sc.nextLine();
            }
            if ("1".equals(str)) {
                personne1.setAlcoolise(true);
                str = "Aller faut pas ta mauviette !";
                this.parler(personne, str);
                str = sc.nextLine();
                int degreedalcool = Integer.parseInt(str);
                personne1.setDegresDalcool(degreedalcool);
            } else {
                personne1.setAlcoolise(false);
            }
        }
        str = "Je te fais apporter ça tout de suite";
        this.parler(personne, str);
    }

}
