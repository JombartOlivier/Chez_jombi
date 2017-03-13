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
        Humain serv1 = new Serveur("Jombart", "Femme", 10);
        Order boisson = new Order("bierre", 10, false,5);
        serv1.setBoissonDe(boisson);
        serv1.setMaBoisson(boisson);
        serv1.Boire();
        serv1.Boire();
        serv1.Boire();
        serv1.Boire();
        //serv1.Boire();
    }


    
}
