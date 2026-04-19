package src;
import java.util.Scanner;

public class SecuenciaSimbolos {
    public void generarSecuencia() {
        // Creamos el scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Introduce la longitud de la secuencia: ");
        
        // Validamos que sea un número entero
        if (lectura.hasNextInt()) {
            int n = lectura.nextInt();
            
            System.out.println("Tu secuencia es:");
            
            // Ciclo para generar la secuencia
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            // Salto de línea al final
            System.out.println(); 
            
        } else {
            System.out.println("Error: Debes ingresar un número entero válido.");
        }
        
        
    }
}