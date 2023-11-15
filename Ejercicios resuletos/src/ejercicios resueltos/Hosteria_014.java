package javaapplication7;

import java.util.Scanner;

public class Hosteria_014 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dias;
        double costoDia, descuento, costoTotal, subtotal;
        System.out.println("Ingresa el numero de dias que te vas a hospedar en la hosteria:");
        dias = teclado.nextInt();
        System.out.println("Ingresa el valor del costo por dia de hospedaje:");
        costoDia = teclado.nextDouble();
        subtotal = dias * costoDia;
        costoTotal = dias * costoDia;
        descuento = 0;
        if (dias > 15) {
            descuento = costoTotal * 0.2;
            costoTotal = costoTotal - descuento;
        } else {
            if (dias > 10) {
                descuento = costoTotal * 0.15;
                costoTotal = costoTotal - descuento;
            } else {
                if (dias > 5) {
                    descuento = costoTotal * 0.1;
                    costoTotal = costoTotal - descuento;
                }
            }
        }
        System.out.println("SUBTOTAL: " + subtotal);
        System.out.println("DESCUENTO: " + descuento);
        System.out.println("TOTAL: " + costoTotal);
    }
}
