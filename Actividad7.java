import java.util.Scanner;

public class Actividad7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //07.calculo de descuento//

        double precio;
        double descuento;
        double por_descuento;
        double fin;

        System.out.println("Calculo de descuento");

        System.out.println("Ingrese el precio del producto: ");
        precio = entrada.nextDouble();

        System.out.println("Ingrese el descuento: ");
        descuento = entrada.nextDouble();

        por_descuento = precio * descuento / 100;
        fin = precio - por_descuento;

        System.out.println("El precio final del produto es: "+fin);
    }
}