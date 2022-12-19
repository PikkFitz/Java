package Exos.Exercice3Formes;

public class Carre extends Forme
{
    private float cote;

    public Carre(float c)
    {
        cote = c;
    }

    public float Aire()
    {
//Aire calcul ici la surface avec le coté c
        return (float) Math.pow(cote, 2);
    }
}
