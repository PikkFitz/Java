package Exos.Exercice3Formes;

public class Triangle extends Forme
{
    private float base;
    private float hauteur;

    public Triangle(float base, float hauteur)
    {
        this.base = base;
        this.hauteur = hauteur;
    }

    public float Aire()
    {
        // ici l’Aire est calculée avec la base et la hauteur
        return (float)((base * hauteur) / 2);
    }
}
