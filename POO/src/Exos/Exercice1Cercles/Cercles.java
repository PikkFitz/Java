package Exos.Exercice1Cercles;

public class Cercles
{
    private double rayon;

    // Constructor
    public Cercles(double r)
    {
        this.rayon = r;
    }

    // Getter
    public double getRayon()
    {
        return rayon;
    }

    // Setter
    public void setRayon(double rayon)
    {
        this.rayon = rayon;
    }

    public double calculSurface()
    {
        // ici l’Aire est calculée avec le rayon
        return (double)(Math.PI * Math.pow(rayon, 2));
    }

    public double calculCirconference()
    {
        // ici l’Aire est calculée avec le rayon
        return (double)(2 * Math.PI * rayon);
    }

} //class Cercles


