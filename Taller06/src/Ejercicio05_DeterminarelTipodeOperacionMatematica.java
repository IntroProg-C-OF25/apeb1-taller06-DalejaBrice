
/**
 * Dado un número del 1 al 4 que representa una operación matemática básica (suma, resta, multiplicación, división),
 * muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma";
 * si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio05_DeterminarelTipodeOperacionMatematica {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int operacion;
        System.out.print("Dame un numero del 1 al 4: ");
        operacion = tcl.nextInt();
        switch (operacion) {
            case 1:
                System.out.print("Suma");
                break;
            case 2:
                System.out.print("Resta");
                break;
            case 3:
                System.out.print("Multiplicacion");
                break;
            case 4:
                System.out.print("Division");
                break;
            default:
                System.out.println("Ese numero no es, ingrese otro numero");
        }
    }
}
