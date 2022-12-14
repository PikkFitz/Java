//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Console {
    public Console() {
    }

    public static byte lireB() {
        return Byte.valueOf(saisieChaine());
    }

    public static char lireC() {
        return saisieChaine().charAt(0);
    }

    public static Double lireD() {
        return Double.valueOf(saisieChaine());
    }

    public static Float lireF() {
        return Float.valueOf(saisieChaine());
    }

    public static int lireI() {
        return Integer.valueOf(saisieChaine());
    }

    public static Long lireL() {
        return Long.valueOf(saisieChaine());
    }

    public static Short lireS() {
        return Short.valueOf(saisieChaine());
    }

    public static String lireStr() {
        return saisieChaine();
    }

    private static String saisieChaine() {
        String chaineDeCaracteres = "";
        InputStreamReader saisie = new InputStreamReader(System.in);
        BufferedReader entree = new BufferedReader(saisie);

        try {
            chaineDeCaracteres = entree.readLine();
        } catch (IOException var4) {
        }

        return chaineDeCaracteres;
    }
}

