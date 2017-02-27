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
        Serveur serv1 = new Serveur("A","B",10,20,"Haa",10,10);
        //serv1.Presentation();
        Serveur serv2 = new Serveur("C","B",10,20,"Haa",20,10);
        Order bierre = new Order("bierre",10, true, 2);
        Client C1 = new Client("Arthur", "duy", 100,10 ,"Haha", "triple","triple blond",0,"Sympa");
        serv1.setVerre(bierre);
        //System.out.println(serv1.getPorteMonnaie());
        //serv1.TalkTo(C1,"test");
        serv1.BringAdrink(C1);
        System.out.println(C1.getVerre());
        System.out.println(bierre.getQuantite());
        C1.Drink(bierre);
        System.out.println(bierre.getQuantite());
        C1.FinishADrink(bierre);
        System.out.println(bierre.getQuantite());
       
    }

    
}
