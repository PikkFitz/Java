package UI;

import Exos.Exos;
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
            System.out.println("|| 1: Exercice 1 Introduction                                    ||");
            System.out.println("|| 2: Exercice 2 Chaine de caractères                            ||");
            System.out.println("|| 3: Exercice 3 Compte mot                                      ||");
            System.out.println("|| 4: Exercice 4 Fibonacci                                       ||");
            System.out.println("|| 5: Exercice 5 Table de multiplication                         ||");
            System.out.println("|| 6: Exercice 6 Nombre de lettres                               ||");
            System.out.println("|| 7: Exercice 7 String token                                    ||");
            System.out.println("|| 0: quitter                                                    ||");
            System.out.println("===================================================================");

            ret = scanner.nextLine();
            switch (ret)
            {
                case "1":
                    Exos.exercice1Introduction();
                    break;
                case "2":
                    Exos.exercice2ChaineDeCaracteres();
                    break;
                case "3":
                    Exos.exercice3CompteMot();
                    break;
                case "4":
                    Exos.exercice4Fibonacci();
                    break;
                case "5":
                    Exos.exercice5TableDeMultiplication();
                    break;
                case "6":
                    Exos.exercice6NombreDeLettres();
                    break;
                case "7":
                    Exos.exercice7StringToken();
                    break;
                case "0":
                    System.out.println("=======================================================");
                    System.out.println("|            Fin du programme \"Fonctions\"           |");
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
