package Ejercicio4;

public class Ej4 {

    public void cambioDinero(double dinero, int opcion) {

        if (dinero != 0) {
            switch (opcion) {
                case 1:
                    //moneda 50 centimos
                    System.out.println("te devuelvo el cambio en monedas de 50 centimos");
                    dinero = dinero-0.5;
                    System.out.println("te queda por devolver: " + dinero);
                    cambioDinero(dinero, opcion);
                    break;
                case 2:
                    //moneda de 1 euro
                    System.out.println("te devuelvo el cambio en monedas de un 1 euro");
                    dinero = dinero - 1.0;
                    System.out.println("te queda por devolver: " + dinero);
                    cambioDinero(dinero, opcion);
                    break;
                case 3:
                    //moneda de 2 euro
                    System.out.println("te devuelvo el cambio en monedas de un 2 euro");
                    dinero = dinero - 2.0;
                    System.out.println("te queda por devolver: " + dinero);
                    cambioDinero(dinero, opcion);
                    break;
            }
        }
    }
}
