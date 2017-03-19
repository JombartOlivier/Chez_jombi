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
        Order o1=new Order("Chouffe",(float)4.0,true,14) ;                                               //String nom, float prix, boolean alcoolise, float tauxAlcool
        Order o2=new Order("Rince",(float)3.0,true,15);
        Humain joueur1=new Client("Olivier","Jombart",o1,"Homme",500);                  // String prenom, String surnom, Order boissonPreferee,String sexe, int argent
        Humain joueur2=new Client("Arthur","Dudu",o2,"Homme",300);
        Humain joueur3=new Serveur("Cam","Femme");
        joueur3.setMaBoisson(o2);
        try{
         joueur3.Boire();   
        }catch(NullPointerException e){
            System.out.println("Vous n'avez pas de boisson");
        }
        System.out.println("Je suis passe a autre chose");
        
        
    }


    
}
