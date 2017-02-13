
package chezjombi;

/**
 * Classe Fille Client
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Client extends Humain {
    
    private String boissonFavorite;
    private String boissonSecours;
    private float degreAlcoolemie;
    private float personnalite;
    
    public Client(String pPrenom, String pSurnom, float pPorteMonaie, int pCotePopularite, String pCrieSignificatif,String pBoissonFavorite,String pBoissonSecours,float pDegreAlcoolemie,float pPersonnalite) {
        super(pPrenom, pSurnom, pPorteMonaie, pCotePopularite,  pCrieSignificatif);
        this.boissonFavorite=pBoissonFavorite;
        this.boissonSecours=pBoissonSecours;
        this.degreAlcoolemie=pDegreAlcoolemie;
        this.personnalite=pPersonnalite;
      }
    
     @Override
    public String toString() {
        //return "Je suis un client, mon prénom est : "+this.prenom+".\nJ'ai comme surnom : "+this.surnom+".\nJe dispose de : "+this.porteMonnaie+" € pour boire.\nMa cote de popularite est de : "+cotePopularite+"\nMon crie est : "+crieSignificatif+".";
        return "je bois " + this.boissonFavorite+"je bois au cas où" + this.boissonSecours+"mon degré"+this.degreAlcoolemie+"ma perso"+this.personnalite;
    }
    
}
