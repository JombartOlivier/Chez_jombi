
package chezjombi;

/**
 * Classe Fille Fournisseur
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Fournisseur extends Humain {

    public Fournisseur(String prenom, Order boissonPreferee, Order boissonSecours, String sexe, int tailleBiceps, int agilite, int charme) {
        super(prenom, boissonPreferee, boissonSecours, sexe, tailleBiceps, agilite, charme);
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
    protected void PrendreUneCommande(Order boisson) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SePresenter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
