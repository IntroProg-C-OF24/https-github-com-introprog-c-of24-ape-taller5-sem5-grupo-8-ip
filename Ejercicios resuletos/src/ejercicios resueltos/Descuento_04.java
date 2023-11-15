package javaapplication7;

import java.util.Scanner;

public class Descuento_04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioOriginal, precioDescuento;
        System.out.println("Ingrese el precio: ");
        precioOriginal = teclado.nextDouble();
        precioDescuento = precioOriginal - (precioOriginal * 0.10);
        if (precioOriginal > 100) {
            System.out.println("Precio con descuento: " + precioDescuento);
        } else {
            System.out.println("Precio Final: " + precioOriginal);
        }
    }

}
