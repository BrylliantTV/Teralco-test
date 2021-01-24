package Menu;

import Ejercicio1.Ej1;
import Ejercicio2.Ej2;
import Ejercicio3.Ej3;
import Ejercicio4.Ej4;
import util.Teclado;

import java.util.Scanner;

public class menu {

    static Teclado sc = new Teclado();

    public static void menuEjercicios () {
        Teclado in = new Teclado();

        System.out.println("\n***************************************************");
        System.out.println("**     Bienvenido al Test de Conocimientos       **");
        System.out.println("***************************************************");
        System.out.println("");

        while (true) {
            System.out.println("*************************************************");
            System.out.println("**   1 -         Menu de ejercicio 1.          **");
            System.out.println("**   2 -         Menu de ejercicio 2.          **");
            System.out.println("**   3 -         Menu de ejercicio 3.          **");
            System.out.println("**   4 -         Menu de ejercicio 4.          **");
            System.out.println("**   5 -         Salir de la aplicación.       **");
            System.out.println("*************************************************");

            int opcionInicial = in.getInt("\nSelecciona una opción:");
            if (opcionInicial != 1 && opcionInicial != 2 && opcionInicial != 3 && opcionInicial != 4 && opcionInicial != 5) {
                System.out.println("\nNo existe esa opción\n\n");
                System.out.println("Por favor, escoja una opcion.");
                System.out.println("----------------------------");
            }
                opcionesInicial(opcionInicial);
        }
    }
    public static void opcionesInicial (int opcion) {
        Teclado in = new Teclado();

        switch (opcion) {
            case 1:
                menuEj1();
                break;
            case 2:
                menuEj2();
                break;
            case 3:
                menuEj3();
                break;
            case 4:
                menuEj4();
                break;
            case 5:
                System.out.println("Se ha cerrado la aplicación correctamente");
                System.exit(0);
            default:
                System.out.println("No existe esa opción.\n");
                break;
        }
    }
    public static void menuEj1(){
        Ej1 ej1 = new Ej1 ();
        System.out.println("Bienvenido, introduce un número por favor: ");
        int numeroej1 = sc.getInt("");
        ej1.contadorNumeros(numeroej1);
    }
    public static  void menuEj2(){
        Ej2 ej2 = new Ej2();
        System.out.println("Introduce un numero: ");
        int numeroImpar = sc.getInt("");
        ej2.numerosImpares(numeroImpar);
    }
    public static  void menuEj3(){
        Scanner sc = new Scanner(System.in);
        Ej3 ej3 = new Ej3();
        System.out.println("Bienvenido, introduce un número o la palabra DANGER");
        String auxString = sc.nextLine();
        ej3.numberOrText(auxString);

    }
    public static  void menuEj4(){
        Ej4 ej4 = new Ej4();
            int auxBillete = 0;
        while (auxBillete != 10 && auxBillete != 20 && auxBillete != 50 && auxBillete != 100 && auxBillete != 200 && auxBillete != 500) {
            System.out.println("Introduce un billete (10,20,50,100,200,500): ");
            auxBillete = sc.getInt("");
            if (auxBillete != 10 && auxBillete != 20 && auxBillete != 50 && auxBillete != 100 && auxBillete != 200 && auxBillete != 500) {
                System.out.println("\nNo existe esa opción\n\n");
                System.out.println("Por favor, escoja una opcion.");
                System.out.println("----------------------------");
            }
        }
        System.out.println("**   1 -    En monedas de 50 centimos.    **");
        System.out.println("**   2 -    En monedas de 1 Euro          **");
        System.out.println("**   3 -    En monedas de 2 Euros.        **");
        System.out.println("Escoge una de las 3 opciones: ");
        int auxMoneda = sc.getInt("");
        if (auxMoneda != 1 && auxMoneda != 2 && auxMoneda != 3) {
            System.out.println("\nNo existe esa opción\n\n");
            System.out.println("Por favor, escoja una opcion.");
            System.out.println("----------------------------");
        }
        ej4.cambioDinero(auxBillete, auxMoneda);
    }
}
