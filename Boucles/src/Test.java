import java.util.Scanner;

public class Test
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
            for ($k=(2*$nbLigne)-$n; $k >= 0; $k--)
            {
                System.out.print("*");
            }
            $n+=2;
            System.out.println("");
        }
    }
}

/*for ($k=(2*$nbLigne)-$n; $k >= 0; $k--)
            {
                System.out.print("*");
            }
            $n+=2;
            System.out.println("");*/