package chezjombi;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe Fille Serveur Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Serveur extends Humain {

    private float monnaie;
    private Commande commande;

    /**
     * Construteur de serveur
     *
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
     *
     * @param monnaie
     */
    public void setMonnaie(int monnaie) {
        this.monnaie = monnaie;
    }

    /**
     * Méthode permettant à un personnage de type Serveur de parler
     *
     * @param personne
     * @param phrase
     */
    @Override
    public void parler(Humain personne, String phrase) {
        System.out.println(this.prenom + " dit à " + personne.prenom + " : " + phrase);
    }

    /**
     * méthode bloquant l'action offrir un verre a un personnage de type Serveur
     *
     * @param boisson
     * @param personne
     */
    @Override
    public void offrirUnVerre(Commande boisson, Humain personne) {
        String str;
        if ("Homme".equals(this.sexe)) {
            str = "Je ne suis qu'un serveur, je peux pas vous offrir un verre";
            parler(personne, str);
        }
        if ("Femme".equals(this.sexe)) {
            str = "Je ne suis qu'une serveuse, je peux pas vous offrir un verre";
            parler(personne, str);
        }
    }

    /**
     * Méthode permettant d'apporter une boisson à un personnage
     *
     * @param personne
     */
    @Override
    public void apporterBoisson(Humain personne) {

        System.out.println("Voici votre boisson, cela fera " + this.boissonDe.getPrix() + "€");
        personne.maBoisson = this.boissonDe;
        this.boissonDe = null;

    }

    /**
     * Méthode permettant de prendre une commande
     *
     * @param personne
     * @param personne1
     */
    @Override
    public void prendreCommande(Humain personne, Barman personne1) {
        float prix;
        Scanner sc = new Scanner(System.in);
        String str = "Souhaitez vous boire votre boisson préferée ou voulez vous la composer vous-même ?";
        this.parler(personne, str);
        str = "-> Boisson préferée [1]";
        System.out.println(str);
        str = "-> Composer sois-même [2]";
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
            str = "Quel est le nom de votre boisson ?";
            this.parler(personne, str);
            str = sc.nextLine();
            personne1.setNomBoisson(str);
            str = "Votre boisson est elle alcoolisée ?";
            this.parler(personne, str);
            str = "Oui [1]";
            System.out.println(str);
            str = "Non [2]";
            System.out.println(str);
            while (!("1".equals(str) || "2".equals(str))) {
                str = sc.nextLine();
            }
            if ("1".equals(str)) {
                personne1.setAlcoolise(true);
                str = "Quel est le degré d'alcool de votre boisson ? attention plus le degres d'alcool est fort plus le prix est élevée";
                this.parler(personne, str);
                str = sc.nextLine();
                int degreedalcool = Integer.parseInt(str);
                personne1.setDegresDalcool(degreedalcool);
                prix = degreedalcool * (float) 1.25;
                str = "En resumer nous avons un " + personne1.getNomBoisson() + " Alcoolisée avec un degres d'acool a " + personne1.getDegresDalcool() + " Au prix de " + prix;
                this.parler(personne, str);
            } else {
                personne1.setAlcoolise(false);
                prix = (float) 3.5;
                str = "En resumer nous avons un " + personne1.getNomBoisson() + " non alcoolisée au prix de " + prix;
                this.parler(personne, str);
            }
        }
        str = "Je vous rapporte ça tout de suite";
        this.parler(personne, str);
    }

    /**
     * Methode permettant à un personnage de type Serveur de se presenter
     */
    @Override
    public void sePresenter() {
        if ("Homme".equals(this.sexe)) {
            System.out.println("Bonjour je suis votre serveur, je m'appelle " + this.prenom);
        }
        if ("Femme".equals(this.sexe)) {
            System.out.println("Bonjour je suis votre serveuse, je m'appelle " + this.prenom);
        }
    }

    /**
     * Methode permettant à un personnage de type Serveur de boire de l'eau
     */
    @Override
    protected void boire() {
        if (this.maBoisson.isAlcoolise() == true) {
            System.out.println("Je ne peux pas boire de boisson alcoolisée");
        } else {
            super.boire();
        }
    }

    /**
     * Méthode pour transmettre l'argent au barman dans la caisse
     *
     * @param personne
     */
    protected void transmettreArgentBarman(Barman personne) {
        String str = "Voici de l'argent à mettre dans la caisse : " + this.monnaie + "€";
        this.parler(personne, str);
        personne.setCaisse(this.monnaie);
        this.monnaie = 0;
    }

}
