import java.util.Scanner;

public class Actividad13{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int segundo;
        int hora;
        int minuto;
        int segundosRestantes;

        System.out.print("Ingrese el número de segundos: ");
        segundo = entrada.nextInt();

        hora = segundo / 3600;
        minuto = (segundo % 3600) / 60;
        segundosRestantes = (segundo % 3600) % 60;

        System.out.println("Tiempo convertido: " + hora + " horas, " + minuto + " minutos, " + segundosRestantes + " segundos");
    }
}