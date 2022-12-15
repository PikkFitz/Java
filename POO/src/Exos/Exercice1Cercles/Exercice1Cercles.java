package Exos.Exercice1Cercles;

import Exos.Exercice1Cercles.Cercles;

public class Exercice1Cercles
{
    public static void exercice1Cercles()
    {
        Cercles cercle1 = new Cercles(0.1);
        Cercles cercle2 = new Cercles(0.45);

        System.out.println("Aire du cercle 1 : " + cercle1.calculSurface() + " m2");
        System.out.println("Circonference du cercle 1 : " + cercle1.calculCirconference() + " m");

        System.out.println("Aire du cercle 2 : " + cercle2.calculSurface() + " m2");
        System.out.println("Circonference du cercle 2 : " + cercle2.calculCirconference() + " m");
    }
}

