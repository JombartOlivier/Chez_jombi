package chezjombi;

/**
 * Classe Mère Humain
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Humain implements ActionCommune {

    protected String prenom;
    protected String surnom;
    protected Commande boissonPreferee;
    protected String sexe;
    protected int tailleBiceps;
    protected int agilite;
    protected int charme;
    protected float degreeAlcoolemie;
    protected float argent;
    protected Commande boissonDe;
    protected Commande maBoisson;

    /**
     * Construteur destiné à la classe Client
     *
     * @param prenom
     * @param surnom
     * @param boissonPreferee
     * @param sexe
     */
    public Humain(String prenom, String surnom, Commande boissonPreferee, String sexe) {

        this.prenom = prenom;
        this.surnom = surnom;
        this.boissonPreferee = boissonPreferee;
        this.sexe = sexe;
    }

    /**
     * Construteur destiné à la classe Serveur
     *
     * @param prenom
     * @param sexe
     */
    public Humain(String prenom, String sexe) {
        this.prenom = prenom;
        this.sexe = sexe;
    }

    /**
     * Construteur destiné à la classe Barman
     *
     * @param prenom
     * @param surnom
     * @param boissonPreferee
     * @param sexe
     * @param tailleBiceps
     * @param charme
     */
    public Humain(String prenom, String surnom, Commande boissonPreferee, String sexe, int tailleBiceps, int charme) {
        this.prenom = prenom;
        this.surnom = surnom;
        this.boissonPreferee = boissonPreferee;
        this.sexe = sexe;
        this.tailleBiceps = tailleBiceps;
        this.charme = charme;
    }

    /**
     * Construteur destiné à la classe Patron
     *
     * @param prenom
     * @param boissonPreferee
     * @param sexe
     */
    public Humain(String prenom, Commande boissonPreferee, String sexe) {
        this.prenom = prenom;
        this.boissonPreferee = boissonPreferee;
        this.sexe = sexe;
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

    public Commande getBoissonPreferee() {
        return boissonPreferee;
    }

    public void setBoissonPreferee(Commande boissonPreferee) {
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

    public float getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public Commande getBoissonDe() {
        return boissonDe;
    }

    public void setBoissonDe(Commande boissonDe) {
        this.boissonDe = boissonDe;
    }

    public Commande getMaBoisson() {
        return maBoisson;
    }

    public void setMaBoisson(Commande maBoisson) {
        this.maBoisson = maBoisson;
    }

    /**
     * Methode pour se battre
     *
     * @param personne
     */
    protected void seBattre(Humain personne) {

        if (this.tailleBiceps < personne.tailleBiceps) {
            System.out.println("Aie j'ai mal ça fait mal !");
            System.out.println("Vous avez perdu !");
        } else if (this.tailleBiceps == personne.tailleBiceps) {
            System.out.println("ça pique !");
            System.out.println("Vous êtes à égalité !");
        } else {
            System.out.println("This is a Spartan !!!!!!!!!!!");
            System.out.println("Vous remportez la victoire !");
        }

    }

    /**
     * Méthode permettant aux differents personnages de boire en cas de boisson
     * alcoolisée et augmente le taux d'alcoolmie.
     */
    protected void boire() {
        if (this.maBoisson == null) {
            System.out.println("Je n'ai pas de boisson, il m'en faut vite une");
        } else {
            int quantite = this.maBoisson.getQuantite();
            this.maBoisson.setQuantite(quantite - 25);
            System.out.println("*Glou Glou Glou* Il me reste " + this.maBoisson.getQuantite() + "% de ma boisson.");
            if (this.maBoisson.getTauxAlcool() != -1) {
                this.degreeAlcoolemie = this.degreeAlcoolemie + this.maBoisson.getTauxAlcool();
            }
            if (this.maBoisson.getQuantite() == 0) {
                this.maBoisson = null;
            }
        }

    }

    /**
     * Méthode permettant aux differents personnages d'aller aux toillettes en
     * cas de degré d'alcoolémie >25, baisse le degré d'alcoolémie de 25.
     */
    protected void allerAuWC() {

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
     * Méthode pour payer
     *
     * @param prix
     */
    protected void payer(float prix) {

        if (this.argent - prix < 0) {
            System.out.println("Je n'ai pas d'argent.");
        } else {
            System.out.println("Tenez");
            this.argent = this.argent - prix;
        }
    }

    @Override
    public void commander(Serveur serv1, Barman bar1) {

    }

    @Override
    public void parler(Humain personne, String phrase) {

    }

    @Override
    public void offrirUnVerre(Commande boisson, Humain personne) {

    }

    @Override
    public void apporterBoisson(Humain personne) {

    }

    @Override
    public void prendreCommande(Humain personne, Barman personne1) {

    }

    @Override
    public void sePresenter() {

    }

}
