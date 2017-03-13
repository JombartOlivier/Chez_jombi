
package chezjombi;

/**
 * Classe Fille Barman
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Barman extends Humain {
    
    private float caisse;
    

    public Barman(String prenom, String surnom, Order boissonPreferee, Order boissonSecours, String sexe, int tailleBiceps, int agilite, int charme, int argent) {
        super(prenom, surnom, boissonPreferee, boissonSecours, sexe, tailleBiceps, agilite, charme, argent);
        
    }

    public float getCaisse() {
        return caisse;
    }

    public void setCaisse(float caisse) {
        this.caisse = caisse;
    }
    

    
    public void Presentation(){
        
    }
   
    public String Sexe(){
        return "1";
    }
    
    void TalkTo(Humain personne,String talk){
        
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
    protected void PrendreUneCommande(Humain personne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
