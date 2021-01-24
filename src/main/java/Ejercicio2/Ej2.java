package Ejercicio2;

import java.lang.reflect.Array;

public class Ej2 {
    public void numerosImpares(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (esImpar(i)) {
                System.out.println(i);
            }
        }
        System.out.println("estos son los números impares que hay entre el 0 y el " + numero);
    }

    public boolean esImpar(int numero) {
        if (numero % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
