import java.util.Scanner;

public class Exercice2SommeEntiersInfN
{
    public static void main(String[] args)
    {
        int $n;
        int $som = 0;

        int $i;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un nombre afin d'afficher la somme de tous les nombres inférieurs : ");
        $n = $lectureClavier.nextInt() ;

        for ($i = 1; $i < $n; $i++)
        {
            $som += $i;
        }
        System.out.println("La somme des nombres inférieurs à " + $n + " est : " + $som);
    }
}
