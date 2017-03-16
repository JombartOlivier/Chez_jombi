/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chezjombi;

import java.util.Random;

/**
 *
 * @author Olivier
 */
public class Jeu {

    /**
     *
     * @author Olivier
     */
    public Jeu(Humain personne) {

    }

    public static int Lancer(Humain personne) {
        int point = 501;
        int nombreLancé = 1;    
        int manche = 1;
        int[] tab = new int[3];
        int i = 0;
        String joueur = personne.getPrenom();
        Random r = new Random();
        int[] tab_bonus = {2, 3, 25, 50};
        int aleatoire = 0;
        int aleatoire_2 = 0;
        int aleatoire_3 = 0;
        int aleatoire_4 = 0;
        int aleatoire_5 = 0;
        int compteur_1 = 0;
        int compteur_2 = 0;
        while (point > 0) {
            while (nombreLancé < 4) {
                aleatoire = r.nextInt(21);
                aleatoire_2 = r.nextInt(10);
                aleatoire_3=r.nextInt(11)+1;
                aleatoire_4 = r.nextInt(2);
                aleatoire_5 = r.nextInt(17) + 15;
                if (manche > aleatoire_5) {
                    aleatoire = aleatoire_4;
                    System.out.println("Lancé [" + nombreLancé + "] = " + aleatoire);
                } else if (aleatoire_3==5) {
                    aleatoire_3 = r.nextInt(3);
                    if (aleatoire_3 == 0 || aleatoire_3 == 1) {
                        aleatoire *= tab_bonus[aleatoire_3];
                        System.out.println("Lancé [" + nombreLancé + "] = " + aleatoire + " C'est un double ou triple");
                        compteur_1++;
                    } else {
                        aleatoire = tab_bonus[aleatoire_3];
                        System.out.println("Lancé [" + nombreLancé + "] = " + aleatoire + "Un beau lancé dit donc !");
                        compteur_2++;
                    }
                } else {
                    System.out.println("Lancé [" + nombreLancé + "] = " + aleatoire);
                }
                tab[i] = aleatoire;

                if (aleatoire > point) {
                    System.out.println("loupé, on change de manche");
                    point += tab[0] + tab[1] + tab[2];
                    nombreLancé = 3;
                }
                point = point - aleatoire;
                nombreLancé++;
                i++;
            }
            i = 0;
            tab[0] = 0;
            tab[1] = 0;
            tab[2] = 0;
            nombreLancé = 1;
            System.out.println("Ton score à la manche [" + manche + "] = " + point + "\n");
            manche++;
        }
        if (manche <= 25) {
            System.out.println("Tu as finit en " + manche + " manches\nTu es plutôt bon toi! ");

        } else {
            System.out.println("Tu as finit en " + manche + " manches\nTu peux largement mieux faire... ");
        }
        System.out.println("Lancé double et triple : " + compteur_1 + "\nLancé 25 et 50 : " + compteur_2);
        
        return manche;
    }

    public static void Duel(Humain joueur1,Humain joueur2){
        int mancheJoueur1=Lancer(joueur1);
        int mancheJoueur2=Lancer(joueur2);
        if (mancheJoueur1>mancheJoueur2){
            System.out.println("Le gagnant de cette partie est : "+joueur2.prenom);
        }
        if (mancheJoueur1<mancheJoueur2){
            System.out.println("Le gagnant de cette partie est :"+joueur1.prenom);
        }
        if(mancheJoueur1==mancheJoueur2) {
            System.out.println("Egalité !");
        }
    }
}

