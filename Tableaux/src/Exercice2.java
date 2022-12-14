import java.util.Arrays;
import java.util.Scanner;

public class Exercice2
{
    public static void main(String[] args)
    {
        Scanner $lectureClavier = new Scanner(System.in) ;

        String $tab[] = {"Antoine", "Bertrand", "Clément", "David", "Eric", "Fabien", "Gautier", "Hector", "Isabelle", "Jérome"};
        int $tailleTab = $tab.length;
        boolean $loop = true;

        int $i;
        int $compteur = 0;


        while ($loop == true)
        {
            System.out.println("Entrer un prénom afin de vérifier si il se trouve dans le tableau : ") ;
            String $prenom = $lectureClavier.nextLine();

            boolean $find = false;

            if ($prenom.equals("0") || $prenom.equals(""))
            {
                System.out.println("Prénom incorrect ---> Fin du programme");
                break;
            }
            else
            {
                for ($i=0; $i<=(($tailleTab-1)); $i++)
                {
                    if (($tab[$i].equals($prenom)) && (!$tab[$i].equals("")))
                    {
                        $find = true;
                        $compteur++;

                        int $j=$i;

                        for ($i=$j; $i<=$tailleTab-2; $i++)
                        {
                            $tab[$i] = $tab[$i+1];
                        }

                        $tab = Arrays.copyOfRange($tab, 0, $tailleTab - 1);
                        $tab = Arrays.copyOfRange($tab, 0, $tailleTab);
                        $tab[$tailleTab-1]="";

                        System.out.println("Prénom trouvé !");
                        System.out.println(Arrays.toString($tab));
                    }
                }

                if ($find == false)
                {
                    System.out.println("Prénom introuvable dans le tableau...");
                }

                else if ($compteur == $tailleTab)
                {
                    System.out.println("Tous les prénoms ont été trouvés, le tableau est désormais vide ! ---> Fin du programme");
                    break;
                }
            }
        }
    }
}
