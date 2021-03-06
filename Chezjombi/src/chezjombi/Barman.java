package chezjombi;

import java.util.Random;

/**
 * Classe Fille Barman Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Barman extends Humain {

    private float caisse;
    private String nomBoisson;
    private boolean alcoolise;
    private float degresDalcool;

    /**
     * Construteur de la classe Barman
     *
     * @param prenom
     * @param surnom
     * @param boissonPreferee
     * @param sexe
     */
    public Barman(String prenom, String surnom, Commande boissonPreferee, String sexe) {
        super(prenom, surnom, boissonPreferee, sexe);
        Random r = new Random();
        int aleatoire = r.nextInt(101);
        this.charme = aleatoire;
        aleatoire = r.nextInt(101);
        this.tailleBiceps = aleatoire;

    }

    public String getNomBoisson() {
        return nomBoisson;
    }

    public void setNomBoisson(String nomBoisson) {
        this.nomBoisson = nomBoisson;
    }

    public boolean isAlcoolise() {
        return alcoolise;
    }

    public void setAlcoolise(boolean alcoolise) {
        this.alcoolise = alcoolise;
    }

    public float getDegresDalcool() {
        return degresDalcool;
    }

    public void setDegresDalcool(float degresDalcool) {
        this.degresDalcool = degresDalcool;
    }

    public float getCaisse() {
        return caisse;
    }

    public void setCaisse(float caisse) {
        this.caisse = caisse;
    }

    /**
     * Méthode permettant de preparer une boisson
     *
     * @return Une boisson de type Commande
     */
    protected Commande preparerUneBoisson() {
        Commande boisson;
        if (this.alcoolise == true) {

            Commande b1 = new Commande(this.nomBoisson, this.alcoolise, this.degresDalcool);
            b1.calculPrix();
            boisson = b1;

        } else {
            Commande b1 = new Commande(this.nomBoisson, this.alcoolise, this.degresDalcool);
            b1.calculPrix();
            boisson = b1;

        }
        return boisson;
    }

    /**
     * Méthode permettant de faire parler un personnage de type Barman
     *
     * @param personne
     * @param phrase
     */
    @Override
    public void parler(Humain personne, String phrase) {
        if (this.degreeAlcoolemie < 5 && this.degreeAlcoolemie > 0) {
            System.out.println(this.prenom + " dit a " + personne.prenom + " : " + phrase + " Fraté ");
        }
        if (this.degreeAlcoolemie > 15) {
            System.out.println(this.prenom + " dit a " + personne.prenom + " : " + "LALALALA");
        }
    }

    /**
     * Méthode bloquant la possibilite d'offrir un verre
     *
     * @param boisson
     * @param personne
     */
    @Override
    public void offrirUnVerre(Commande boisson, Humain personne) {
        String str = "Desolé, je ne suis pas autorisé à offrir de verre. Il faut voir ça avec le patron";
        this.parler(personne, str);

    }

    /**
     * Méthode bloquant la possibilite d'apporter une boisson
     *
     * @param personne
     */
    @Override
    public void apporterBoisson(Humain personne) {
        String str = "Desolé, je ne peux pas bouger de mon bar. Demander à une serveur/se";
        this.parler(personne, str);
    }

    /**
     * Méthode permettant au personnage de type Barman de se presenter
     */
    @Override
    public void sePresenter() {
        if ("Homme".equals(this.sexe)) {
            System.out.println("Hello, je suis le Barman. C'est moi qui prépare toutes les boissons je m'appelle " + this.prenom + " et ma boisson preferée est " + this.boissonPreferee);
        }
        if ("Femme".equals(this.sexe)) {
            System.out.println("Hello, je suis le Barwoman (si si ça se dit). C'est moi qui prépare toutes les boissons je m'appelle " + this.prenom + " et ma boisson preferer est " + this.boissonPreferee);
        }
    }

    /**
     * Méthode bloquant la prise de commande
     *
     * @param personne
     * @param personne1
     */
    @Override
    public void prendreCommande(Humain personne, Barman personne1) {

    }

}
