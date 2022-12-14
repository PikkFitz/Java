import java.util.Scanner;

public class Exercice4CalculdelaMoyenne
{
    public static void main(String[] args)
    {
        float $noteDS;
        float $noteInterro;
        float $noteTP;
        float $moyenne;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer une note de devoir surveillé : ");
        $noteDS = $lectureClavier.nextInt() ;
        System.out.println("Entrer une note d'interrogation écrite : ");
        $noteInterro = $lectureClavier.nextInt() ;
        System.out.println("Entrer une note de travaux pratique : ");
        $noteTP = $lectureClavier.nextInt() ;

        $moyenne = ($noteDS*3 + $noteInterro*2 + $noteTP) /6;
        System.out.println("La moyenne coefficientée de ces 3 notes est : " + $moyenne );

    }
}
