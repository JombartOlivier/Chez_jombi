package chezjombi;

/**
 * Classe Mere Humain Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
abstract class Humain {

    protected String prenom;
    protected String surnom;
    protected Order boissonPreferee;
    protected String sexe;
    protected int tailleBiceps;
    protected int agilite;
    protected int charme;
    protected float degreeAlcoolemie;
    protected int argent;
    protected Order boissonDe;
    protected Order maBoisson;

    /**
     * Construteur Destinée à la classe Client
     *
     * @param prenom
     * @param surnom
     * @param boissonPreferee
     * @param boissonSecours
     * @param sexe
     * @param tailleBiceps
     * @param agilite
     * @param charme
     * @param argent
     */
    public Humain(String prenom, String surnom, Order boissonPreferee, String sexe) {

        this.prenom = prenom;
        this.surnom = surnom;
        this.boissonPreferee = boissonPreferee;
        this.sexe = sexe;
    }

    /**
     * Construteur Destinée à la classe Serveur
     *
     * @param prenom
     * @param sexe
     */
    public Humain(String prenom, String sexe) {
        this.prenom = prenom;
        this.sexe = sexe;
        

    }

    /**
     * Construteur Destinée à la classe Barman
     *
     * @param prenom
     * @param surnom
     * @param boissonPreferee
     * @param sexe
     * @param tailleBiceps
     * @param charme
     */
    public Humain(String prenom, String surnom, Order boissonPreferee, String sexe, int tailleBiceps, int charme) {
        this.prenom = prenom;
        this.surnom = surnom;
        this.boissonPreferee = boissonPreferee;
        this.sexe = sexe;
        this.tailleBiceps = tailleBiceps;
        this.charme = charme;
    }

    /**
     * Construteur Destinée à la classe Patron
     *
     * @param prenom
     * @param boissonPreferee
     * @param boissonSecours
     * @param sexe
     * @param tailleBiceps
     * @param agilite
     * @param charme
     */
    public Humain(String prenom, Order boissonPreferee, String sexe, int tailleBiceps, int agilite, int charme) {
        this.prenom = prenom;
        this.boissonPreferee = boissonPreferee;
        this.sexe = sexe;
        this.tailleBiceps = tailleBiceps;
        this.agilite = agilite;
        this.charme = charme;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public Order getBoissonPreferee() {
        return boissonPreferee;
    }

    public void setBoissonPreferee(Order boissonPreferee) {
        this.boissonPreferee = boissonPreferee;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getTailleBiceps() {
        return tailleBiceps;
    }

    public void setTailleBiceps(int tailleBiceps) {
        this.tailleBiceps = tailleBiceps;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getCharme() {
        return charme;
    }

    public void setCharme(int charme) {
        this.charme = charme;
    }

    public float getDegreeAlcoolemie() {
        return degreeAlcoolemie;
    }

    public void setDegreeAlcoolemie(float degreeAlcoolemie) {
        this.degreeAlcoolemie = degreeAlcoolemie;
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public Order getBoissonDe() {
        return boissonDe;
    }

    public void setBoissonDe(Order boissonDe) {
        this.boissonDe = boissonDe;
    }

    public Order getMaBoisson() {
        return maBoisson;
    }

    public void setMaBoisson(Order maBoisson) {
        this.maBoisson = maBoisson;
    }

 
    /**
     * Methode pour se battre
     *
     * @param personne
     */
    protected void SeBattre(Humain personne) {
        
        if (this.tailleBiceps < personne.tailleBiceps) {
            System.out.println("Aie j'ai mal ça fait mal");
            System.out.println("Vous avez perdu");
        }
        if (this.tailleBiceps == personne.tailleBiceps) {
            System.out.println("ça pique");
            System.out.println("Vous étes à égalité");
        } else {
            System.out.println("This is a Spartan !!!!!!!!!!!");
            System.out.println("Vous remportez la victoire");
        }

    }

    /**
     * Methode permettant au different personnage de boire en cas de boisson
     * alcooliser augmente le taux d'alcoolmie
     */
    protected void Boire() {
        int quantite = this.maBoisson.getQuantite();
        if (this.maBoisson == null) {
            System.out.println("Je n'est pas de boisson il m'en faut vite une");
        } else {
            this.maBoisson.setQuantite(quantite - 25);
            System.out.println("*Glou Glou Glou* il me reste " + this.maBoisson.getQuantite() + "% de ma boisson");
            if (this.maBoisson.getTauxAlcool() != -1) {
                this.degreeAlcoolemie = this.degreeAlcoolemie + this.maBoisson.getTauxAlcool();
            }
            if (this.maBoisson.getQuantite() == 0) {
                this.maBoisson = null;
            }
        }

    }

    /**
     * Methode permettant au different personnage d'aller au toillette en cas
     * degres d'alcoolmie >25 baisse le degree d'alcoolmie diminue de 25
     */
    protected void AllerAuWC() {

        if ("Homme".equals(this.sexe)) {
            System.out.println("Je vais pisser");
            if (this.degreeAlcoolemie > 25) {
                this.degreeAlcoolemie = this.degreeAlcoolemie - 25;
            }
        }
        if ("Femme".equals(this.sexe)) {
            System.out.println("Je vais au toilette");
            if (this.degreeAlcoolemie > 25) {
                this.degreeAlcoolemie = this.degreeAlcoolemie - 25;
            }
        }
    }

    /**
     * Methode pour payer
     *
     * @param prix
     */
    protected void Payer(int prix) {

        if (this.argent - prix < 0) {
            System.out.println("je n'ai pas d'argent");
        } else {
            System.out.println("Voila");
            this.argent = this.argent - prix;
        }
    }

}
