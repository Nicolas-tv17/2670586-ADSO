import java.util.Scanner;

public class Actividad8{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //08.concatenacion de cadenas//

        String textone;
        String texto2; 
        String textofinal;
        
        

        System.out.println("Ingrese un texto: ");
        textone = entrada.nextLine();

        System.out.println("Ingrese otro texto: ");
        texto2 = entrada.nextLine();

        textofinal = textone + texto2;

        System.out.println("Texto concatenado: "+textofinal);
    }
}