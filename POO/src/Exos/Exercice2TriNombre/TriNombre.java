package Exos.Exercice2TriNombre;

import java.util.Arrays;
import java.util.Scanner;

public class TriNombre
{
    private int tailleTab;
    private int tab[] = new int[tailleTab];

    // Constructor
    public TriNombre()
    {
        Scanner lectureClavier = new Scanner(System.in) ;

        System.out.println("Entrer la taille du tableau : ") ;
        int tabLength = lectureClavier.nextInt();
        this.tailleTab = tabLength;

        int array[] = new int[tabLength];
        for (int i = 0; i < tabLength; i++)
        {
            System.out.println("Entrer un nombre à insérer dans le tableau : ") ;
            array [i] = lectureClavier.nextInt();
        }
        this.tab = array;
    }

    // Getter
    public int[] gettab()
    {
        return tab;
    }
    public int gettailleTab()
    {
        return tailleTab;
    }

    // Setter
    public void settab(int[] tab)
    {
        this.tab = tab;
    }
    public void settailleTab(int tailleTab)
    {
        this.tailleTab = tailleTab;
    }

    public int[] tri()
    {
        boolean swap = false;
        int temp;
        int j;
        int k;

        for (j = 0; j <= (tailleTab - 1); j++)
        {
            swap = false;

            for (k = 0; k <= (tailleTab - 2); k++)
            {

                if (tab[k] > tab[k + 1])
                {
                    temp = tab[k];
                    tab[k] = tab[k + 1];
                    tab[k + 1] = temp;
                    swap = true;
                }
            }

            // Dans ce cas, !swap équivaut à swap != true ou swap == false
            if (!swap)
            {
                break;
            }
        }
        return this.tab;
    }

    public void affiche()
    {
        System.out.println(Arrays.toString(this.tab));
    }


} //Class TriNombre
