import java.util.Scanner;

public class Exercice4NombreVoyelle
{
    public static void main(String[] args)
    {
        Scanner $lectureClavier = new Scanner(System.in) ;

        System.out.println("Entrer un mot afin de connaitre son nombre de voyelle(s) : ") ;
        String $mot = $lectureClavier.nextLine();

        String $lettre;
        String $voyelles = "aeiouyAEIOUY";
        int $longueurMot = $mot.length();
        int $compteur = 0;

        int $i;

        for ($i = 0; $i < $longueurMot; $i++)
        {
            $lettre = $mot.substring($i, $i+1);

            if($voyelles.indexOf($lettre) != -1)
            {
                $compteur++;
            }
        }
        System.out.println("Le nombre de voyelles contenues dans le mot " + $mot + " est égale à : " + $compteur);
    }
}
