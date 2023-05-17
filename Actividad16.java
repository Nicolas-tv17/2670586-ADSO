import java.util.Scanner;

public class Actividad16{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double inversion;
        double interes;
        double tasaini;
        double fin;
        int periodos;

         System.out.print("Ingrese la inversión inicial: ");
        inversion = entrada.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        interes = entrada.nextDouble();

        System.out.print("Ingrese el número de períodos: ");
        periodos = entrada.nextInt();

        tasaini = interes / 100;
        fin = inversion * Math.pow(1 + tasaini, periodos);

        System.out.println("El monto final obtenido es: " + fin);
    }
}