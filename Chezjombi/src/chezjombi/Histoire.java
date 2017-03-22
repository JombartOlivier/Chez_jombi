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
    private static String surnom;
    private static String sexe;
    private static String nom;
    private static Order boissonPreferer;

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
                    constructionClient();
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
                    classe = "0";
                    System.out.println("le numeros est incorrect");
            }

        }
    }
    public static void constructionClient(){
        System.out.println("Vous avez choisie la classe " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrée le nom de votre personnage");
        nom = sc.nextLine();
        System.out.println("Entrée le surnom de votre personnage");
        surnom =sc.nextLine();
        System.out.println("Quel est le sexe devotre personnage");
        System.out.println("Femme  [1]");
        System.out.println("Homme [2]");
        sexe = "0";
        while("0".equals(sexe)){
            sexe = sc.nextLine();            
        }
        if("Homme".equals(sexe)){
            sexe = "Homme";
        }
        else{
            sexe = "Femme";
        }
        boissonPreferer = generateurBoisson();
    }
    
    public static Order generateurBoisson(){
        System.out.println("Il vous faut créer votre boisson preferer");
        String nom;
        boolean alcoolisee = false;
        float degresDAlcool = 0.0f;
        Scanner sc =new Scanner(System.in);
        System.out.println("Entrée le nom de votre boisson favorite");
        nom = sc.nextLine();
        System.out.println("Votre boisson est-elle alcoolisée");
        System.out.println("Oui [1]");
        System.out.println("Non [2]");
        String str = "0";
        while("0".equals(str)){
            str = sc.nextLine();
            switch(str){
                case "1" : 
                    alcoolisee = true;
                    System.out.println("Quel est son degres d'alcool ?");
                    degresDAlcool = sc.nextFloat();
                break;
                case "2" : 
                    alcoolisee = false;
                break;
                default : 
                    str ="0";
                    System.out.println("le numeros est incorrect");     
            }
        }
        Order boisson = new Order(nom,alcoolisee,degresDAlcool);
        boisson.calculprix();
        System.out.println("Votre boisson preferée est donc " + boisson);
        return boisson;       
    }
}
