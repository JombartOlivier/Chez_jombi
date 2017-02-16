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
        Scanner sc = new Scanner(System.in);
        Humain olivier = new Humain("Olivier","Jombart",100,10,"rrrrr");
        //System.out.println(olivier);
        Boisson bierre = new Boisson("bierre", 100, 10, true, 2);
        Boisson bierre1 = new Boisson("bierre", 100, 10, true, 2);
        olivier.setVerre(bierre);
        Humain arthur = new Humain("Arthur","Tuture",200,20,"HAAAA");
        Humain camille = new Humain("Camille","camcam",20,20,"Hihi");
        //System.out.println(arthur);
        camille.Talk("salut", arthur);
        olivier.OffrireUnVerre(arthur);
        System.out.println("voulez-vous repondre ? Yes/No");
        int var = 1;
        int compteur = 0;
        while(var != 0){
            System.out.println("voulez-vous repondre ? Yes/No");
            String st = sc.nextLine();
            if(st == "No"){
                var = 0;
            }
            if(compteur%2 == 0){
                System.out.println("que voulez-vous repondre à camille");
                st = sc.nextLine();
                arthur.Talk(st, camille);
            }
            else{
                System.out.println("que voulez-vous repondre à arthur");
                st = sc.nextLine();
                camille.Talk(st, arthur);
            }
            compteur++;
        }
    }
    
}
