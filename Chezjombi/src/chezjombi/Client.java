
package chezjombi;

/**
 * Classe Fille Client
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Client extends Humain {
    
    private final String boissonFavorite;
    private final String boissonSecours;
    private final float degreAlcoolemie;
    private final String personnalite;
    //private final String couleurTshirt;
    
    /**
     *
     * @param pPrenom
     * @param pSurnom
     * @param pPorteMonaie
     * @param pCotePopularite
     * @param pCrieSignificatif
     * @param pBoissonFavorite
     * @param pBoissonSecours
     * @param pDegreAlcoolemie
     * @param pPersonnalite
     */
    public Client(String pPrenom, String pSurnom, float pPorteMonaie, int pCotePopularite, String pCrieSignificatif,String pBoissonFavorite,String pBoissonSecours,float pDegreAlcoolemie,String pPersonnalite) {
        super(pPrenom, pSurnom, pPorteMonaie, pCotePopularite,  pCrieSignificatif);
        this.boissonFavorite=pBoissonFavorite;
        this.boissonSecours=pBoissonSecours;
        this.degreAlcoolemie=pDegreAlcoolemie;
        this.personnalite=pPersonnalite;
      }


 
     @Override
    public String toString() {
        return "Je suis un client, mon prénom est : "+this.prenom+".\nJ'ai comme surnom : "+this.surnom+".\nJe dispose de : "+this.porteMonnaie+" € pour boire.\nMa cote de popularite est de : "+cotePopularite+"\nMon crie est : "+crieSignificatif+".\nJe bois : " + this.boissonFavorite+".\nJe bois au cas où : " + this.boissonSecours+".\nMon degré : "+this.degreAlcoolemie+"\nMa personnalité : "+this.personnalite+".";
        //return 
    }
        @Override
    public void Presentation(){
        
    }
    @Override
    public String Sexe(){
        return "1";
    }
    @Override
    void TalkTo(Humain personne,String talk){
        
    }
    
    

    
}