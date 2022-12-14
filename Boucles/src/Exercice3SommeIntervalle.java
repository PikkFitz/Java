import java.util.Scanner;

public class Exercice3SommeIntervalle
{
    public static void main(String[] args)
    {
        int $n1;
        int $n2;
        int $som = 0;

        int $i;

        Scanner $lectureClavier = new Scanner(System.in) ;

        System.out.println("Entrer un nombre n1 : ") ;
        $n1 = $lectureClavier.nextInt() ;

        System.out.println("Entrer un nombre n2 : ") ;
        $n2 = $lectureClavier.nextInt() ;

        for ($i = $n1+1; $i < $n2; $i++)
        {
            $som += $i;
        }
        System.out.println("La somme des nombres compris entre " + $n1 + " et " + $n2 + " est : " + $som);
    }
}
