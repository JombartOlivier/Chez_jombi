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
            Histoire.constructionAleatoire(3,"Client");
            for(int i=0;i<=Histoire.client.length-1;i++){
                c1 = Histoire.client[i];
                c1.SePresenter();
            }

        
        
    }


    
}
