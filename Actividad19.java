import java.util.Scanner;

public class Actividad19{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        double salario;

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        edad = entrada.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        salario = entrada.nextDouble();

        System.out.println("Información del empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}