package clase3;

public class Ejercicio2Clase3 {
    public static String codificar(String palabra, int incremento){
        /*char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        palabra = palabra.replaceAll(" ", "");
        for (int i = 0; i < palabra.length(); i++){
            for (int j = 0; j < abecedario.length; j++){
                if (palabra.charAt(i) ==  'z'){
                    palabra = palabra.replace(palabra.charAt(i), 'a');
                }
                else if (palabra.charAt(i) == abecedario[j]) {
                    palabra = palabra.replace(palabra.charAt(i), abecedario[j+=incremento]);
                    System.out.println(palabra);
                }
            }
        }
        return palabra;
        tene en cuenta que replace reemplaza todo lo que encuentra, no solo el caracter que le especificas
       */

        char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        palabra = palabra.replaceAll(" ", "");
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++){
            for (int j = 0; j < abecedario.length; j++){
                if (palabra.charAt(i) ==  'z'){
                    resultado += 'a';
                }
                else if (palabra.charAt(i) == abecedario[j]) {
                    resultado += abecedario[j+incremento];
                }
            }
        }
        return resultado;

    }

    public static String decodificar(String palabra, int incremento){
        char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        palabra = palabra.replaceAll(" ", "");
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++){
            for (int j = 0; j < abecedario.length; j++){
                if (palabra.charAt(i) ==  'z'){
                    resultado += 'a';
                }
                else if (palabra.charAt(i) == abecedario[j]) {
                    resultado += abecedario[j-incremento];
                }
            }
        }
        return resultado;
    }
}