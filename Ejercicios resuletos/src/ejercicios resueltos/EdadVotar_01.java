package impares;
import java.util.Scanner;
public class EdadVotar_01 {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        if(edad>=18)
            System.out.println("SI puede votar");
        else
            System.out.println("NO puede votar");
    }
}