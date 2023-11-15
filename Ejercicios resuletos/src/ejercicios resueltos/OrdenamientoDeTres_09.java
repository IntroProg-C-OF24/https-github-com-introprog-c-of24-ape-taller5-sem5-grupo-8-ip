package impares;
import java.util.Scanner;
public class OrdenamientoDeTres_09 {
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
                if(n2>n3)
                    System.out.println("El orden es: "+n3+" - "+n2+" - "+n1);
                else
                    System.out.println("El orden es: "+n2+" - "+n3+" - "+n1);
            else
                if((n2>n1)&&(n2>n3))
                    if(n1>n3)
                        System.out.println("El orden es: "+n3+" - "+n1+" - "+n2);
                    else
                        System.out.println("El orden es: "+n1+" - "+n3+" - "+n2);
                else
                    if(n1>n2)
                        System.out.println("El orden es: "+n2+" - "+n1+" - "+n3);
                    else
                        System.out.println("El orden es: "+n1+" - "+n2+" - "+n3);
    }
}