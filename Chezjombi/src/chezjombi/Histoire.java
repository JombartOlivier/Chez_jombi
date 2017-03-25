
package chezjombi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Histoire {

    private static String classe;
    private static String surnom;
    private static String sexe;
    private static String nom;
    private static Commande boissonPreferee;
    private static Humain joueur;

    private final static String TABLEAUSURNOM[] = {"coco"};

    private final static String TABLEAUMASCULIN[] = {"florence", "dominique", "osanne", "ozanne", "vivien", "hippolyte", "marius", "emmanuel", "corentin", "pierrick", "yann", "lucas", "albert", "alfred",
        "bernard", "boniface", "charles", "constant", "dennis", "edgar", "eric", "guy", "horace", "isidore", "justin", "maurice", "nicholas", "philbert", "quentin", "raymond", "rodolph", "roger", "roland",
        "joseph", "samuel", "gilbert", "vincent", "christian", "richard", "lambert", "benjamin", "joachim", "adam", "paul", "martin", "thomas", "gabriel", "victor", "robert", "simon", "hector", "xavier", "abel", "hubert", "herbert", "humbert",
        "raphael", "ferdinand", "daniel", "david"};

    private final static String TABLEAUFEMMIN[] = {"alice", "ariane", "bernardine", "catherine", "christianne", "clarice", "constance", "rose", "roxanne", "eve", "isabelle", "sarah", "muriel", "emma",
        "elisabeth", "barbara", "esther", "hannah", "judith", "rachel", "adélaïde", "adèle", "adrienne", "agnès", "aimée", "albertine", "alexandrie", "alphonsine", "ambre", "amélie", "anastasie", "andrée", "angèle",
        "angeline", "angelique", "annette", "antoinette", "apolline", "arianne", "arienne", "armelle", "arnaude", "aude", "aurélie", "aurore", "axelle", "béatrice", "bénédicte", "benjamine", "benoite", "bernadette", "berthe",
        "carole", "cécile", "céleste", "célestine", "céline", "cerise", "chanté", "charline"};

    private final static String TABLEAUSEXE[] = {"Homme", "Femme"};

    private final static String NOMBOISSON[] = {"Sainte Colombe Blonde", "STOUT VANDENHEUVEL La Brune de Bruxelles", "ST LEONARD Bière de Garde Ambrée", "SOYEUSE Ambrée", "La Sierrvoise blanche", "ROUSSIENNE La Blonde (LA)",
        "ROBUST PORTER", "RAMEE Ambrée Bière Artisanale d'Abbaye", "QUENAST Bière Blonde (LA)", "PRIMATOR Knight's Lager", "PFUNGSTÄDTER Export Würzig und Mild", "PAULUS Oud Bruin Vieille Brune", "Palma Cristal", "Amaretto Sour",
        "Americano", "Barbottage", "B52", "Brandy Alexander", "Gin Fizz", "Bronx", "John Collin’s", "Caïpirinha", "Mojidos", "Corsica", "Corpse Reviver", "Mojito", "Cracker", "Cosmopolitan", "Moscow Mule",
        "November Seabreeze", "Daïquiri", "Piña Colada", "Dry Martini", "Pineau Colada", "God Father", "Planter’s Punch", "Jack Rose", "Sunset Boulevard", "Last Word", "Tampico", "Maï Taï", "Ti’Punch", "Manhattan Contemporain",
        "Margarita", "Tequila Sunrise", "Absinthe", "Rhum", "Vodka", "Whisky", "Tequila", "Ricard", "Pastis", "SuzeBrandy", "Martinez", "Maverick", "Mint Julep", "Negroni", "Paradise", "Pink Lady", "Porto Flip",
        "Presidente", "Red Lion", "Sazerac", "Scotch Sour", "Side Car", "Stinger", "Summit", "White Lady", "Eau"};

<<<<<<< Updated upstream
    public static Serveur serveur[]=new Serveur[20];
    public static Barman barman[] = new Barman[20];
    public static Client client[] = new Client[20];
    public static Patron patron[] = new Patron[20];
=======
    public static Serveur serveur[] ={};
    public static Barman barman[] = {};
    public static Client client[] = {};
    public static Patron patron[] = {};
>>>>>>> Stashed changes

    public static void jeu() {

    }

    /**
     * Methode pour Creer son personnage
     */
    public static void creationPersonnage() {
        System.out.println("Avant toutes choses ce simulateur est déconseillé au moins de 12 ans"+
                "Pegi 12.  "+
                "Bienvenue Chez Jombi, le bar on s'y sent comme chez soi. Dans ce jeu vous pourrez vous incarner"+
                "en un client, un serveur, un barman ou tout simplement le patron du bar."+
                "Chaque personnnage dispose d'un privilège, tu les découvriras suivant les actions"+
                "que tu feras au sein du simulateur. Maintenant à toi de jouer ;).");
        System.out.println("Quel personnage souhaitez-vous jouer ?");
        System.out.println("Client    [1]");
        System.out.println("Serveur [2]");
        System.out.println("Barman [3]");
        System.out.println("Patron   [4]");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le numéro du personnage");
        classe = "0";
        while ("0".equals(classe)) {
            classe = sc.nextLine();
            switch (classe) {
                case "1":
                    classe = "Client";
                    constructionClient();
                    joueur = new Client(nom, surnom, boissonPreferee, sexe);
                    break;
                case "2":
                    classe = "Serveur";
                    constructionServeur();
                    joueur = new Serveur(nom, sexe);

                    break;
                case "3":
                    classe = "Barman";
                    constructionBarman();
                    joueur = new Barman(nom, surnom, boissonPreferee, sexe);

                    break;
                case "4":
                    classe = "Patron";
                    constructionPatron();
                    joueur = new Patron(nom, boissonPreferee, sexe);

                    break;
                default:
                    classe = "0";
                    System.out.println("le numéro est incorrect");
            }

        }
        joueur.sePresenter();
    }

    /**
     * Methode pour créer un patron.
     */
    public static void constructionPatron() {
        System.out.println("Vous avez choisi la classe " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de votre personnage");
        nom = sc.nextLine();
        System.out.println("Quel est le sexe de votre personnage");
        System.out.println("Femme  [1]");
        System.out.println("Homme [2]");
        sexe = "0";
        while ("0".equals(sexe)) {
            sexe = sc.nextLine();
            switch (sexe) {
                case "1":
                    sexe = "Femme";
                    break;
                case "2":
                    sexe = "Homme";
                    break;
                default:
                    System.out.println("Le numéro est incorrect");
                    sexe = "0";
            }
        }
        boissonPreferee = generateurBoisson();

    }

    /**
     * Methode pour créer un barman
     */
    public static void constructionBarman() {
        System.out.println("Vous avez choisi la classe " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de votre personnage");
        nom = sc.nextLine();
        System.out.println("Entrez le surnom de votre personnage");
        surnom = sc.nextLine();
        System.out.println("Quel est le sexe de votre personnage");
        System.out.println("Femme  [1]");
        System.out.println("Homme [2]");
        sexe = "0";
        while ("0".equals(sexe)) {
            sexe = sc.nextLine();
            switch (sexe) {
                case "1":
                    sexe = "Femme";
                    break;
                case "2":
                    sexe = "Homme";
                    break;
                default:
                    System.out.println("Le numéro est incorrect");
                    sexe = "0";
            }
        }
        boissonPreferee = generateurBoisson();

    }

    /**
     * Methode pour creer un serveur
     */
    public static void constructionServeur() {
        System.out.println("Vous avez choisi la classe " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de votre personnage");
        nom = sc.nextLine();
        System.out.println("Quel est le sexe de votre personnage");
        System.out.println("Femme  [1]");
        System.out.println("Homme [2]");
        sexe = "0";
        while ("0".equals(sexe)) {
            sexe = sc.nextLine();
            switch (sexe) {
                case "1":
                    sexe = "Femme";
                    break;
                case "2":
                    sexe = "Homme";
                    break;
                default:
                    System.out.println("Le numéro est incorrect");
                    sexe = "0";
            }
        }

    }

    /**
     * Methode pour creer un client
     */
    public static void constructionClient() {
        System.out.println("Vous avez choisi la classe " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de votre personnage");
        nom = sc.nextLine();
        System.out.println("Entrez le surnom de votre personnage");
        surnom = sc.nextLine();
        System.out.println("Quel est le sexe de votre personnage");
        System.out.println("Femme  [1]");
        System.out.println("Homme [2]");
        sexe = "0";
        while ("0".equals(sexe)) {
            sexe = sc.nextLine();
            switch (sexe) {
                case "1":
                    sexe = "Femme";
                    break;
                case "2":
                    sexe = "Homme";
                    break;
                default:
                    System.out.println("Le numero est incorrect");
                    sexe = "0";
            }
        }
        boissonPreferee = generateurBoisson();

    }

    /**
     * Pour génerer une boisson
     *
     * @return une boisson de type Commande
     */
    public static Commande generateurBoisson() {
        System.out.println("Il vous faut créer votre boisson preferée");
        String pNom;
        boolean alcoolisee = false;
        float degresDAlcool = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de votre boisson favorite :");
        pNom = sc.nextLine();
        System.out.println("Votre boisson est-elle alcoolisée");
        System.out.println("Oui [1]");
        System.out.println("Non [2]");
        String str = "0";
        while ("0".equals(str)) {
            str = sc.nextLine();
            switch (str) {
                case "1":
                    alcoolisee = true;
                    System.out.println("Quel est son degré d'alcool ?");
                    degresDAlcool = sc.nextFloat();
                    break;
                case "2":
                    alcoolisee = false;
                    break;
                default:
                    str = "0";
                    System.out.println("Le numéro est incorrect");
            }
        }
        Commande boisson = new Commande(pNom, alcoolisee, degresDAlcool);
        boisson.calculprix();
        System.out.println("Votre boisson preferée est donc " + boisson);
        return boisson;
    }

    /**
     * pour generer aleatoirement une boisson
     *
     * @return une boisson de type Commande
     */
    public static Commande generationAleatoirBoisson() {
        Random r = new Random();
        int nbElement = NOMBOISSON.length;
        int aleatoire = r.nextInt(nbElement);
        String nomBoisson = NOMBOISSON[aleatoire];
        boolean alcooliser = r.nextBoolean();
        float degresDalcool = r.nextFloat()*50;
        //float prixBoisson=r.nextInt(10)+1;
        Commande boisson = new Commande(nomBoisson,alcooliser, degresDalcool);
        boisson.calculprix();
        return boisson;
    }

    public static void constructionAleatoire(int nbPersonne, String classeAcreer) {

        switch (classeAcreer) {
            case "Client":
                for (int i = 0; i <= nbPersonne; i++) {
                    generationAleatoirePersonnage("Client");
<<<<<<< Updated upstream
                    client[i] = new Client(nom, surnom, boissonPreferee, sexe);
=======
                   client[i] = new Client(nom, surnom, boissonPreferee, sexe);
>>>>>>> Stashed changes
                }
                break;
            case "Serveur":
                for (int i = 0; i <= nbPersonne; i++) {
                    generationAleatoirePersonnage("Serveur");
                    serveur[i] = new Serveur(nom, sexe);
                }
                break;
            case "Barman":
                for (int i = 0; i <= nbPersonne; i++) {
                    generationAleatoirePersonnage("Barman");
                    barman[i] = new Barman(nom, surnom, boissonPreferee, sexe);
                }
                break;
            case "Patron":
                for (int i = 0; i <= nbPersonne; i++) {
                    generationAleatoirePersonnage("Patron");
                    patron[i] = new Patron(nom, boissonPreferee, sexe);
                }
                break;
        }

    }

    /**
     * Methode pour creer un personnage alaetoire
     *
     * @param classe
     */
    public static void generationAleatoirePersonnage(String classe) {
        Random r = new Random();
        int aleatoire = r.nextInt(2);
        sexe = TABLEAUSEXE[aleatoire];
        if ("Homme".equals(sexe)) {
            int nbElementMasculin = TABLEAUMASCULIN.length;
            aleatoire = r.nextInt(nbElementMasculin);
            nom = TABLEAUMASCULIN[aleatoire];
        } else {
            int nbElementFemminin = TABLEAUFEMMIN.length;
            aleatoire = r.nextInt(nbElementFemminin);
            nom = TABLEAUFEMMIN[aleatoire];
        }

        switch (classe) {
            case "Client":
                int nbElementSurnom = TABLEAUSURNOM.length;
                aleatoire = r.nextInt(nbElementSurnom);
                surnom = TABLEAUSURNOM[aleatoire];
               
                boissonPreferee = generationAleatoirBoisson();
                System.out.println(boissonPreferee);
                break;
            case "Barman":
                nbElementSurnom = TABLEAUSURNOM.length;
                aleatoire = r.nextInt(nbElementSurnom);
                surnom = TABLEAUMASCULIN[aleatoire];
                boissonPreferee = generationAleatoirBoisson();
                break;
            case "Patron":
                boissonPreferee = generationAleatoirBoisson();
                break;
            case "Serveur":

                break;
        }
    }

}
