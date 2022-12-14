import java.util.Arrays;
import java.util.Scanner;

public class Exercice1
{
    public static void main(String[] args)
    {
        Scanner $lectureClavier = new Scanner(System.in) ;

        System.out.println("Entrer la taille du tableau : ") ;
        int $tailleTab = $lectureClavier.nextInt();

        int $tab[] = new int[$tailleTab];

        int $i;

        for ($i = 0; $i < $tailleTab; $i++)
        {
            System.out.println("Entrer un nombre à insérer dans le tableau : ") ;
            $tab [$i] = $lectureClavier.nextInt();
        }
        System.out.println(Arrays.toString($tab));
    }
}
