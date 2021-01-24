package Ejercicio3;

public class Ej3 {
    public void numberOrText(String valor) {
        String auxDanger = "DANGER";

        if (!valor.equals(auxDanger) && !isNumeric(valor)) {
            System.out.println("No hay de qué preocuparse...");
        } else if (valor.equals(auxDanger)) {
            System.out.println("HAY PELIGRO!");
        }
    }
    public static boolean isNumeric (String cadena) {
        int multiplicador = 5;
        try {
            int i = Integer.parseInt(cadena);
            int aux = i * multiplicador;
            System.out.println( i + " * " + multiplicador + " = " + aux);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
