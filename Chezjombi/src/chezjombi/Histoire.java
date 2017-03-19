/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chezjombi;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Histoire {

    private static String classe;
    private static String nom;

    public static void jeu() {

    }

    public static void creationPersonnage() {
        System.out.println("Quel classe de personnage souhaité vous jouer ?");
        System.out.println("Client  [1]");
        System.out.println("Serveur [2]");
        System.out.println("Barman  [3]");
        System.out.println("Patron  [4]");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrée le numeros de votre classe");
        classe = "0";
        while ("0".equals(classe)) {
            classe = sc.nextLine();
            switch (classe) {
                case "1":
                    classe = "Client";
                    break;
                case "2":
                    classe = "Serveur";
                    break;
                case "3":
                    classe = "Barman";
                    break;
                case "4":
                    classe = "Patron";
                    break;
                default:
                    System.out.println("le numeros est incorrect");
            }
        }
        System.out.println("Vous avez choisie la classe " + classe);
        switch(classe){
            case "Client":
                
                break;
                
        }

    }
}
