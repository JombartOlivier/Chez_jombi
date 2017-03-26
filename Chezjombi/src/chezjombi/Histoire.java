package chezjombi;

import java.util.InputMismatchException;
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
    private static int choixJoueur;
    private static boolean fin;

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

    public static Serveur serveur[] = new Serveur[6];
    public static Barman barman[] = new Barman[1];
    public static Client client[] = new Client[21];
    public static Patron patron[] = new Patron[1];

    /**
     * Méthode permettant lancer le jeu, c'est la méthode principale du projet.
     */
    public static void jeu() {
        System.out.println("Avant toutes choses ce simulateur est déconseillé au moins de 12 ans");
        System.out.println("Bienvenue Chez Jombi, le bar on s'y sent comme chez soi. Dans ce jeu vous pourrez vous incarner");
        System.out.println("en un client, un serveur, un barman ou tout simplement le patron du bar.");
        System.out.println("Chaque personnnage dispose d'un privilège, tu les découvriras suivant tes actions choisies.");
        System.out.println("Maintenant à toi de jouer ;).");
        System.out.println("");
        System.out.println("Tu vas commencer par créer ton personnage. Attention au choix que tu fais, seront définitif");
        creationPersonnage();
        System.out.println("");
        System.out.println("Generation de l'environnement");
        switch (classe) {
            case "Client":
                constructionAleatoire(19, "Client");
                constructionAleatoire(5, "Serveur");
                constructionAleatoire(1, "Barman");
                constructionAleatoire(1, "Patron");
                break;
            case "Serveur":
                constructionAleatoire(20, "Client");
                constructionAleatoire(5, "Serveur");
                constructionAleatoire(1, "Barman");
                constructionAleatoire(1, "Patron");
                break;
            case "Barman":
                constructionAleatoire(20, "Client");
                constructionAleatoire(5, "Serveur");
                constructionAleatoire(1, "Patron");
                break;
            case "Patron":
                constructionAleatoire(20, "Client");
                constructionAleatoire(5, "Serveur");
                constructionAleatoire(1, "Barman");
                break;

        }
        System.out.println("Environnement créer");
        System.out.println("");
        while (fin == false) {
            switch (classe) {
                case "Client":
                    menuActionClient();
                    break;
                case "Serveur":
                    System.out.println("Disponnible lors de la prochaine mise a jour");
                    break;
                case "Barman":
                    System.out.println("Disponnible lors de la prochaine mise a jour");
                    break;
                case "Patron":
                    System.out.println("Disponnible lors de la prochaine mise a jour");
                    break;
            }
        }

    }

    /**
     * Méthode permettant de chosir avec quel personnage interragire.
     *
     * @return personneSelectionne
     */
    public static Humain choixPersonneInteraction() {
        System.out.println("Avec quel personnage souhaites-tu interagir ?");
        System.out.println("Client  [1]");
        System.out.println("Serveur [2]");
        System.out.println("Patron  [3]");
        System.out.println("Barman  [4]");
        Humain personneSelectionne = null;
        Scanner sc = new Scanner(System.in);
        String choix = "-1";
        while ("-1".equals(choix)) {
            choix = sc.nextLine();
            switch (choix) {
                case "1":
                    for (int i = 0; i <= client.length - 2; i++) {
                        personneSelectionne = client[i];
                        System.out.println(personneSelectionne.prenom + " [" + i + "]");
                    }
                    break;
                case "2":
                    for (int i = 0; i <= serveur.length - 2; i++) {
                        personneSelectionne = serveur[i];
                        System.out.println(personneSelectionne.prenom + " [" + i + "]");
                    }
                    break;
                case "3":
                    personneSelectionne = patron[0];
                    break;
                case "4":
                    personneSelectionne = barman[0];
                    break;
                default:
                    choix = "-1";
                    break;
            }
        }
        if ("1".equals(choix) || "2".equals(choix)) {
            System.out.println("Entre le numéro de la personne que tu as choisi");
            int numerosPersonne = -1;

            while (numerosPersonne == -1 && fin == false) {
                try {
                    numerosPersonne = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Une erreur c'est produite veuillez continuer jusqu'a l'arret du programme ");

                    fin = true;
                }

                if (numerosPersonne >= 0 & numerosPersonne <= client.length & "1".equals(choix)) {
                    personneSelectionne = client[numerosPersonne];
                } else if (numerosPersonne >= 0 && numerosPersonne <= serveur.length && "2".equals(choix)) {
                    personneSelectionne = serveur[numerosPersonne];
                } else {
                    numerosPersonne = -1;
                    System.out.println("veuillez entrer un numeros correcte");
                }
            }
        }
        System.out.println("Tu as selectionné " + personneSelectionne.prenom);

        return personneSelectionne;

    }

    /**
     * Méthode permettant d'offrir un verre à n'importe quel personnage
     */
    public static void choixOffrirVerre() {
        Scanner sc = new Scanner(System.in);
        String choix = "-1";
        String choix_2 = "";
        int str3ToInt = 0;
        Humain personneSelectionne = null;
        System.out.println("A qui veux-tu offrir un verre ?");
        System.out.println("Client    [1]");
        System.out.println("Serveur   [2]");
        System.out.println("Patron    [3]");
        System.out.println("Barman    [4]");
        choix = sc.nextLine();
        switch (choix) {
            case "1":
                for (int i = 0; i <= client.length - 2; i++) {
                    personneSelectionne = client[i];
                    System.out.println(personneSelectionne.prenom + " [" + i + "]");
                }
                System.out.println("Choisi ton client");
                choix_2 = sc.nextLine();
                str3ToInt = Integer.parseInt(choix_2);
                if (boissonPreferee.getPrix() < joueur.getArgent()) {
                    ((Client) joueur).offrirUnVerre(boissonPreferee, client[str3ToInt]);
                    System.out.println("Tu as offert : " + ((Client) joueur).boissonPreferee + " à " + client[str3ToInt].prenom);
                    ((Client) joueur).payer(boissonPreferee.getPrix());
                    System.out.println("Argent restant dans mon porte monnaie : " + ((Client) joueur).getArgent() + "€");
                } else {
                    System.out.println("Je n'ai pas d'argent, il est préférable de recommencer le jeu.");
                }
                break;
            case "2":
                for (int i = 0; i <= serveur.length - 2; i++) {
                    personneSelectionne = serveur[i];
                    System.out.println(personneSelectionne.prenom + " [" + i + "]");
                }
                System.out.println("Choisi ton serveur");
                choix_2 = sc.nextLine();
                System.out.println("Le/La serveur(se) n'accepte pas que tu lui payes un coup, il/elle travaille");
                break;
            case "3":
                if (boissonPreferee.getPrix() < joueur.getArgent()) {
                    ((Client) joueur).offrirUnVerre(boissonPreferee, patron[0]);
                    System.out.println("Tu as offert : " + ((Client) joueur).boissonPreferee + " à " + patron[0].prenom);
                    ((Client) joueur).payer(boissonPreferee.getPrix());
                    System.out.println("Argent restant dans mon porte monnaie : " + ((Client) joueur).getArgent() + "€");
                } else {
                    System.out.println("Je n'ai pas d'argent, il est préférable de recommencer le jeu.");
                }

                break;
            case "4":
                if (boissonPreferee.getPrix() < joueur.getArgent()) {
                    ((Client) joueur).offrirUnVerre(boissonPreferee, barman[0]);
                    System.out.println("Tu as offert : " + ((Client) joueur).boissonPreferee + " à " + barman[0].prenom);
                    System.out.println("Argent restant dans mon porte monnaie : " + ((Client) joueur).getArgent() + "€");
                } else {
                    System.out.println("Je n'ai pas d'argent, il est préférable de recommencer le jeu.");
                }
                break;
            default:
                System.out.println("Numéro de saisi incorrect");
                break;
        }
    }

    /**
     * Méthode permettant de desiner et d'interagire avec le menu des action
     * pour un personnage de type Client
     */
    public static void menuActionClient() {
        Humain personneAvecQuiInterragire;
        System.out.println("Que souhaites-tu faire ?");
        Scanner sc = new Scanner(System.in);
        String choix = "-1";
        System.out.println("Se Battre                           [1]      Aller aux toillettes       [2]");
        System.out.println("Payer                               [3]      Parler                     [4]");
        System.out.println("Offrir un verre                     [5]      Se presenter               [6]");
        System.out.println("Apporter une boisson                [7]      Jouer aux flechettes       [8]");
        System.out.println("Boire                               [9]      Commander à Boire          [10]");
        System.out.println("Consulter mon degré alcoolémie     [11]     Quitter le jeu              [12]");
        choix = sc.nextLine();
        Random r = new Random();
        int aleatoire;
        String str3;
        switch (choix) {
            case "1":
                System.out.println("Avec qui veux-tu te battre ? ");
                personneAvecQuiInterragire = choixPersonneInteraction();
                joueur.seBattre(personneAvecQuiInterragire);
                System.out.println("");
                break;
            case "2":
                joueur.allerAuWC();
                System.out.println("");
                break;
            case "3":
                joueur.payer(choixJoueur);
                System.out.println("");
                break;
            case "4":
                System.out.println("A qui veux-tu parler ?");
                personneAvecQuiInterragire = choixPersonneInteraction();
                System.out.println("Que veux-tu dire ?");
                String str = sc.nextLine();
                ((Client) joueur).parler(personneAvecQuiInterragire, str);
                System.out.println("");
                break;
            case "5":
                choixOffrirVerre();
                System.out.println("");
                break;
            case "6":
                ((Client) joueur).sePresenter();
                System.out.println("");
                break;
            case "7":
                System.out.println("Tu es un client, tu ne peux pas apporter une boisson");
                System.out.println("");
                break;
            case "8":
                lancerJeuFlechette();
                System.out.println("");
                break;
            case "9":
                ((Client) joueur).boire();
                System.out.println("");
                break;
            case "10":
                aleatoire = r.nextInt(serveur.length);
                ((Client) joueur).commander(serveur[aleatoire], barman[0]);
                System.out.println("");
                break;
            case "11":
                System.out.println("Degré d'alcoolémie dans le sang : " + ((Client) joueur).degreeAlcoolemie);
                if (((Client) joueur).degreeAlcoolemie > 15) {
                    System.out.println("Mieux vaut que j'arrête de boire ou d'aller aux toilettes afin d'évacuer mon alcoolémie");
                }
                break;
            case "12":
                System.out.println("Es-tu sûr de vouloir sortir du bar ? Ton action sera definitive. ");
                System.out.println("Oui  [1]");
                System.out.println("Non [2]");
                String str1 = "-1";
                while ("-1".equals(str1)) {
                    str1 = sc.nextLine();
                    if ("1".equals(str1)) {
                        fin = true;
                    } else if ("2".equals(str1)) {
                        fin = false;
                    } else {
                        str1 = "-1";
                    }
                }
                break;
            default:
                System.out.println("Le numéro de saisi est incorrect");
                System.out.println("");
                break;

        }
    }

    /**
     * Méthode permettant de lancer le jeu de flechette
     */
    public static void lancerJeuFlechette() {
        Random r = new Random();
        int aleatoire;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que veux-tu faire ? ");
        System.out.println("Jouer avec un client   [1]");
        System.out.println("Jouer avec le patron  [2]");
        System.out.println("Voir la notice              [3]");
        String str3;
        str3 = sc.nextLine();
        if (null == str3) {
            System.out.println("Le numero de saisie est incorrect");
        } else {
            switch (str3) {
                case "1":
                    System.out.println("Nous allons tirer au sort ton adversaire ");
                    aleatoire = r.nextInt(client.length);
                    System.out.println("Tu vas jouer contre " + client[aleatoire].prenom);
                    Jeu.duel(joueur, client[aleatoire]);

                    break;
                case "2":
                    System.out.println("Tu vas jouer contre " + patron[0].prenom);
                    Jeu.duel(joueur, patron[0]);

                    break;
                case "3":
                    Jeu.notice();
                    break;
                default:
                    System.out.println("Le numero de saisi est incorrect");
                    break;
            }
            System.out.println("Veux-tu les résultats de la partie précédente ?");
            System.out.println("Oui  [1]");
            System.out.println("Non [2]");
            str3 = "-1";
            while ("-1".equals(str3)) {
                str3 = sc.nextLine();
                if ("1".equals(str3)) {
                    Jeu.afficherResultat();
                } else if ("2".equals(str3)) {

                } else {
                    System.out.println("Le numero de saisi est incorrect");
                    str3 = "-1";
                }

            }

        }

    }

    /**
     * Méthode pour creer son personnage
     */
    public static void creationPersonnage() {

        System.out.println("Quel personnage souhaites-tu jouer ?");
        System.out.println("Client    [1]");
        System.out.println("Serveur   [2]");
        System.out.println("Barman    [3]");
        System.out.println("Patron    [4]");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre le numéro du personnage");
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
                    System.out.println("Le numéro de saisi est incorrect");
            }

        }
        joueur.sePresenter();
    }

    /**
     * Méthode pour construire un patron.
     */
    public static void constructionPatron() {
        System.out.println("Tu as choisi le personnage " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre le nom de ton personnage");
        nom = sc.nextLine();
        System.out.println("Quel est le sexe de ton personnage");
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
                    System.out.println("Le numéro de saisi est incorrect");
                    sexe = "0";
            }
        }
        boissonPreferee = generateurBoisson();

    }

    /**
     * Méthode pour construire un barman
     */
    public static void constructionBarman() {
        System.out.println("Tu as choisi le personnage " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre le nom de ton personnage");
        nom = sc.nextLine();
        System.out.println("Entre le surnom de ton personnage");
        surnom = sc.nextLine();
        System.out.println("Quel est le sexe de ton personnage");
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
                    System.out.println("Le numéro de saisi est incorrect");
                    sexe = "0";
            }
        }
        boissonPreferee = generateurBoisson();

    }

    /**
     * Methode pour construire un serveur
     */
    public static void constructionServeur() {
        System.out.println("Tu as choisi le personnage " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre le nom de ton personnage");
        nom = sc.nextLine();
        System.out.println("Quel est le sexe de ton personnage");
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
                    System.out.println("Le numéro de saisi est incorrect");
                    sexe = "0";
            }
        }

    }

    /**
     * Methode pour construire un client
     */
    public static void constructionClient() {
        System.out.println("Tu as choisi le personnage " + classe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre le nom de ton personnage");
        nom = sc.nextLine();
        System.out.println("Entre le surnom de ton personnage");
        surnom = sc.nextLine();
        System.out.println("Quel est le sexe de ton personnage");
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
                    System.out.println("Le numero de saisi est incorrect");
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
        System.out.println("Il te faut créer ta boisson preferée");
        String pNom;
        boolean alcoolisee = false;
        double degresDAlcool = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre le nom de ta boisson favorite :");
        pNom = sc.nextLine();
        System.out.println("Ta boisson est-elle alcoolisée ?");
        System.out.println("Oui  [1]");
        System.out.println("Non [2]");
        String str = "0";
        while ("0".equals(str)) {
            str = sc.nextLine();
            switch (str) {
                case "1":
                    alcoolisee = true;
                    System.out.println("Quel est son degré d'alcool ? Attention le degres d'alcool influe sur le prix de la boisson");

                    try {
                        degresDAlcool = sc.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Une erreur c'est produise veuillez entrer un nombre de type 0,00 ou 0");
                        str = "0";
                        System.out.println("Ta boisson est-elle alcoolisée ?");
                        System.out.println("Oui  [1]");
                        System.out.println("Non [2]");
                    }

                    break;
                case "2":
                    alcoolisee = false;
                    break;
                default:
                    str = "0";
                    System.out.println("Le numéro de saisi est incorrect");
            }
        }
        Commande boisson = new Commande(pNom, alcoolisee, (float) degresDAlcool);
        boisson.calculPrix();

        System.out.println("Ta boisson préferée est donc " + boisson);
        return boisson;
    }

    /**
     * pour generer aleatoirement une boisson
     *
     * @return une boisson de type Commande
     */
    public static Commande generationAleatoireBoisson() {
        Random r = new Random();
        int nbElement = NOMBOISSON.length;
        int aleatoire = r.nextInt(nbElement);
        String nomBoisson = NOMBOISSON[aleatoire];
        boolean alcooliser = r.nextBoolean();
        float degresDalcool = r.nextFloat() * 50;
        Commande boisson = new Commande(nomBoisson, alcooliser, degresDalcool);
        boisson.calculPrix();
        return boisson;
    }

    /**
     * Pour construire aleatoirement un/plusieurs personnage du type souhaiter
     *
     * @param nbPersonne
     * @param classeAcreer
     */
    public static void constructionAleatoire(int nbPersonne, String classeAcreer) {

        switch (classeAcreer) {
            case "Client":
                for (int i = 0; i <= nbPersonne; i++) {
                    generationAleatoirePersonnage("Client");
                    client[i] = new Client(nom, surnom, boissonPreferee, sexe);
                }
                break;
            case "Serveur":
                for (int i = 0; i <= nbPersonne; i++) {
                    generationAleatoirePersonnage("Serveur");
                    serveur[i] = new Serveur(nom, sexe);
                }
                break;
            case "Barman":
                for (int i = 0; i < nbPersonne; i++) {
                    generationAleatoirePersonnage("Barman");
                    barman[i] = new Barman(nom, surnom, boissonPreferee, sexe);
                }
                break;
            case "Patron":
                for (int i = 0; i < nbPersonne; i++) {
                    generationAleatoirePersonnage("Patron");
                    patron[i] = new Patron(nom, boissonPreferee, sexe);
                }
                break;
        }

    }

    /**
     * Methode pour construire un personnage alaetoire
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

                boissonPreferee = generationAleatoireBoisson();
                break;
            case "Barman":
                nbElementSurnom = TABLEAUSURNOM.length;
                aleatoire = r.nextInt(nbElementSurnom);
                surnom = TABLEAUMASCULIN[aleatoire];
                boissonPreferee = generationAleatoireBoisson();
                break;
            case "Patron":
                boissonPreferee = generationAleatoireBoisson();
                break;
            case "Serveur":

                break;
        }
    }

}
