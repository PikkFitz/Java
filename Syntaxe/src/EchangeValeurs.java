// Echanger les valeurs de nX et nY (V1.0, 06/12/2022)

public class EchangeValeurs
{
    public static void main(String[] args)
    {
        int $nX = 1;
        int $nY = 2;
        int $temp = $nX;

        $nX = $nY;

        $nY = $temp;

        System.out.println("nX = "+ $nX + " et nY = " + $nY);
    }



}
