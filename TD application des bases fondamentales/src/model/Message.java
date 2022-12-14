package model;

import tools.TransCoder;
import org.germain.tool.ManaBox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Message
{
    private Boolean encoded;
    private Path keyPath;
    private String key;
    private Path msgClearPath;
    private List<String> msgClear;
    private Path msgEncodedPath;
    private List<String> msgEncoded;
    private TransCoder transCoder;


    // !!!!!!!!!!!!!!! CONSTRUCTOR !!!!!!!!!!!!!!!!!!
    public Message(boolean encodeDecode)
    {
        this.encoded = encodeDecode;
        System.out.println("encoded : " + encoded);

        String dossierProjet = System.getProperty("user.dir");
        String path = dossierProjet + "/docs";
        System.out.println("Chemin du dossier docs : " + path);


        // !!!!!!!!!!!!!!! KEY PATH !!!!!!!!!!!!!!!

        keyPath = Paths.get(path, "key.txt");
        System.out.println("Chemin du fichier key.txt : " + keyPath);

        // On teste si le fichier existe
        if (Files.exists(keyPath))
        {
            System.out.println(" Fichier trouvé !");
        }
        else
        {
            System.out.println("Le fichier n'existe pas !");
        }


        // !!!!!!!!!!!!!!! KEY !!!!!!!!!!!!!!!

        try
        {
            key = ManaBox.decrypt(Files.readString(keyPath));
            System.out.println("Clé décryptée !");
            System.out.println("key : " + key);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            // Affiche l’exception avec d’autres détails comme le numéro de ligne et le nom de la classe où l’exception s’est produite (aide au diagnostique)
            System.out.println(e.getMessage());
        }

        if (encoded.equals(false))
        {
            // !!!!!!!!!!!!!!! MESSAGE CLEAR PATH !!!!!!!!!!!!!!!
            System.out.println("Message NON encodé --> MESSAGE CLEAR PATH");

            msgClearPath = Paths.get(path, "messageClear.txt");
            System.out.println("Chemin du fichier messageClear.txt : " + msgClearPath);

            // On teste si le fichier existe
            if (Files.exists(msgClearPath))
            {
                System.out.println(" Fichier trouvé !");
            }
            else
            {
                System.out.println("Le fichier n'existe pas !");
            }


            // !!!!!!!!!!!!!!! MESSAGE CLEAR !!!!!!!!!!!!!!!

            List<String> listeClear = new ArrayList<>();
            try
            {
                listeClear = readAllLines(msgClearPath);
            }
            catch (IOException e)
            {
                e.printStackTrace();
                // Affiche l’exception avec d’autres détails comme le numéro de ligne et le nom de la classe où l’exception s’est produite (aide au diagnostique)
                System.out.println(e.getMessage());
            }

            for (String messageClear : listeClear)
            {
                System.out.println("messageClear : " + messageClear);
                //msgClear = messageClear;
            }
            msgClear = listeClear;
        }
        else
        {
            // !!!!!!!!!!!!!!! MESSAGE ENCODED PATH !!!!!!!!!!!!!!!

            System.out.println("Message encodé --> MESSAGE ENCODED PATH");


            msgEncodedPath = Paths.get(path, "messageEncoded.txt");
            System.out.println("Chemin du fichier messageClear.txt : " + msgEncodedPath);

            // On teste si le fichier existe
            if (Files.exists(msgEncodedPath))
            {
                System.out.println(" Fichier trouvé !");
            }
            else
            {
                System.out.println("Le fichier n'existe pas !");
            }


            // !!!!!!!!!!!!!!! MESSAGE ENCODED !!!!!!!!!!!!!!!

            List<String> listeEncoded = new ArrayList<>();
            try
            {
                listeEncoded = readAllLines(msgEncodedPath);
            }
            catch (IOException e)
            {
                e.printStackTrace();
                // Affiche l’exception avec d’autres détails comme le numéro de ligne et le nom de la classe où l’exception s’est produite (aide au diagnostique)
                System.out.println(e.getMessage());
            }

            for (String messageEncoded : listeEncoded)
            {
                System.out.println("messageEncoded : " + messageEncoded);
                //msgEncoded = messageEncoded;
            }
            msgEncoded = listeEncoded;

        }


        // !!!!!!!!!!!!!!! TRANSCODER !!!!!!!!!!!!!!!

        transCoder = new TransCoder(key);

    }


    // !!!!!!!!!!!!!! METHODES !!!!!!!!!!!!!!!!!

    // !!!!!!!!!!!!!! METHODE READNWRITE !!!!!!!!!!!!!!!!!
    public void readNwrite()
    {
        String msgFinal = "";

        String projectFolder = System.getProperty("user.dir");
        String home = projectFolder + "/docs";
        //System.out.println(home);

        Path path = Paths.get(home, "messageFinal.txt");
        //System.out.println(path);

        // On teste si le fichier existe
        if(Files.exists(path))
        {
            System.out.println("Fichier \"messageFinal.txt\" trouvé !");
        }
        else
        {
            System.out.println("Le fichier \"messageFinal.txt\" n'existe pas !");
        }


        // !!!!!! TRANSCODAGE ET ECRITURE DANS LE FICHIER !!!!!!

        if (encoded.equals(false))
        {
            System.out.println("ENCODAGE du message...");

            for (String ligne : msgClear)
            {
                String ligneEncoded = transCoder.encode(ligne);
                try
                {
                    Files.writeString(path, ligneEncoded + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    // StandardOpenOption.CREATE --> Créer le fichier si il n'existe pas
                    // StandardOpenOption.APPEND --> Ajoute le texte (à la suite de l'existant) dans fichier existant du même nom au lieu de l'écraser et le remplacer
                    // System.lineSeparator() --> Ajoute le texte en passant une ligne
                    System.out.println("Le message a été écrit dans : " + path);
                }
                catch (IOException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            //msgFinal = this.transCoder.encode(msgClear);
            //System.out.println("msgFinal : " + msgFinal);
        }
        else
        {
            System.out.println("DECODAGE du message...");

            for (String ligne : msgEncoded)
            {
                String ligneClear = transCoder.decode(ligne);
                try
                {
                    Files.writeString(path, ligneClear + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    // StandardOpenOption.CREATE --> Créer le fichier si il n'existe pas
                    // StandardOpenOption.APPEND --> Ajoute le texte (à la suite de l'existant) dans fichier existant du même nom au lieu de l'écraser et le remplacer
                    // System.lineSeparator() --> Ajoute le texte en passant une ligne
                    System.out.println("Le message a été écrit dans : " + path);
                }
                catch (IOException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    } // Methode readNwrite

}