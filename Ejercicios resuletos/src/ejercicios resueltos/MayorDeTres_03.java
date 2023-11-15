package impares;
import java.util.Scanner;
public class MayorDeTres_03 {
    public static void main(String[] args) {
        double n1, n2, n3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        n1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        n2 = teclado.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        n3 = teclado.nextDouble();
        if((n1==n2)&&(n2==n3))
            System.out.println("Los tres numeros son iguales");
        else
            if((n1>n2)&&(n1>n3))
                System.out.println("El mayor es: "+n1);
            else{
                if((n2>n1)&&(n2>n3))
                    System.out.println("El mayor es: "+n2);
                else
                    System.out.println("El mayor es: "+n3);
            }
    }
}