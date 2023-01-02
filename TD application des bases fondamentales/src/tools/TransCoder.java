package tools;

import java.util.*;

public class TransCoder
{
    private HashMap<Character, String> encode = new HashMap<>();
    private HashMap<String, Character> decode = new HashMap<>();


    // !!!!!!!!!!!!!!! CONSTRUCTOR !!!!!!!!!!!!!!!!!!
    public TransCoder(String key)
    {
        // !!!!!!!!!!!!!!! ENCODE !!!!!!!!!!!!!!!

        char char1 = 'A';
        char char2 = 'A';

        for(int i=0; i<key.length(); i++)
        {
            char lettre = key.charAt(i);
            String concat = Character.toString(char1)+char2;
            //StringBuffer concat = new StringBuffer().append(char1).append(char2);
            encode.put(lettre, concat);
            if(char2=='Z')
            {
                char1++;
                char2='A';
            }
            else
            {
                char2++;
            }
        }
        System.out.println(encode);


        // !!!!!!!!!!!!!!! DECODE !!!!!!!!!!!!!!!

        char charA = 'A';
        char charB = 'A';

        for(int j=0; j<key.length(); j++)
        {
            String concat2 = Character.toString(charA)+charB;
            char lettre2 = key.charAt(j);
            decode.put(concat2, lettre2);
            if(charB=='Z')
            {
                charA++;
                charB='A';
            }
            else
            {
                charB++;
            }
        }
        System.out.println(decode);
    }

    // !!!!!!!!!!!!! GETTER SETTER!!!!!!!!!!!!!
    public HashMap<Character, String> getEncode()
    {
        return encode;
    }

    public void setEncode(HashMap<Character, String> encode)
    {
        this.encode = encode;
    }

    public HashMap<String, Character> getDecode()
    {
        return decode;
    }

    public void setDecode(HashMap<String, Character> decode)
    {
        this.decode = decode;
    }


    // !!!!!!!!!!!!!! METHODES !!!!!!!!!!!!!!!!!

    // !!!!!!!!!!!!!! ENCODE !!!!!!!!!!!!!!!!!

    public String encode(String msg)
    {
        String messageFinal = "";

        for (char a: msg.toCharArray())
        {
            messageFinal += encode.get(a);
        }
            System.out.println("MESSAGE ENCODE : " + messageFinal);
            return messageFinal;
    }

    // !!!!!!!!!!!!!! DECODE !!!!!!!!!!!!!!!!!

    public String decode(String msg)
    {
        String messageFinal = "";

        for (int i = 0; i<msg.length(); i=i+2)
        {
            String scanMsg = msg.substring(i, i+2);
            messageFinal += decode.get(scanMsg);
            //System.out.println(messageDecode);
        }
        System.out.println("MESSAGE DECODE : " + messageFinal);
        return messageFinal;
    }

}

