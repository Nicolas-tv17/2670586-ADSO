import java.util.Scanner;

public class Actividad10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //10.division y resto//
    
        int nmro;
        int division;
        int div;
        int resto;

        System.out.print("Ingresa el numero: ");
        nmro = entrada.nextInt();

        System.out.print("Ingresa el divisor: ");
        div = entrada.nextInt();

        division = nmro / div;
        resto = nmro % div;

        System.out.println("Resultado de la división: " + division);
        System.out.println("Resto de la división: " + resto);

    }
}