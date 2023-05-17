import java.util.Scanner;

public class Actividad2{
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);

        //02.Cambios de Temperatura//
        int Temperatura;
        int C;
        
        System.out.println("Ingrese Grados celcius: ");
        Temperatura = entrada.nextInt();

        C = (Temperatura * 9/5) + 32;

        System.out.println("Los grados en fahrenheit son: "+C); 
    
    }
}