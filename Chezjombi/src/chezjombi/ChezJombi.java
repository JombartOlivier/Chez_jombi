/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chezjombi;
import java.util.Scanner;

/**
 *
 * @author Olivier
 */
public class ChezJombi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Humain serv1 = new Serveur("Jombart", "Homme");
        Order boisson = new Order("bierre", 10, true,10);
        Barman bar1 = new Barman("Arthur","tuture",boisson,boisson,"homme",10,10,10,10);
        serv1.setBoissonDe(boisson);
        serv1.setMaBoisson(boisson);
        serv1.Boire();
        int agi =serv1.getTailleBiceps();
        System.out.println(agi);
        //serv1.PrendreUneCommande(serv1,bar1);
        //serv1.Boire();
    }


    
}
