package chezjombi;

/**
 *
 * @author Arthur
 */
public interface ActionCommune {
        /**
     * Methode abstraite permettant aux differents personnages de parler
     *
     * @param personne
     * @param phrase
     */
    public void parler(Humain personne, String phrase);

    /**
     * Methode abstraite permettant aux differents personnages d'offrir à boire
     *
     * @param boisson
     * @param personne
     */
    abstract public void offrirUnVerre(Commande boisson, Humain personne);

    /**
     * Methode abstraite permettant aux differents personnages d'apporter une
     * boisson
     *
     * @param personne
     */
    abstract public void apporterBoisson(Humain personne);

    /**
     * Methode abstraite permettant aux differents personnages de prendre une
     * commande
     *
     * @param boisson
     */
    abstract public void prendreCommande(Humain personne, Barman personne1);

    /**
     * Methode abstraite permettant aux differents personnages de se présenter.
     */
    abstract public void sePresenter();
    /**
     * Methode permettant de commander une boisson
     * @param serv1
     * @param bar1 
     */
    abstract public void commander(Serveur serv1,Barman bar1);

 
}
