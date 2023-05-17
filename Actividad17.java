import java.util.Scanner;

public class Actividad17{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double pesos;
        double tasaUSD = 4.536; 
        double tasaEUR = 4.931; 
        double tasaJPY = 33;   
        double tasaGBP = 5.666; 

        double canUSD;
        double canGBP;
        double canJPY;
        double canEUR;

        System.out.println("Ingrese su monto en pesos colombianos: ");
        pesos = entrada.nextDouble();

        canUSD = pesos * tasaUSD;
        canEUR = pesos * tasaEUR;
        canJPY = pesos * tasaJPY;
        canGBP = pesos * tasaGBP;

        System.out.println("Cantidad convertida:");
        System.out.println("USD: "+canUSD);
        System.out.println("EUR: "+canEUR);
        System.out.println("JPY: "+canJPY);
        System.out.println("GBP: "+canGBP);
    }
}