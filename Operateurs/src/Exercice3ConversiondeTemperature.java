import java.util.Scanner;

public class Exercice3ConversiondeTemperature
{
    public static void main(String[] args)
    {
        float $F;
        float $C;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer une température en degrés F : ");
        $F = $lectureClavier.nextInt() ;

        $C = (5f/9f)*($F - 32);
        System.out.println("Cette température de " + $F + " F, est égale à " + $C + " °C");

    }
}
