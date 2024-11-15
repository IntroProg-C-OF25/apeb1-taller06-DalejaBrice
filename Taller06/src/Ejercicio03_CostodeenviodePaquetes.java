
/**
 * Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete.
 * Si el peso es menor de 5 kg y la región es "local", el costo es de $5. Si pesa entre 5 y 10 kg,
 * el costo es de $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio03_CostodeenviodePaquetes {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double peso;
        String origen;
        System.out.print("Ingrese la region (local, nacional, otro): ");
        origen = tcl.nextLine();
        System.out.print("Ingrese el peso del envio: ");
        peso = tcl.nextDouble();
        if ((peso < 5) && (origen.equals("local"))) {
            System.out.println("El costo de envio es de $5");
        } else if ((peso >= 5 && peso <= 10) && (origen.equals("nacional"))) {
            System.out.println("El costo de envio es de $10");
        } else {
            System.out.println("El costo de envio es de $15");
        }
    }
}
