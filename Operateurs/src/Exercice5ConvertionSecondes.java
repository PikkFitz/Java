import java.util.Scanner;

public class Exercice5ConvertionSecondes
{
    public static void main(String[] args)
    {
        int $nbSec;
        int $heure;
        int $min;
        int $sec;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un nombre de secondes à convertir au format HH:MM:SS : ");
        $nbSec = $lectureClavier.nextInt() ;

        $heure = $nbSec/3600;
        System.out.println($heure);

        $min = $nbSec%3600/60;
        System.out.println($min);

        $sec = $nbSec%3600%60;
        System.out.println($sec);

        System.out.println($nbSec + " secondes équivaut à : " + $heure + ":" + $min + ":" + $sec);




    }
}
