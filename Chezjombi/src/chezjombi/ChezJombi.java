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

        /*Client c1;
        Serveur s1;
        Barman b1;
        Patron p1;
        Humain h1;
        //Jeu.notice();
        Histoire.constructionAleatoire(20, "Client");
        Histoire.constructionAleatoire(5, "Serveur");
        Histoire.constructionAleatoire(1, "Patron");
        Histoire.constructionAleatoire(1, "Barman");

        for (int i = 0; i <= 3; i++) {
            c1 = Histoire.client[i];
            s1 = Histoire.serveur[i];
            c1.sePresenter();
            s1.sePresenter();

        }
        b1 = Histoire.barman[0];
        p1 = Histoire.patron[0];
        b1.sePresenter();
        p1.sePresenter();
        h1 = Histoire.choixPersonneInteraction();
        //Histoire.jeu();
        //c1.sePresenter();
*/
        Histoire.jeu();
    }

}
