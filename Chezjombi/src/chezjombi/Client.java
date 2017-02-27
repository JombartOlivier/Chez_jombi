package chezjombi;

import java.util.Scanner;

/**
 * Classe Fille Client Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
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
    public Client(String pPrenom, String pSurnom, float pPorteMonaie, int pCotePopularite, String pCrieSignificatif, String pBoissonFavorite, String pBoissonSecours, float pDegreAlcoolemie, String pPersonnalite) {
        super(pPrenom, pSurnom, pPorteMonaie, pCotePopularite, pCrieSignificatif);
        this.boissonFavorite = pBoissonFavorite;
        this.boissonSecours = pBoissonSecours;
        this.degreAlcoolemie = pDegreAlcoolemie;
        this.personnalite = pPersonnalite;
    }

    @Override
    public String toString() {
        return "Je suis un client, mon prénom est : " + this.prenom + ".\nJ'ai comme surnom : " + this.surnom + ".\nJe dispose de : " + this.porteMonnaie + " € pour boire.\nMa cote de popularite est de : " + cotePopularite + "\nMon crie est : " + crieSignificatif + ".\nJe bois : " + this.boissonFavorite + ".\nJe bois au cas où : " + this.boissonSecours + ".\nMon degré : " + this.degreAlcoolemie + "\nMa personnalité : " + this.personnalite + ".";
        //return 
    }

    @Override
    public void Presentation() {

    }

    @Override
    public String Sexe() {
        return "1";
    }

    @Override
    void TalkTo(Humain personne, String talk) {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.prenom + " say to " + personne.prenom + " : " + talk);
        if (personne.prenom == "serveur") {
            System.out.println(personne.prenom + " say to " + this.prenom + " : " + " Hello " + this.prenom + ", what do you want ?");
            System.out.println("\t\tYou want :\n\t\t (1) Drink your favorite drink ? \n\t\t (2) Drink an other Drink ?\n\t\t ");
            int proposition = sc.nextInt();
            
            switch (proposition) {
                case 1:
                    System.out.println("Ok so you want " + this.boissonFavorite);
                    break;
                case 2:
                    System.out.println("Ok");
                    break;
                default:
                    System.out.println("Pardon ?");
            }

        }

    }

}
