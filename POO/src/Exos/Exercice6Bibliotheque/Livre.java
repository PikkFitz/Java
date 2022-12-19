package Exos.Exercice6Bibliotheque;

import java.util.Scanner;
import java.util.UUID;

public class Livre
{
    private String titre;
    private String nom;
    private String prenom;
    private String categorie;
    private String isbn;
    private String code;


    // Constructor
    public Livre() //(String titre, String nom, String prenom, String categorie, UUID isbn)
    {
        Scanner lectureClavier = new Scanner(System.in) ;

        System.out.println("Entrer le titre du livre : ") ;
        String titreLivre = lectureClavier.nextLine();
        this.titre = titreLivre;

        System.out.println("Entrer le nom de l'auteur : ") ;
        String nomAuteur = lectureClavier.nextLine();
        this.nom = nomAuteur;

        System.out.println("Entrer le prénom de l'auteur : ") ;
        String prenomAuteur = lectureClavier.nextLine();
        this.prenom = prenomAuteur;

        System.out.println("Entrer la catégorie du livre : ") ;
        String categorieLivre = lectureClavier.nextLine();
        this.categorie = categorieLivre;

        UUID isbnLivre = UUID.randomUUID();
        String isbnLivreToString = isbnLivre.toString();
        this.isbn = isbnLivreToString;

        String codeLivre;
        String initNom = nom.substring (0, 2);
        String initPrenom = prenom.substring (0, 2);
        String initCat = categorie.substring (0, 2);
        int tailleIsbn = isbn.length();
        String finIsbn = isbn.substring (tailleIsbn-2, tailleIsbn);
        codeLivre = initNom + initPrenom + initCat + finIsbn;
        this.code = codeLivre;
    }

    // Getter
    public String getTitre()
    {
        return titre;
    }

    public String getNom()
    {
        return nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public String getCategorie()
    {
        return categorie;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String toString()
    {
        return "Titre du livre : " + titre + ", Nom de l'auteur : " + nom + ", Prenom de l'auteur : " + prenom + ", Catégorie du livre : " + categorie + ", ISBN : " + isbn + ", Code du livre : " + code;
    }
}
