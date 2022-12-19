package Exos.Exercice4Vehicules;

public abstract class Vehicule
{
    private String type;
    private String nom;
    private int nbPlaces;

    // Constructor
    public Vehicule(String type, String nom, int nbPlaces)
    {
        this.type = type;
        this.nom = nom;
        this.nbPlaces = nbPlaces;
    }

    //Getter
    public String getType()
    {
        return type;
    }

    public String getNom()
    {
        return nom;
    }

    public int getNbPlaces()
    {
        return nbPlaces;
    }

    // Setter


    public void setType(String type)
    {
        this.type = type;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setNbPlaces(int nbPlaces)
    {
        this.nbPlaces = nbPlaces;
    }

    public void Marche()
    {
        System.out.println(this.nom + " de type " + this.type + " est en marche !") ;
    }

    public void Places()
    {
        System.out.println("Nombre de place(s) dans " + this.getNom() + " : " +  this.nbPlaces) ;
    }
}
