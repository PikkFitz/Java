import java.util.Scanner;

public class Exercice2Age
{
    public static void main(String[] args)
    {
        int $anneeNaissance;
        int $calcul;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer une année de naissance afin de déterminer si la personne est majeure ou mineure : ");
        $anneeNaissance = $lectureClavier.nextInt() ;

        $calcul = 2022 - $anneeNaissance;

        if ($calcul < 18)
        {
            System.out.println("La personne a " + $calcul + " ans et est mineure");
        }
        else
        {
            System.out.println("La personne a " + $calcul + " ans et est majeure");
        }
    }
}
