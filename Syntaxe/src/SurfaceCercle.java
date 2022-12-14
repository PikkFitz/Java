// Surface d'un cercle (V1.0, 06/12/2022)

import java.util.Scanner;

public class SurfaceCercle
{
    final static double PI=3.1416;

    public static void main(String[] args)
    {
        double $rayon;
        double $surface;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer le rayon : ");
        $rayon = $lectureClavier.nextInt() ;
        $surface = PI * $rayon * $rayon;
        System.out.print("La surface du cercle vaut : ");
        System.out.println($surface);
    }
}
