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
        Humain serv1 = new Serveur("A","B",10,20,"Haa",10,10);
        //serv1.Presentation();
        Humain serv2 = new Serveur("A","B",10,20,"Haa",10,10);
        if((Serveur)serv1 == (Serveur)serv2){
            System.out.println("True");
        }
    }

    
}
