import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {

        int peso;
        String mensaje;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dijite su peso: ");
        peso = entrada.nextInt();

        mensaje = (peso < 40) ? "Usted es delgado" : (peso > 40 && peso < 80 ) ? "Su peso es normal" : "Usted es obeso";

        System.out.println(mensaje);
    }
    
    
}
