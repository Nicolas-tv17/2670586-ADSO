import java.util.Scanner;

public class Actividad15{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double metros, cm, pulga, pie ;

        System.out.println("Ingrese sus medidas en metros: ");
        metros = entrada.nextDouble();
        
        cm = metros * 100;
        pulga = metros * 39.37;
        pie = metros * 3.281;

        System.out.println("Su medida ingresada en Pies es: "+pie+", en Centimetros es: "+cm+"y en pulgadas es: "+pulga);
    }
}