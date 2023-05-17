import java.util.Scanner;

public class Actividad20{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero;
        int digito;
        int i;
        String numeros;
        int suma;
        suma = 0;

        System.out.print("Ingrese un número entero de hasta 5 dígitos: ");
        numero = entrada.nextInt();

        numeros = String.valueOf(numero);
        for (i = 0; i < numeros.length(); i++) {
            digito = Character.getNumericValue(numeros.charAt(i));
            suma += digito;
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}