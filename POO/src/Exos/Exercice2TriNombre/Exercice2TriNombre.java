package Exos.Exercice2TriNombre;

import Exos.Exercice2TriNombre.TriNombre;

public class Exercice2TriNombre
{
    public static void exercice2TriNombre()
    {
        TriNombre T1 = new TriNombre();
        TriNombre T2 = new TriNombre();

        System.out.print("Tableau 1 AVANT le tri : ") ;
        T1.affiche();
        System.out.print("Tableau 2 AVANT le tri : ") ;
        T2.affiche();

        T1.tri();
        T2.tri();

        System.out.print("Tableau 1 APRES le tri : ") ;
        T1.affiche();
        System.out.print("Tableau 2 APRES le tri : ") ;
        T2.affiche();
    }
}
