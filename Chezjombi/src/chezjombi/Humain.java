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
    protected Order boissonSecours;
    protected String sexe;
    protected int tailleBiceps;
    protected int agilite;
    protected int charme;
    protected float degreeAlcoolemie;
    protected int argent;
    protected Order boissonDe;
    protected Order maBoisson;
  
    
// COnstruteur Client    
    public Humain(String prenom, String surnom, Order boissonPreferee, Order boissonSecours, String sexe, int tailleBiceps, int agilite, int charme, int argent) {
        
        this.prenom = prenom;
        this.surnom = surnom;
        this.boissonPreferee = boissonPreferee;
        this.boissonSecours = boissonSecours;
        this.sexe = sexe;
        this.tailleBiceps = tailleBiceps;
        this.agilite = agilite;
        this.charme = charme;
        this.argent = argent;
    }
// construteur Serveur
    public Humain(String prenom, String sexe, int tailleBiceps) {
        this.prenom = prenom;
        this.sexe = sexe;
        this.tailleBiceps = tailleBiceps;

    }
// Construteur Barman
    public Humain(String prenom, String surnom, Order boissonPreferee, String sexe, int tailleBiceps, int charme) {
        this.prenom = prenom;
        this.surnom = surnom;
        this.boissonPreferee = boissonPreferee;
        this.sexe = sexe;
        this.tailleBiceps = tailleBiceps;
        this.charme = charme;
    }
// Construteur Patron
    public Humain(String prenom, Order boissonPreferee, Order boissonSecours, String sexe, int tailleBiceps, int agilite, int charme) {
        this.prenom = prenom;
        this.boissonPreferee = boissonPreferee;
        this.boissonSecours = boissonSecours;
        this.sexe = sexe;
        this.tailleBiceps = tailleBiceps;
        this.agilite = agilite;
        this.charme = charme;
    }
    
    
    
    abstract protected void Parler(Humain personne, String phrase);
    abstract protected void OffrirUnVerre(Order boisson,Humain personne);
    abstract protected void ApporterBoisson(Humain personne);
    abstract protected void PrendreUneCommande(Order boisson);
    abstract public void SePresenter();
    
    
   
    protected void Boire(){
        int quantite = this.maBoisson.getQuantite();
        if(this.maBoisson == null){
            System.out.println("Je n'est pas de boisson il m'n fau vite une");
        }else{
           this.maBoisson.setQuantite(quantite-25);
           System.out.println("Glou Glou Glou il me reste "+this.maBoisson.getQuantite()+"% de ma boisson");
           if(this.maBoisson.getQuantite()== 0){
               this.maBoisson = null;
           }
        }

        
    }
   
    protected void AllerAuWC(){
        
        this.degreeAlcoolemie = this.degreeAlcoolemie - 25;
        
        if("Homme".equals(this.sexe)){
            System.out.println("Je vais pisser");
        }
        if("Femme".equals(this.sexe)){
            System.out.println("Je vais au toilette");
        }
    }
    protected void Payer(int prix){

        if(this.argent - prix< 0){
            System.out.println("jen'ai pas d'argent");
        }
        else{
            System.out.println("Voila");
            this.argent = this.argent - prix;
        }
    }

    
    
}
