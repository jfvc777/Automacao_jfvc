package stepdefinition;

import java.util.Random;

/**
 * @author Juan Castillo
 * @since 01/12/2020
 */
public class funciones_generales {

    public int numAleatorioDesdeHasta(int desde, int hasta) {
        Random random = new Random();
        int valor = random.nextInt((hasta - desde) + 1) + desde;
        return valor;
    }

    public int generarNumeroAleatorio() {
        Random random = new Random();
        int valor = random.nextInt();
        return valor;
    }

    public int generarNumRandPorDigito(int cantDigitos) {
        String numZero = "1";
        String numZero1 = "";

        for (int i = 1; i <= cantDigitos - 1; i++) {
            numZero = numZero + "0";
        }
        numZero1 = numZero + "0";

        int valor = numAleatorioDesdeHasta(Integer.parseInt(numZero1) - 1, Integer.parseInt(numZero));

        return valor;
    }

    public String generarPalabrasRandom(int longitud) {
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int N = alphabet.length();
        String teste[] = new String[longitud];
        String fraseCompleta = "";
        Random r = new Random();

        for (int i = 0; i < longitud; i++) {
            teste[i] = String.valueOf(alphabet.charAt(r.nextInt(N)));
            fraseCompleta = fraseCompleta + teste[i];
        }

        return fraseCompleta;
    }


}
