import java.util.Scanner;

public class Exercice6ASCII
{
    public static void main(String[] args)
    {
        int $decimal;
        char $ascii;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un code Unicode décimal à convertir pour trouver son caractère ASCII correspondant : ");
        $decimal = $lectureClavier.nextInt() ;

        $ascii = (char)$decimal;
        System.out.println("Le caractère ASCII correspondant au code " + $decimal + " est : " + $ascii);

    }
}
