public class PerimetreCercle
{
    final static double PI=3.1416;

    public static void main(String[] args)
    {
        double rayon;
        double perimetre;

        System.out.println("Entrer le rayon: ");
        rayon = Console.lireD();
        perimetre = 2 * PI * rayon;
        System.out.print("Le périmètre vaut: ");
        System.out.println(perimetre);
    }
}
