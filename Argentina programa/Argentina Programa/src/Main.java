import clase1.Ejercicio1Clase1;
import clase3.Ejercicio1Clase3;
import clase3.Ejercicio2Clase3;
import com.sun.source.doctree.SystemPropertyTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Clase 1");

        Ejercicio1Clase1.ejercicio1A(1, 5);

        System.out.println("--------------");

        Ejercicio1Clase1.ejercicio1B(1, 5);

        System.out.println("--------------");

        Ejercicio1Clase1.ejercicio1C(1, 5, 3);

        System.out.println("--------------");

        Ejercicio1Clase1.ejercicio1D(1,5);

        System.out.println("------------------------------------");

        System.out.println("Clase 3");

        int ejercicio1Clase3 = Ejercicio1Clase3.repeticiones("hola mundo", 'o');

        System.out.println("La cantidad de repeticiones es " + ejercicio1Clase3);

        System.out.println("--------------");

        ArrayList<Integer> lista = new ArrayList(5);
        for (int i : new int[]{1, 4, 8, 5, 9, 7}){
            lista.add(i);
        }

        System.out.println(Ejercicio1Clase3.ordenamiento(lista, true));
        System.out.println(Ejercicio1Clase3.ordenamiento(lista, false));

        System.out.println("--------------");

        System.out.println("La suma da " + Ejercicio1Clase3.sumaDesde(lista, 3));

        System.out.println("--------------");
        System.out.println(Ejercicio2Clase3.codificar("abcdef", 2));
        System.out.println(Ejercicio2Clase3.decodificar("cdefgh", 1));
    }
}