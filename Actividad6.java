import java.util.Scanner;

public class Actividad6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //06.calculo del promedio//

        System.out.println("calcular el promedio: ");

        int cantidadNumeros;
        float sum;
        sum=0;
        int i;
        double promedio;
        float number2;

        System.out.print("¿Cuantos números quiere para su promedio? ");
        cantidadNumeros = entrada.nextInt();

        for (i = 0; i < cantidadNumeros; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            number2 = entrada.nextFloat();
            sum += number2;
        }

        promedio =  sum / cantidadNumeros;

        System.out.println("El promedio de los " + cantidadNumeros + " números es: " + promedio);

    }
}