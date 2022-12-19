package UI;

import Exos.Exercice1Cercles.Exercice1Cercles;
import Exos.Exercice2TriNombre.Exercice2TriNombre;
import Exos.Exercice3Formes.Exercice3Formes;
import Exos.Exercice4Vehicules.Exercice4Vehicules;
import Exos.Exercice5Clients.Exercice5Clients;
import Exos.Exercice6Bibliotheque.Exercice6Bibliotheque;
import java.util.Scanner;

public class Menu
{
    public static void init()
    {
        Scanner scanner = new Scanner(System.in);
        String ret;
        boolean encore = true;
        do
        {
            System.out.println("===================================================================");
            System.out.println("|| Choisissez un exo (écrire le n° de l'exercice) 0 pour quitter ||");
            System.out.println("|| 1: Exercice 1 Cercles                                         ||");
            System.out.println("|| 2: Exercice 2 Tri-nombre                                      ||");
            System.out.println("|| 3: Exercice 3 Formes                                          ||");
            System.out.println("|| 4: Exercice 4 Véhicules                                       ||");
            System.out.println("|| 5: Exercice 5 Clients                                         ||");
            System.out.println("|| 6: Exercice 6 Bibliothèque                                    ||");
            System.out.println("|| 0: quitter                                                    ||");
            System.out.println("===================================================================");

            ret = scanner.nextLine();
            switch (ret)
            {
                case "1":
                    Exercice1Cercles.exercice1Cercles();
                    break;
                case "2":
                    Exercice2TriNombre.exercice2TriNombre();
                    break;
                case "3":
                    Exercice3Formes.exercice3Formes();
                    break;
                case "4":
                    Exercice4Vehicules.exercice4Vehicules();
                    break;
                case "5":
                    Exercice5Clients.exercice5Clients();
                    break;
                case "6":
                    Exercice6Bibliotheque.exercice6Bibliotheque();
                    break;
                case "0":
                    System.out.println("=======================================================");
                    System.out.println("|            Fin du programme \"POO\"                 |");
                    System.out.println("=======================================================");
                    encore= false;
                    break;
                default:
                    System.out.println("N° d'exercice incorrect, veuillez rentrer un numéro d'exercice valide ");
                    break;

            }
        }
        while (encore);
    } //init
} //class

