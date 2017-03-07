package chezjombi;

//import java.math.MathContext;
/**
 * Classe Fille Serveur Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Serveur extends Humain {

    public Serveur(String prenom, String sexe, int tailleBiceps) {
        super(prenom, sexe, tailleBiceps);
    }

    /**
     *
     * @param personne
     * @param phrase
     */
    @Override
    public void Parler(Humain personne, String phrase) {
        System.out.println(this.prenom + " dit a " + personne.prenom + phrase);
    }

    /**
     *
     * @param boisson
     * @param personne
     */
    @Override
    protected void OffrirUnVerre(Order boisson, Humain personne) {
        String str;
        if ("Homme".equals(this.sexe)) {
            str = "je ne suis qu'un serveur je peux pas vous offrire un verre";
            Parler(personne, str);
        }
        if ("Femme".equals(this.sexe)) {
            str = "je ne suis qu'une serveuse je peux pas vous offrire un verre";
            Parler(personne, str);
        }
    }

    @Override
    protected void ApporterBoisson(Humain personne) {

        System.out.println("Voici votre boisson cela fera" + this.boissonDe.getPrix());
        personne.maBoisson = this.boissonDe;
        personne.maBoisson.proprieteDe = personne;
        this.boissonDe = null;

    }

    @Override
    protected void PrendreUneCommande(Order boisson) {

    }

    @Override
    public void SePresenter() {
        if ("Homme".equals(this.sexe)) {
            System.out.println("Bonjour je suis votre serveur je m'appelle " + this.prenom);
        }
    }

    @Override
    protected void Boire() {
        if (this.maBoisson.isAlcoolise() == true) {
            System.out.println("Je ne peut pas boire de boisson alcoolisée");
        } else {
            super.Boire();
        }
    }

}


