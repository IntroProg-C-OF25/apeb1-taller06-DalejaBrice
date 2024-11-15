
/**
 * Dado un número del 1 al 12, que representa un mes del año, muestra el nombre del mes
 * correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Enero"; si ingresa 2,
 * debe mostrar "Febrero", y así sucesivamente.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio04_ConvertirunNumerodeMesANombre {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int mes;
        System.out.print("Ingrese un numero del 1 al 12: ");
        mes = tcl.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2: 
                System.out.println("Febrero");
                break;
            case 3: 
                System.out.println("Marzo");
                break;
            case 4: 
                System.out.println("Abril");
                break;
            case 5: 
                System.out.println("Mayo");
                break;
            case 6: 
                System.out.println("Junio");
                break;
            case 7: 
                System.out.println("Julio");
                break;
            case 8: 
                System.out.println("Agosto");
                break;
            case 9: 
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11: 
                System.out.println("Noviembre");
                break;
            case 12: 
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Numero incorrecto");
        }


        
    }
}
