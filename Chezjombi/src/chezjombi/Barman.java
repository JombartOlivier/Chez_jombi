package chezjombi;

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

    public Barman(String prenom, String surnom, Order boissonPreferee, String sexe, int tailleBiceps, int charme) {
        super(prenom, surnom, boissonPreferee, sexe, tailleBiceps, charme);

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

    protected void PreparerUneBoisson() {
        if (this.alcoolise == true) {
            float prix = this.degresDalcool * (float) 1.2;
            Order b1 = new Order(this.nomBoisson, prix, this.alcoolise, this.degresDalcool);

        }
        if (this.alcoolise == false) {
            Order b1 = new Order(this.nomBoisson, 3, this.alcoolise, this.degresDalcool);
        }

    }

    @Override
    protected void Parler(Humain personne, String phrase) {
        if (this.degreeAlcoolemie < 5 && this.degreeAlcoolemie > 0) {
            System.out.println(this.prenom + " dit a " + personne.prenom + " : " + phrase + " Fraté ");
        }
        if (this.degreeAlcoolemie > 15) {
            System.out.println(this.prenom + " dit a " + personne.prenom + " : " + "LALALALA");
        }
    }

    @Override
    protected void OffrirUnVerre(Order boisson, Humain personne) {
        String str = "Desoler je ne suis pas autorisée à offrire de verre il faut voire ça avec le maitre des lieux";
        this.Parler(personne, str);

    }

    @Override
    protected void ApporterBoisson(Humain personne) {
        String str = "Desoler je ne peux pas bouger de mon bar demander à une serveur/se";
        this.Parler(personne, str);
    }

    @Override
    public void SePresenter() {
        if ("Homme".equals(this.sexe)) {
            System.out.println("Hello, je suis le Barman C'est moi qui prepare toute les boissons je m'appelle " + this.prenom + " et ma boisson preferer est " + this.boissonPreferee);
        }
        if ("Femme".equals(this.sexe)) {
            System.out.println("Hello, je suis le Barwoman (si si ça se dit) C'est moi qui prepare toute les boissons je m'appelle " + this.prenom + " et ma boisson preferer est " + this.boissonPreferee);
        }
    }

    @Override
    protected void PrendreUneCommande(Humain personne, Barman personne1) {

    }

}
