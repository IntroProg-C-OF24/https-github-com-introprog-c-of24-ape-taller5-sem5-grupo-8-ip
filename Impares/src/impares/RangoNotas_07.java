package impares;
import java.util.Scanner;
public class RangoNotas_07 {
    public static void main(String[] args) {
        double nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una nota: ");
        nota = teclado.nextDouble();
        if (nota >= 90)
            System.out.println("A");
        else
            if (nota >= 80)
                System.out.println("B");
            else
                if (nota >= 70)
                    System.out.println("C");
                else
                    System.out.println("D");  
    }  
}
