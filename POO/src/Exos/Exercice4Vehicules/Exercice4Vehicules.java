package Exos.Exercice4Vehicules;

public class Exercice4Vehicules
{
    public static void exercice4Vehicules()
    {
        Avion Avion1 = new Avion("Avion", "Avion1", 4);
        Velo Velo1 = new Velo("Velo", "Velo1", 1);
        Bateau Bateau1 = new Bateau("Bateau", "Bateau1", 6);
        Voiture Voiture1 = new Voiture("Voiture", "Voiture1", 5);

        Avion1.Marche();
        Avion1.Places();
        Velo1.Marche();
        Velo1.Places();
        Bateau1.Marche();
        Bateau1.Places();
        Voiture1.Marche();
        Voiture1.Places();
    }
}
