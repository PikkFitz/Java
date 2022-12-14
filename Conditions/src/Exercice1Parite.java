import java.util.Scanner;

public class Exercice1Parite
{
    public static void main(String[] args)
    {
        int $nombre;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un nombre afin de déterminer si il est pair ou impair : ");
        $nombre = $lectureClavier.nextInt() ;

        if ($nombre%2==0)
        {
            System.out.println("Le nombre " + $nombre + " est pair");
        }
        else
        {
            System.out.println("Le nombre " + $nombre + " est impair");
        }
    }
}
