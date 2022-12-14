import java.util.Arrays;
import java.util.Scanner;

public class Exercice3
{
    public static void main(String[] args)
    {
        Scanner $lectureClavier = new Scanner(System.in) ;

        int $tab[] = {8, 2, 17, 3, 16, 4, 5, 1, 10, 9, 11, 12 , 13, 14, 15, 20, 19, 18, 7, 6};
        int $tailleTab = $tab.length;

        int $i;
        int $j;
        boolean $swap = false;
        int $temp;


        System.out.println("Taille du tableau : " + $tailleTab);
        System.out.println("Tableau AVANT le tri à bulles : ");
        System.out.println(Arrays.toString($tab));

        for($i =0; $i <= ($tailleTab-1); $i++)
        {
            $swap = false;

            for($j = 0; $j <= ($tailleTab-2); $j++)
            {

                if($tab[$j] > $tab[$j+1])
                {
                    $temp = $tab[$j];
                    $tab[$j] = $tab[$j+1];
                    $tab[$j+1] = $temp;
                    $swap = true;
                }

            }

            // Dans ce cas, !swap équivaut à swap != true ou swap == false
            if(!$swap)
            {
                break;
            }
        }

        System.out.println("Tableau APRES le tri à bulles : ");
        System.out.println(Arrays.toString($tab));

    }

}
