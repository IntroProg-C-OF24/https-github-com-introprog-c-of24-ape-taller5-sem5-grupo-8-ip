package impares;
import java.util.Scanner;
public class AnioBisiesto_05 {
    public static void main(String[] args) {
        double anio;
        Scanner put = new Scanner(System.in);
        System.out.println("Ingrese el año");
        anio=put.nextDouble();
        if((anio%4==0 && anio%100!=0) || (anio%400==0))
            System.out.println("SI es bisiesto");
        else
            System.out.println("NO es bisiesto");
    }
}