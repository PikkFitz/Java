package UI;

import Exos.Exercice1Cercles.Exercice1Cercles;
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
            System.out.println("|| 0: quitter                                                    ||");
            System.out.println("===================================================================");

            ret = scanner.nextLine();
            switch (ret)
            {
                case "1":
                    Exercice1Cercles.exercice1Cercles();
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

