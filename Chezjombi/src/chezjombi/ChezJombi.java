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
        Humain serv2 = new Serveur("C","B",10,20,"Haa",20,10);
        Order bierre = new Order("bierre",100,10, true, 2);
        serv1.Order(bierre);
        System.out.println(serv1.getPorteMonnaie());
        serv2.TalkTo(serv1,"test");
    }

    
}
