
/**
 * La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online,
 * el cual calcule el precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales
 * y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.
 * Requisitos:
 * La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
 * Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete, del cual no se
 * aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.
 * b.El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, monto final dadas las siguientes
 * condiciones: a. Si el subtotal de la compra (sin descuentos o gastos de envío), supera los $1000, se le otorga un 20% de descuento;
 * y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. c.
 * El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio01_FacturaciondedosProductos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double prod1, prod2, costoEnvio, iva, descuento, subtotal, costofinal, costoProd, totaldescuento;
        System.out.print("Dame el costo del producto 1: ");
        prod1 = tcl.nextDouble();
        System.out.print("Dame el costo del producto 2: ");
        prod2 = tcl.nextDouble();
        System.out.print("Dame el costo del envio: ");
        costoEnvio = tcl.nextDouble();
        costoProd = (prod1 + prod2);
        subtotal = (prod1 + prod2);
        iva = subtotal * 0.10;
        descuento = 0.0;
        if (subtotal > 1000) {
            descuento = (subtotal * 0.20);
            subtotal = (subtotal - descuento);
        } else if (subtotal == 1000) {
            descuento = (subtotal * 0.05);
            subtotal = subtotal - descuento;
        }
        if (subtotal > 5000) {
            costoEnvio = 0.0;
            System.out.println("El envio es gratis.");
        }
        costofinal = subtotal + iva + costoEnvio;
        System.out.println("El costo total es: $" + costoProd + ", " + "Costo de los productos sin IVA: $" + subtotal + ", " + "el descuento es de: $" + descuento + ", " + "el costo final es: $" + costofinal);
    }
}
