
package chezjombi;

/**
 * Classe Fille Barman
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Barman extends Humain {
    
    private float caisse;
    private Order BoissonApreparer;
    private String nomBoisson;
    private boolean alcoolise;
    private int degresDalcool;

    public Barman(String prenom, String surnom,Order boissonPreferee, String sexe, int tailleBiceps, int charme) {
        super(prenom, surnom, boissonPreferee, sexe, tailleBiceps, charme);//Humain(String prenom, String surnom, Order boissonPreferee, String sexe, int tailleBiceps, int charme) {
        
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

    public int getDegresDalcool() {
        return degresDalcool;
    }

    public void setDegresDalcool(int degresDalcool) {
        this.degresDalcool = degresDalcool;
    }

    public Order getBoissonApreparer() {
        return BoissonApreparer;
    }

    public void setBoissonApreparer(Order BoissonApreparer) {
        this.BoissonApreparer = BoissonApreparer;
    }
    
    

    public float getCaisse() {
        return caisse;
    }

    public void setCaisse(float caisse) {
        this.caisse = caisse;
    }
    

    
    public void Presentation(){
        
    }
   


    @Override
    protected void Parler(Humain personne, String phrase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void OffrirUnVerre(Order boisson, Humain personne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void ApporterBoisson(Humain personne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public void SePresenter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    protected void PrendreUneCommande(Humain personne, Barman personne1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
