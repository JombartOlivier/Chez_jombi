
package chezjombi;

/**
 * Classe Fille Patron
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */

public class Patron extends Humain {

    public Patron(String prenom, Order boissonPreferee, Order boissonSecours, String sexe, int tailleBiceps, int agilite, int charme) {
        super(prenom, boissonPreferee, boissonSecours, sexe, tailleBiceps, agilite, charme);
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
