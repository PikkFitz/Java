import java.util.Scanner;

public class Exercice3Calculette
{
    public static void main(String[] args)
    {
        float $nb1;
        float $nb2;
        float $resultat;
        String $operateur;

        Scanner $lectureClavier = new Scanner(System.in);

        System.out.println("Entrer un premier nombre : ");
        $nb1 = $lectureClavier.nextFloat() ;

        System.out.println("Entrer un second nombre : ");
        $nb2 = $lectureClavier.nextFloat() ;

        System.out.println("Entrer un opérateur (+ - * /) : ");
        $operateur = $lectureClavier.next() ;

        switch ($operateur)
        {
            case "+" ->
            {
                $resultat = $nb1 + $nb2;
                System.out.println("Le résultat de cette opération est égal à " + $resultat);
            }
            case "-" ->
            {
                $resultat = $nb1 - $nb2;
                System.out.println("Le résultat de cette opération est égal à " + $resultat);
            }
            case "*" ->
            {
                $resultat = $nb1 * $nb2;
                System.out.println("Le résultat de cette opération est égal à " + $resultat);
            }
            case "/" ->
            {
                if ($nb2!=0)
                {
                    $resultat = $nb1 / $nb2;
                    System.out.println("Le résultat de cette opération est égal à " + $resultat);
                }
                else
                {
                    System.out.println("Calcul impossible, division par 0 !");
                }
            }
            default -> System.out.println("Opérateur non valide");
        };
    }
}
