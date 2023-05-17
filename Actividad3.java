import java.util.Scanner;

public class Actividad3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //03.Intercambio de variables con variable auxiliar//
        System.out.println("Intercambio de variables con variable auxiliar: ");

        int num1;
        int num2;
        int almacen;

        System.out.println("Ingrese numero uno: ");
        num1 = entrada.nextInt();

        System.out.println("Ingrese numero dos: ");
        num2 = entrada.nextInt();

        almacen = num1;
        num1 = num2;
        num2 = almacen;

        System.out.println("numero uno es: " +num1);
        System.out.println("numero dos es: " +num2);
    }
}