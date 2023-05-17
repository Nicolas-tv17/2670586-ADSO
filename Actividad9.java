import java.util.Scanner;

public class Actividad9{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //09.Comprobación de número par/impar//
    
        int n;
        int r;

        System.out.println("Ingresa un numero: ");
        n = entrada.nextInt();

        if ( n % 2 == 0){
            System.out.println("El número ingresado es par.");
        } else{
            System.out.println("El número ingresado es impar.");
        }
    }
}