package chezjombi;

import java.io.BufferedReader;
import java.util.Random;
import java.io.FileWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Classe permettant de jouer au jeu de flechette 501. Les règles sont assez
 * simple : tu commences avec un score de 501, tu as 3 lancés de flechette à
 * chaque manche. Tu déduis de ton score, le résultat de ta manche. Tu gagnes
 * quand tu arrives à 0. ATTENTION : si ton score est négatif, c'est à dire
 * différent de zéro, tu recommences ta manche. Ton agilité t'aidera peut-etre
 * dans la partie ;). Le gagnant de la partie est celui qui est arrivé à 0 avec
 * un nombre de manche le plus petit.
 *
 * @author Olivier
 */
public class Jeu {

    /**
     *
     * @author Olivier
     */
    private static int flag = 1;

    public Jeu(Humain personne) {

    }

    /**
     * Notice d'utilisation
     */
    public static void notice() {
        System.out.println("Les règles sont assez simple : tu commences avec un score de 501, \n"
                + "tu as 3 lancés de flechette à chaque manche. Tu déduis de ton score, le résultat de ta manche. Tu gagnes\n"
                + "quand tu arrives à 0. ATTENTION : si ton score est négatif, c'est à dire différent de zéro, tu recommences ta\n"
                + "manche. Ton agilité t'aidera peut-etre dans la partie ;). Le gagnant de la partie est celui qui est arrivé à 0 \n"
                + "avec un nombre de manche le plus petit.\n");
    }

    /**
     * méthode permettant lorqu'un personnage souhaite joueur de lancer sa
     * partie, toutes les actions du joeur sont écrites dans un fichier texte
     * afin d'être consultable par la suite.
     *
     * @param personne
     * @return manche
     */
    public static int lancer(Humain personne) {

        int manche = 1;
        int point = 501;
        int nombreLancé = 1;
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

        if (flag == 1) {
            File f = new File("resultat_joueur1.txt");
            try {
                f.createNewFile();
                FileWriter writer = new FileWriter(f);
                try {
                    writer.write("Tableu de score du joueur : " + joueur + "\n\n");
                    while (point > 0) {
                        while (nombreLancé < 4) {
                            aleatoire = r.nextInt(21);
                            aleatoire_2 = r.nextInt(10);
                            aleatoire_3 = r.nextInt(11) + 1;
                            aleatoire_4 = r.nextInt(2);
                            aleatoire_5 = r.nextInt(17) + 15;
                            if (manche > aleatoire_5) {
                                aleatoire = aleatoire_4;
                                writer.write("Lancé [" + nombreLancé + "] = " + aleatoire + "\n");
                            } else if (aleatoire_3 == 5) {
                                aleatoire_3 = r.nextInt(3);
                                if (aleatoire_3 == 0 || aleatoire_3 == 1) {
                                    aleatoire *= tab_bonus[aleatoire_3];
                                    writer.write("Lancé [" + nombreLancé + "] = " + aleatoire + " C'est un double ou triple\n");
                                    compteur_1++;
                                } else {
                                    aleatoire = tab_bonus[aleatoire_3];
                                    writer.write("Lancé [" + nombreLancé + "] = " + aleatoire + " Un beau lancé dit donc !\n");
                                    compteur_2++;
                                }
                            } else {
                                writer.write("Lancé [" + nombreLancé + "] = " + aleatoire + "\n");
                            }
                            tab[i] = aleatoire;

                            if (aleatoire > point) {
                                writer.write("Loupé, on change de manche.\n\n");
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
                        writer.write("Ton score à la manche [" + manche + "] = " + point + "\n\n");
                        manche++;
                    }
                    manche--;
                    if (manche <= 25) {
                        writer.write("Tu as finit en " + manche + " manches\nTu es plutôt bon toi!\n");

                    } else {
                        writer.write("Tu as finit en " + manche + " manches\nTu peux largement mieux faire...\n");
                    }
                    writer.write("Lancé double et triple : " + compteur_1 + "\nLancé 25 et 50 : " + compteur_2 + "\n");

                } finally {
                    writer.close();
                }
            } catch (Exception e) {
                System.out.println("Impossible de générer ou d'écrire dans le fichier");
            }
        }

        if (flag == 0) {
            File f2 = new File("resultat_joueur2.txt");
            try {
                f2.createNewFile();
                FileWriter writer2 = new FileWriter(f2);
                try {
                    writer2.write("Tableu de score du joueur : " + joueur + "\n\n");
                    while (point > 0) {
                        while (nombreLancé < 4) {
                            aleatoire = r.nextInt(21);
                            aleatoire_2 = r.nextInt(10);
                            aleatoire_3 = r.nextInt(11) + 1;
                            aleatoire_4 = r.nextInt(2);
                            aleatoire_5 = r.nextInt(17) + 15;
                            if (manche > aleatoire_5) {
                                aleatoire = aleatoire_4;
                                writer2.write("Lancé [" + nombreLancé + "] = " + aleatoire + "\n");
                            } else if (aleatoire_3 == 5) {
                                aleatoire_3 = r.nextInt(3);
                                if (aleatoire_3 == 0 || aleatoire_3 == 1) {
                                    aleatoire *= tab_bonus[aleatoire_3];
                                    writer2.write("Lancé [" + nombreLancé + "] = " + aleatoire + " C'est un double ou triple\n");
                                    compteur_1++;
                                } else {
                                    aleatoire = tab_bonus[aleatoire_3];
                                    writer2.write("Lancé [" + nombreLancé + "] = " + aleatoire + " Un beau lancé dit donc !\n");
                                    compteur_2++;
                                }
                            } else {
                                writer2.write("Lancé [" + nombreLancé + "] = " + aleatoire + "\n");
                            }
                            tab[i] = aleatoire;

                            if (aleatoire > point) {
                                writer2.write("Loupé, on change de manche\n");
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
                        writer2.write("Ton score à la manche [" + manche + "] = " + point + "\n\n");
                        manche++;
                    }
                    manche--;
                    if (manche <= 25) {
                        writer2.write("Tu as finit en " + manche + " manches\nTu es plutôt bon toi!\n");

                    } else {
                        writer2.write("Tu as finit en " + manche + " manches\nTu peux largement mieux faire...\n");
                    }
                    writer2.write("Lancé double et triple : " + compteur_1 + "\nLancé 25 et 50 : " + compteur_2 + "\n");

                } finally {
                    // quoiqu'il arrive, on ferme le fichier
                    writer2.close();
                }
            } catch (Exception e) {
                System.out.println("Impossible de générer ou d'écrire dans le fichier");
            }
        }
        flag = 0;
        return manche;
    }

    /**
     * Méthode permettant de confronter deux joueurs et d'afficher le vainqueur
     * du duel.
     *
     * @param joueur1
     * @param joueur2
     */
    public static void duel(Humain joueur1, Humain joueur2) {
        int mancheJoueur1 = lancer(joueur1);
        int mancheJoueur2 = lancer(joueur2);
        if (mancheJoueur1 > mancheJoueur2) {
            System.out.println("\nLe gagnant de cette partie est : " + joueur2.prenom);
        }
        if (mancheJoueur1 < mancheJoueur2) {
            System.out.println("\nLe gagnant de cette partie est : " + joueur1.prenom);
        }
        if (mancheJoueur1 == mancheJoueur2) {
            System.out.println("\nEgalité !");
        }
    }

    /**
     * Méthode permettant d'afficher le résultat détaillé des deux joueurs.
     */
    public static void afficherResultat() {
        String chaine = "";
        String chaine2 = "";
        String fichier = "resultat_joueur1.txt";
        String fichier2 = "resultat_joueur2.txt";

        try {
            InputStream ips = new FileInputStream(fichier);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
                chaine += ligne + "\n";
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Fichier introuvable, pas de résultats auparavent;");
        }
        try {
            InputStream ips2 = new FileInputStream(fichier2);
            InputStreamReader ipsr2 = new InputStreamReader(ips2);
            BufferedReader br2 = new BufferedReader(ipsr2);
            String ligne2;
            while ((ligne2 = br2.readLine()) != null) {
                System.out.println(ligne2);
                chaine2 += ligne2 + "\n";
            }
            br2.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
