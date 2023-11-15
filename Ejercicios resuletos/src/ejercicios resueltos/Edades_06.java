package javaapplication7;

import java.util.Scanner;

public class Edades_06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad de la persona");
        edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("La persona es una adulto");
        } else if (edad >= 12) {
            System.out.println("La persona es un adolescente");
        } else {
            System.out.println("La persona es un nino");
        }
    }

}
