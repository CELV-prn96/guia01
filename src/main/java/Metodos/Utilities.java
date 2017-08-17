package Metodos;
// cesar Linares

public class Utilities {

    public static void main(String[] args) {
        System.out.println(getResume("este es mi primer proyecto de programacion java"));
        String texto = "bienvenidos a la programcion de java";
        System.out.println(capitalizar(texto));
        System.out.print(contarCoincidencias("la vida no  no trata de encontyarse a uno mismo,sino de crearse a uno mismo", "mismo"));

    }

    public static String getResume(String texto) {
        char letras = ' ';
        String frase = "";
        int contador = 30;
        int posicion;
        for (posicion = 0; posicion < contador; posicion++) {
            letras = texto.charAt(posicion);
            String axu = String.valueOf(letras);
            if (!axu.equals(" ")) {
                frase += letras;
            } else {
                frase += " ";
                contador += 1;
            }
        }
        return frase;
    }

    public static String capitalizar(String texto) {
        char[] caracteres = texto.toCharArray();
        int posicion;
        for (posicion = 0; posicion < texto.length(); posicion++) {
            caracteres[0] = Character.toUpperCase(caracteres[0]);
            if (caracteres[posicion] == ' ') {
                caracteres[posicion + 1] = Character.toUpperCase(caracteres[posicion + 1]);
            }
        }
        texto = String.valueOf(caracteres);
        texto = (texto.replace("  ", " "));
        return texto;
    }

    public static int contarCoincidencias(String frase, String texto) {
        int contador = 0;

        while (frase.indexOf(texto) > -1) {
            frase = frase.substring(frase.indexOf(texto) + texto.length(), frase.length());
            contador++;
        }
        return contador;
    }
}
