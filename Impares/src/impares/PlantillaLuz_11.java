package impares;
import java.util.Scanner;
public class PlantillaLuz_11 {
    public static void main(String[] args) {
        double kilosUsados,precioKilo,sinDescuento,conDescuento;
        int edad;
        Scanner put = new Scanner(System.in);
        System.out.println("Ingresar el numero de Kilovatios consumidos: ");
        kilosUsados= put.nextDouble();
        System.out.println("Ingresaar el valor del Kilovatio: ");
        precioKilo= put.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad= put.nextInt();
        sinDescuento= precioKilo*kilosUsados;
        if(edad>65){
            conDescuento= sinDescuento-(sinDescuento*0.15);
            System.out.println("El precio a pagar CON descuento es: "+conDescuento);
        }
        else
            System.out.println("El precio a pagar SIN descuento es: "+sinDescuento);
    }
}
