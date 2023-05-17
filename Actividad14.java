import java.util.Scanner;

public class Actividad14{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3;
        int credito1, credito2, credito3;
        double suman;
        int sumacre;
        double total;

        System.out.println("Ingrese la nota de la primera materia: ");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese el credito de la primera materia: ");
        credito1 = entrada.nextInt();

        System.out.println("Ingrese la nota de la segunda materia: ");
        n2 = entrada.nextDouble();
        System.out.println("Ingrese el credito de la segunda materia: ");
        credito2 = entrada.nextInt();

        System.out.println("Ingrese la nota de la tercera materia: ");
        n3 = entrada.nextDouble();
        System.out.println("Ingrese el credito de la tercera materia: ");
        credito3 = entrada.nextInt();

        suman = (n1 * credito1)+(n2 * credito2)+(n3 * credito3);
        sumacre = credito1 + credito2 + credito3;

        total = suman / sumacre;

        System.out.println("El promedio ponderado es: "+total);
    }
}