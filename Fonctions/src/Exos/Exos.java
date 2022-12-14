package Exos;

import java.util.Arrays;
import java.util.Scanner;

public class Exos
{
    public static void exercice1Introduction()
    {
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un premier nombre : ");
        double nb1 = lectureClavier.nextDouble();
        System.out.println("Entrer un opérateur (+ - * /) : ");
        String operateur;
        operateur = lectureClavier.next();
        System.out.println("Entrer un second nombre : ");
        double nb2 = lectureClavier.nextDouble();
        double resultat = 0;

        switch (operateur)
        {
            case "+" ->
            {
                resultat = nb1 + nb2;
            }
            case "-" ->
            {
                resultat = nb1 - nb2;
            }
            case "*" ->
            {
                resultat = nb1 * nb2;
            }
            case "/" ->
            {
                if (nb2!=0)
                {
                    resultat = nb1 / nb2;
                }
                else
                {
                    System.out.println("Calcul impossible, division par 0 !");
                }
            }
            default -> System.out.println("Opérateur non valide");
        }; //switch

        if ((nb2 != 0) || (!operateur.equals("/")))
        {
            System.out.println("Le résultat de cette opération est égal à " + resultat);
        }

    } //Exercice1Introduction

    //RAPPEL pour appeler une fonction : double resultat = calcul(operateur, nb1, nb2);


    public static void exercice2ChaineDeCaracteres()
    {
        Scanner lectureClavier = new Scanner(System.in);

        String chaine1 = "Mon nom est ";
        System.out.println("Entrer votre prénom : ");
        String chaine2 = lectureClavier.next();

        System.out.println(chaine1 + chaine2);

    } //exercice2ChaineDeCaracteres


    public static void exercice3CompteMot()
    {
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Entrer une phrase afin de déterminer le nombre de mots : ");
        String phrase = lectureClavier.nextLine();
        int nbMots = phrase.split("[ ']").length;

        System.out.println("Le nombre de mots dans cette phrase est : " + nbMots);

    } //exercice3CompteMot


    public static void exercice4Fibonacci()
    {
        Scanner lectureClavier = new Scanner(System.in);

        int nb1 = 0;
        int nb2 = 1;
        int nb3 = 0;

        System.out.println("Entrer le nombre des \"n\" premiers termes voulus de la suite de Fibonacci : ");
        int n = lectureClavier.nextInt();

        int i;

        System.out.print(nb1+" "+nb2);

        for(i=2; i<n; ++i)
        {
            nb3 = nb1 + nb2;
            nb1 = nb2;
            nb2 = nb3;
            System.out.print(" "+nb3);
        }
        System.out.println();

    } //exercice4Fibonacci

    /* EXEMPLE AVEC RECURSIVITE (FONCTION RECURSIVE)

    public class SuiteFibonacciMethod2
    {

     static int nbr1=0;
     static int nbr2=1;
     static int nbr3=0;

     static void displayFibonacci(int c)
     {
        if(c > 0)
        {
             nbr3 = nbr1 + nbr2;
             nbr1 = nbr2;
             nbr2 = nbr3;
             System.out.print(" "+nbr3);
             displayFibonacci(c-1);
         }
     }

     public static void main(String args[])
     {
         int c = 10;
         //print 0 and 1
         System.out.print(nbr1+" "+nbr2);
         //deduire 2 car 0 et 1 sont deja affiches
         displayFibonacci(c-2);
     }
     }
     */


    public static void exercice5TableDeMultiplication()
    {
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Entrer le nombre \"n\" de la table de multiplication désirée : ");
        int n = lectureClavier.nextInt();
        int resultat;

        int i;

        for(i=0; i<=10; ++i)
        {
            resultat = n * i;

            System.out.println(n + " x " + i + " = " + resultat);
        }
    }


    public static void exercice6NombreDeLettres()
    {
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Entrer une phrase ou un mot afin de compter le nombre de fois qu'apparait une lettre donnée : ");
        String phrase = lectureClavier.nextLine().toLowerCase ();
        System.out.println("Entrer la lettre à rechercher dans la phrase : ");
        String lettre = lectureClavier.next().toLowerCase ();
        int nbLettres = phrase.length();

        int i;
        int compteur = 0;

        for(i=0; i<=nbLettres-1; ++i)
        {
            String l = phrase.substring(i, i+1);

            if (l.equals(lettre))
            {
                compteur++;
            }
        }
        System.out.println("La lettre " + "\"" + lettre + "\"" + " apparait " + compteur + " fois dans la phrase");
    }


    public static void exercice7StringToken()
    {
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Entrer une suite de mots séparés par des espaces : ");
        String str1 = lectureClavier.nextLine();
        System.out.println("Entrer un séparateur (espace, ;, ., une lettre, un chiffre...) : ");
        String str2 = lectureClavier.next();
        System.out.println("Entrer le numéro du mot désiré : ");
        int n = lectureClavier.nextInt();
        int nbMots = str1.split("[ ]").length;

        String[] tab_str1 = str1.split(" ");
        //System.out.println(Arrays.toString(tab_str1));

        int i;

        String transformation_str1 = "";

        for (i=0; i<=nbMots-2; i++)
        {
            transformation_str1 = transformation_str1 + tab_str1[i] + str2;
        }
        transformation_str1 = transformation_str1 + tab_str1[i];
        System.out.println(transformation_str1);

        String test = Arrays.toString(transformation_str1.split(str2));
        //System.out.println(test);

        if ((n>nbMots) || (n<1))
        {
            System.out.println(" Erreur : n° du mot hors du tableau ");
        }

        System.out.println("Le mot n° " + n + " est : " + tab_str1[n-1]);

    }

} //class
