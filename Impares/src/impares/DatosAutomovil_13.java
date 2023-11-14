package impares;
import java.util.Scanner;
public class DatosAutomovil_13 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        String marca, pais;
        double costo, impuesto, total;
        System.out.println("Ingresa la marca de tu carro");
        marca = put.nextLine();
        System.out.println("Ingresa el pais de origen de tu fierro viejo");
        pais = put.nextLine();
        System.out.println("Ingresa el costo del carro");
        costo = put.nextDouble();
        System.out.println("=====DATOS DEL AUTOMOVIL=====");
        System.out.println("Marca: "+marca);
        System.out.println("Pais de Origen: "+pais);
        if (pais.equals("Alemania")){
            impuesto = costo * 0.2;
            total = costo + impuesto;
            System.out.println("Costo: "+costo);
            System.out.println("Impuesto: "+impuesto);
            System.out.println("TOTAL: "+total);
        }    
        else { 
            if (pais.equals("Japon")){
                impuesto = costo * 0.3;
                total = costo + impuesto;
                System.out.println("Costo: "+costo);
                System.out.println("Impuesto: "+impuesto);
                System.out.println("TOTAL: "+total);
            }
            else {
                if (pais.equals("Italia")){
                    impuesto = costo * 0.15;
                    total = costo + impuesto;
                    System.out.println("Costo: "+costo);
                    System.out.println("Impuesto: "+impuesto);
                    System.out.println("TOTAL: "+total);
                }    
                else {
                    if (pais.equals("USA")){
                        impuesto = costo * 0.2;
                        total = costo + impuesto;
                        System.out.println("Costo: "+costo);
                        System.out.println("Impuesto: "+impuesto);
                        System.out.println("TOTAL: "+total);
                    }    
                    else{
                        System.out.println("Costo: "+costo);
                        System.out.println("TOTAL: "+costo);
                    }
                }
            }
        }
    }   
}