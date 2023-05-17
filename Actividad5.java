import java.util.Scanner;

public class Actividad5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //05.Calculo del area del triangulo//

        System.out.println("Calcular area del triangulo: ");

        int B;
        int A;
        int area;
        
        System.out.println("Base del triangulo: ");
        B = entrada.nextInt();

        System.out.println("Altura del triangulo: ");
        A = entrada.nextInt();

        area = (B * A) / 2;

        System.out.println("El area del triangulo es: "+area); 

    }
}