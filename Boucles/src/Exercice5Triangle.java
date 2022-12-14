import java.util.Scanner;

public class Exercice5Triangle
{
    public static void main(String[] args)
    {
        Scanner $lectureClavier = new Scanner(System.in) ;

        System.out.println("Entrer un nombre de lignes afin de dessiner le triangle : ") ;
        int $nbLigne = $lectureClavier.nextInt();

        int $i;
        int $j;
        int $k;
        int $n=3;

        for ($i = 1; $i <= $nbLigne; $i++)
        {
            for ($k=(2*$nbLigne)-$n; $k>=0; $k--)
            {
                System.out.print(" ");
            }
            for ($j = 1; $j <= ($i*2)-1; $j++)
            {
                System.out.print("*");
            }
            $n+=1;
            System.out.println("");
        }

    }
}
