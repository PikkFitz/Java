public class SurfaceCercle
{
    final static double PI=3.1416;

    public static void main(String[] args)
    {
        double rayon;
        double surface;

        System.out.println("Entrer le rayon : ");
        rayon = Console.lireD();
        surface = PI * rayon * rayon;
        System.out.print("La surface du cercle vaut : ");
        System.out.println(surface);
    }
}
