/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chezjombi;

/**
 *
 * @author Olivier
 */
public class ChezJombi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Humain olivier = new Humain("Olivier","Jombart",100,10,"rrrrr");
        System.out.println(olivier);
        Humain arthur=new Client("Arthur","Duytschaever",1220,1,"GRAOU","Bush","Rince Cochon",12,"BADASS");
        System.out.println(arthur);
    }
    
}
