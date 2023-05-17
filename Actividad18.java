import java.util.Scanner;

public class Actividad18{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double altura;
        double peso;
        double masacor;

        System.out.print("Ingrese su peso: ");
        peso = entrada.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = entrada.nextDouble();

        masacor = peso / Math.pow(altura, 2);

        System.out.println("Su Índice de Masa Corporal es: " + masacor);
    }
}