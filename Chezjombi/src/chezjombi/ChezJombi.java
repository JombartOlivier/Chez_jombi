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
        Boisson bierre = new Boisson("bierre", 100, 10, true, 2);
        Boisson bierre1 = new Boisson("bierre", 100, 10, true, 2);
        olivier.setVerre(bierre);
        Humain arthur = new Humain("Arthur","Tuture",200,20,"HAAAA");
        System.out.println(arthur);
        
        olivier.OffrireUnVerre(arthur);
        System.out.println(bierre == bierre1);
        
    }
    
}
