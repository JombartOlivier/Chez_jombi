/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chezjombi;

/**
 *
 * @author Arthur
 */
public interface ActionCommune {
        /**
     * Methode abstraite permettant au different personnage de parler
     *
     * @param personne
     * @param phrase
     */
    public void Parler(Humain personne, String phrase);

    /**
     * Methode abstraite permettant au different personnage d'offrire boire
     *
     * @param boisson
     * @param personne
     */
    abstract public void OffrirUnVerre(Order boisson, Humain personne);

    /**
     * Methode abstraite permettant au different personnage d' apporter une
     * boisson
     *
     * @param personne
     */
    abstract public void ApporterBoisson(Humain personne);

    /**
     * Methode abstraite permettant au different personnage de prendre uneS
     * commande
     *
     * @param boisson
     */
    abstract public void PrendreUneCommande(Humain personne, Barman personne1);

    /**
     * Methode abstraite permettant au different personnage de se presenter
     */
    abstract public void SePresenter();

 
}
