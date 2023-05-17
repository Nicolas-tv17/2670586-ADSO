import java.util.Scanner;

public class Actividad4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //04.Intercambio de variables sin variable auxiliar//
        System.out.println("Intercambio de variables sin variable auxiliar: ");


        int dato1;
        int dato2;

        System.out.println("Ingrese primer numero: ");
        dato1 = entrada.nextInt();

        System.out.println("Ingrese segundo numero: ");
        dato2 = entrada.nextInt();

        dato1 = dato1 + dato2;
        dato2 = dato1 - dato2;
        dato1 = dato1 - dato2;  

        System.out.println("Variables cambiadas son: ");
        System.out.println("primer numero: "+dato1);
        System.out.println("segundo numero: "+dato2);
    }
}