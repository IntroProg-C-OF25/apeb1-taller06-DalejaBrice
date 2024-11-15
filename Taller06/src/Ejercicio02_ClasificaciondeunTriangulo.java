
/**
 * Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:
 * Si todos los lados son iguales, mostrar "Triángulo equilátero".
 * Si dos lados son iguales, mostrar "Triángulo isósceles".
 * Si todos los lados son diferentes, mostrar "Triángulo escaleno".
 * Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 * @author Daniela Briceño
 */
import java.util.Scanner;
public class Ejercicio02_ClasificaciondeunTriangulo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.print("Ingrese el primero lado del triangulo: ");
        lado1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo lado del triangulo: ");
        lado2 = tcl.nextDouble();
        System.out.print("Ingrese el tercer lado del triangulo: ");
        lado3 = tcl.nextDouble();
        if ((lado1 == lado2) && (lado3 == lado1)){
            System.out.println("Triangulo equilatero");
        } else if (((lado1 == lado2 || lado1 == lado3) || (lado2 == lado3))) {
            System.out.println("Triangulo isosceles");
        } else {
            //if (((lado1 > lado2) || (lado1 < lado2)) && ((lado1 < lado3)|| (lado1 > lado3)) && ((lado2 < lado3) || (lado2 > lado3))) {
            System.out.println("Triangulo escaleno");
        }
    }
}
