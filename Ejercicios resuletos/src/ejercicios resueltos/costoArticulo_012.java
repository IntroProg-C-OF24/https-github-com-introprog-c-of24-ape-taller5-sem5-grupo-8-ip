package javaapplication7;

import java.util.Scanner;

public class costoArticulo_012 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String producto;
        double costo, cantidad, costoFinal, descuento;
        System.out.println("Pon el nombre del producto que requieres");
        producto = teclado.nextLine();
        System.out.println("Pon la cantidad de unidades que requieres");
        cantidad = teclado.nextDouble();
        System.out.println("Pon el costo del producto");
        costo = teclado.nextDouble();
        costoFinal = costo * cantidad;
        if (cantidad > 50) {
            descuento = costoFinal * 0.15;
            costoFinal = costoFinal - descuento;
        }
        System.out.println("Costo por unidad de " + producto + ": " + costo);
        System.out.println("Unidades: " + cantidad);
        System.out.println("TOTAL: " + costoFinal);
    }
}
