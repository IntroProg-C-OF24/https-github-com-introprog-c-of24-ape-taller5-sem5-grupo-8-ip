package javaapplication7;

import java.util.Scanner;

public class IMC_08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println("Ingresa tu peso en kilos");
        peso = teclado.nextDouble();
        System.out.println("Ingresa tu altura en metros:");
        altura = teclado.nextDouble();
        imc = peso / (altura * altura);
        if (imc < 18) {
            System.out.println("Estas bajo en peso");
            System.out.println("Tu IMC es: " + imc);
        } else {
            if (imc < 25) {
                System.out.println("Estas en tu peso ideal");
                System.out.println("Tu IMC es: " + imc);
            } else {
                if (imc < 30) {
                    System.out.println("Estas con sobrepeso");
                    System.out.println("Tu IMC es: " + imc);
                } else {
                    System.out.println("Estas con obesidad ");
                    System.out.println("Tu IMC es: " + imc);
                }
            }
        }
    }
}
