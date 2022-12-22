package UI;

import tools.TransCoder;
import model.Message;
import java.util.Scanner;



public class Menu
{
    public static void init()
    {
        Scanner scanner = new Scanner(System.in);
        String ret;
        boolean encore = true;
        do
        {
            System.out.println("======================================================================");
            System.out.println("|| Choisissez un exo (écrire le n° de l'exercice) ou 0 pour quitter ||");
            System.out.println("|| 1: Test 1 TransCoder encode                                      ||");
            System.out.println("|| 2: Test 2 TransCoder decode                                      ||");
            System.out.println("|| 3: Décoder un message                                            ||");
            System.out.println("|| 4: Encoder un message                                            ||");
            System.out.println("|| 0: quitter                                                       ||");
            System.out.println("======================================================================");

            ret = scanner.nextLine();
            switch (ret)
            {
                case "1":
                    String key = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
                    TransCoder trans = new TransCoder(key);
                    String mess = "Hello world";
                    trans.encode(mess);
                    break;
                case "2":
                    key = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
                    trans = new TransCoder(key);
                    mess = "AQAPAHAHAFBNAGAFADAHBZ";
                    trans.decode(mess);
                    break;
                case "3":
                    boolean encodeDecode = true;
                    System.out.println("encodeDecode : " + encodeDecode);
                    Message message = new Message(encodeDecode);
                    break;
                case "4":
                    encodeDecode = false;
                    System.out.println("encodeDecode : " + encodeDecode);
                    message = new Message(encodeDecode);
                    break;
                case "0":
                    System.out.println("================================================================================");
                    System.out.println("|            Fin du programme \"TD Application bases fondamentales\"           |");
                    System.out.println("================================================================================");
                    encore= false;
                    break;
                default:
                    System.out.println("N° d'exercice incorrect, veuillez rentrer un numéro d'exercice valide ");
                    break;
            }
        }
        while (encore);
    } //init
}
