package src;
import java.util.Scanner;

public class DibujarInicial {
    public void dibujarInicial() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la inicial de tu nombre (A, J, L): ");
        char inicial = sc.next().toUpperCase().charAt(0);

        System.out.print("¿Qué tan grande la quieres? (Introduce un número, ej. 5-15): ");
        int n = sc.nextInt();

        System.out.println("\n--- Resultado ---\n");

        switch (inicial) {
            case 'A':
                dibujarA(n);
                break;
            case 'J':
                dibujarJ(n);
                break;
            case 'L':
                dibujarL(n);
                break;
            default:
                System.out.println("Lo siento, por ahora solo sé dibujar la A, J y L.");
        }
        
        
    }

    // Método para dibujar la letra A
    public static void dibujarA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n * 2; j++) {
                if (j == n - i || j == n + i || (i == n / 2 && j > n - i && j < n + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Método para dibujar la letra J
    public static void dibujarJ(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean parteSuperior = (i == 0);
                boolean paloCentral = (j == n / 2);
                boolean curvaBase = (i == n - 1 && j <= n / 2);
                boolean gancho = (i >= n - n / 3 && j == 0);

                if (parteSuperior || paloCentral || curvaBase || gancho) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Método para dibujar la letra L
    public static void dibujarL(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}