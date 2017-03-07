package chezjombi;

import java.util.Scanner;

/**
 * Classe Fille Client Created by Arthur Duytschaever on 13/02/2017.
 *
 * @author Olivie Jombart, Arthur Duytschaever
 * @version v1.0
 */
public class Client extends Humain {

    public Client(String prenom, String surnom, Order boissonPreferee, Order boissonSecours, String sexe, int tailleBiceps, int agilite, int charme, int argent) {
        super(prenom, surnom, boissonPreferee, boissonSecours, sexe, tailleBiceps, agilite, charme, argent);
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
