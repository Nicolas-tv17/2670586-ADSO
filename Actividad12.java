import java.util.Scanner;

public class Actividad12{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int ancho;
        int altura;
        double resul;

        System.out.println("Ingrese el ancho del rectangulo: ");
        ancho = entrada.nextInt();

        System.out.println("Ingrese la altura del rectangulo: ");
        altura = entrada.nextInt();

        resul = ancho * altura;

        System.out.println("El area del rectangulo es: "+resul);

    }
}
