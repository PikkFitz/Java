package Exos.Exercice5Clients;

public class Client
{
    private String prenom;
    private String adresse;
    private String ville;

    // Constructor
    public Client(String prenom, String adresse, String ville)
    {
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
    }

    //Getter
    public String getPrenom()
    {
        return prenom;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public String getVille()
    {
        return ville;
    }


    // Setter
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    public String toString()
    {
        return prenom + " " + adresse + " " + ville;
    }

}
