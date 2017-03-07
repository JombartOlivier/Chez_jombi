
package chezjombi;

/**
 * Classe Fille Barman
 * Created by Arthur Duytschaever on 13/02/2017.
 * @author  Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Barman extends Humain {
    
    public Barman(String prenom, String surnom, float porteMonaie, int cotePopularite, String crieSignificatif) {
        super(prenom, surnom, porteMonaie, cotePopularite, crieSignificatif);
    }
    
    
    public void Presentation(){
        
    }
   
    public String Sexe(){
        return "1";
    }
    
    void TalkTo(Humain personne,String talk){
        
    }
    
}
