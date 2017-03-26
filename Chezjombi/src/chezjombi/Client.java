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

    /**
     * Construteur de la classe client
     *
     * @param prenom
     * @param surnom
     * @param boissonPreferee
     * @param sexe
     */
    public Client(String prenom, String surnom, Commande boissonPreferee, String sexe) {
        super(prenom, surnom, boissonPreferee, sexe);
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
        this.argent = aleatoire;
    }

    /**
     * Methode attribuant la parole à un personnage de type client en fonction
     * de leur taux d'alccolmie
     *
     * @param personne
     * @param phrase
     */
    @Override
    public void parler(Humain personne, String phrase) {
        if (this.degreeAlcoolemie < 5 && this.degreeAlcoolemie >= 0) {
            System.out.println(this.prenom + " dit à " + personne.prenom + " : " + phrase);
        }
        if (this.degreeAlcoolemie <= 10 && this.degreeAlcoolemie > 5) {
            System.out.println(this.prenom + " dit à " + personne.prenom + " : " + phrase + "Hip");
        }
        if (this.degreeAlcoolemie <= 15 && this.degreeAlcoolemie > 10) {
            System.out.println(this.prenom + " dit à " + personne.prenom + " : " + personne.prenom + phrase);
        }
        if (this.degreeAlcoolemie > 15) {
            System.out.println(this.prenom + " dit à " + personne.prenom + " : " + "LALALALA");
        }

    }

    /**
     * Méthode permettant d'offrir un verre
     *
     * @param boisson
     * @param personne
     */
    @Override
    public void offrirUnVerre(Commande boisson, Humain personne) {

        String str = "Allez, celle ci est pour moi";
        this.parler(personne, str);
        personne.maBoisson = boisson;
        this.payer((int) boisson.getPrix());

    }

    /**
     * Méthode permettant d'apporter un boisson
     *
     * @param personne
     */
    @Override
    public void apporterBoisson(Humain personne) {

        System.out.println("Voici ta boisson voulu : " + this.boissonDe.getPrix());
        personne.maBoisson = this.boissonDe;
        this.boissonDe = null;
    }

    /**
     * Méthode permettant à un client de se presenter.
     */
    @Override
    public void sePresenter() {
        System.out.println("Bonjour, je suis un client du bar. Mon prenom est : " + this.prenom + " mais vous pouvez m'appeler " + this.surnom + ", ma boisson favorite est " + this.boissonPreferee);
    }

    /**
     * Methode permettant d'apporter une commande
     *
     * @param personne
     * @param personne1
     */
    @Override
    public void prendreCommande(Humain personne, Barman personne1) {
        if ("Homme".equals(this.sexe)) {
            System.out.println("Tu m'as pris pour qui ? Je ne suis pas un serveur...");
        }
        if ("Femme".equals(this.sexe)) {
            System.out.println("Tu m'as prise pour qui ? Je ne suis pas un serveuse...");
        }

    }

    /**
     * Méthode permettant à un personnage de type Client de commander
     *
     * @param serv1
     * @param bar1
     */
    @Override
    public void commander(Serveur serv1, Barman bar1) {
        serv1.prendreCommande(this, bar1);
        this.maBoisson = bar1.preparerUneBoisson();
        String str = "Voici votre boisson cela fera un total de " + maBoisson.getPrix();
        serv1.parler(this, str);
        this.payer(maBoisson.getPrix());
        bar1.setCaisse(maBoisson.getPrix() + bar1.getCaisse());
    }
}
