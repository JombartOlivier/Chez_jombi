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

            Client c1;
            Serveur s1;
            Barman b1;
            Patron p1;
            //Jeu.notice();
            Histoire.constructionAleatoire(3, "Client");
            Histoire.constructionAleatoire(3, "Serveur");
            Histoire.constructionAleatoire(3, "Patron");
            Histoire.constructionAleatoire(3, "Barman");

            for(int i = 0; i<=3;i++){
                 c1=Histoire.client[i];
                 s1 = Histoire.serveur[i];
                 b1 = Histoire.barman[i];
                 p1 = Histoire.patron[i];
                 c1.sePresenter();
                 s1.sePresenter();
                 b1.sePresenter();
                 p1.sePresenter();
            }

                //c1.sePresenter();
            

        
        

    }


    
}
