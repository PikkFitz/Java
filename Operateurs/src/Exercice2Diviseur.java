import java.util.Scanner;

public class Exercice2Diviseur
{
    public static void main(String[] args)
    {
        float $n1;
        float $n2;
        float $quotient;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un premier nombre : ");
        $n1 = $lectureClavier.nextInt() ;
        System.out.println("Entrer un second nombre : ");
        $n2 = $lectureClavier.nextInt() ;

        $quotient = $n1 / $n2;
        System.out.println("Le quotient de ces 2 nombres est : " + $quotient);

    }
}
