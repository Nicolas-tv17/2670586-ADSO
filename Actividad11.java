import java.util.Scanner;

public class Actividad11{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //11.Cálculo del perímetro y área de un círculo
        double radio;
        double perimetro;
        double area;

        System.out.print("Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();

        perimetro = 2 * Math.PI * radio;
        area = Math.PI * radio * radio;

        System.out.println("El perímetro del círculo es: " + perimetro);
        System.out.println("El área del círculo es: " + area);
       
    }
}