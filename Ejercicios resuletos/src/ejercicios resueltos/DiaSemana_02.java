package javaapplication7;

import java.util.Scanner;

public class DiaSemana_02 {

    public static void main(String[] args) {
        double dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        dia = teclado.nextInt();
        if (dia == 1) {
            System.out.println("Hoy es Lunes");
        } else if (dia == 2) {
            System.out.println("Hoy es martes");
        } else if (dia == 3) {
            System.out.println("Hoy es miercoles");
        } else if (dia == 4) {
            System.out.println("Hoy es Jueves");
        } else if (dia == 5) {
            System.out.println("Hoy es viernes");
        } else if (dia == 6) {
            System.out.println("Hoy es sabado");
        } else if (dia == 7) {
            System.out.println("Hoy es domingo");
        } else {
            System.out.println("Numero ingresado es incorrecto");
        }
    }

}
