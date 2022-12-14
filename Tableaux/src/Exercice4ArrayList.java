import java.util.ArrayList;
import java.util.*;

public class Exercice4ArrayList
{
    public static void main(String[] args)
    {
        String $n;
        ArrayList<String> maliste = new ArrayList<String>();

        maliste.add("The Fleshtones");
        maliste.add("Hoodoo Gurus");
        maliste.add("The Bad Seeds");
        maliste.add("Wayne Kramer");

        System.out.println("On affiche la liste et la première cellule : ");
        System.out.println(maliste);
        System.out.println(maliste.get(0) + "\n");

        System.out.println("On modifie la première cellule de la liste et on l'affiche : ");
        maliste.set(0, "Traveling Wilburys");
        System.out.println(maliste.get(0) + "\n");

        System.out.println("On supprime la cellule d'index 3 et on affiche la liste et sa taille : ");
        maliste.remove(3);
        System.out.println(maliste);
        System.out.println("Taille de la liste : " + maliste.size() + "\n");

        System.out.println("On parcourt la liste avec une boucle \"for\" : ");
        for (int i = 0; i < maliste.size(); i++)
        {
            System.out.println(maliste.get(i));
        }
        System.out.println();

        System.out.println("On parcourt la liste avec une boucle \"for-each\" : ");
        for (String j : maliste)
        {
            System.out.println(j);
        }
        System.out.println();

        System.out.println("Autre exemple de boucle \"for-each\" : ");
        maliste.forEach((k)->
        {
            System.out.println(k);
        }); //Syntaxe fonction
        System.out.println();

        System.out.println("Création d'une ArrayList pour stocker des nombres entiers : ");
        ArrayList<Integer> nombres = new ArrayList<Integer>();
        nombres.add(128);
        nombres.add(256);
        nombres.add(512);
        nombres.add(1024);
        System.out.println("On parcourt la liste avec une boucle \"for-each\" : ");
        for (int l : nombres)
        {
            System.out.println(l);
        }
        System.out.println();

        System.out.println("Utilisation de la classe \"Collections\" du package java.util, elle possède une méthode sort() qui permet de trier des liste par ordre alphabétique ou numérique :");
        System.out.println("On trie la liste et on la parcourt avec une boucle \"for-each\" : ");
        Collections.sort(maliste);  // Tri de la liste
        for (String i : maliste)
        {
            System.out.println(i);
        }
        System.out.println();

    } //main
} //class
