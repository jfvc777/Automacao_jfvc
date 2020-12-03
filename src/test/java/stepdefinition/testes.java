package stepdefinition;

import java.io.IOException;
import java.util.Random;

/**
 * @author Juan Castillo
 * @since 01/12/2020
 */
public class testes {

    public static void main(String[] args) throws IOException {

        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int N = alphabet.length();
        String teste[] = new String[10] ;
        String fraseCompleta = "";

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            teste[i] = String.valueOf(alphabet.charAt(r.nextInt(N)));
            fraseCompleta = fraseCompleta + teste[i];
        }

        System.out.println("fraseCompleta = " + fraseCompleta);


    }

}
