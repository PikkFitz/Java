import java.util.Scanner;

public class Exercice1EntiersInfN
{
    public static void main(String[] args)
    {
        int $n;
        int $i;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un nombre afin d'afficher les nombres inférieurs : ");
        $n = $lectureClavier.nextInt() ;

        for ($i = 1; $i < $n; $i++)
        {
            System.out.println($i);
        }
    }
}
