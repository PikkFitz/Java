package Exos.Exercice3Formes;

public class Exercice3Formes
{
    public static void exercice3Formes()
    {
        Carre Carre1 = new Carre(2);
        Cercle Cercle1 = new Cercle(4);
        Triangle Triangle1 = new Triangle(6, 5);

        System.out.println("Aire du Carré 1 : " + Carre1.Aire() + " m2") ;
        System.out.println("Aire du Cercle 1 : " + Cercle1.Aire() + " m2") ;
        System.out.println("Aire du Triangle 1 : " + Triangle1.Aire() + " m2") ;
    }
}
