package Exos.Exercice3Formes;

public class Cercle extends Forme
{
    private float rayon;

    public Cercle(float r)
    {
        rayon = r;
    }
    public float Aire()
    {
        // ici l’Aire est calculée avec le rayon
        return (float)(Math.PI * Math.pow(rayon, 2));
    }
}
