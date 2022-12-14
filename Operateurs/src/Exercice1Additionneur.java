import java.util.Scanner;

public class Exercice1Additionneur
{
    public static void main(String[] args)
    {
        int $n1;
        int $n2;
        int $somme;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un premier nombre : ");
        $n1 = $lectureClavier.nextInt() ;
        System.out.println("Entrer un second nombre : ");
        $n2 = $lectureClavier.nextInt() ;

        $somme = $n1 + $n2;
        System.out.println("La somme de ces 2 nombres est : " + $somme);

    }
}
