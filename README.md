# Deber: Ejercicios en java

**Nombre:** Mateo Cardenas
**Carrera:** Ciencia de Datos e IA
**Materia** Programacion 2

## Ejercicio 1: Secuencia de Símbolos
**Pseudocodigo**
![Pseudocodigo1](assets\PsedocodigoSecuenciaSimbolos.jpeg)
**Diagrama de flujo**
![DF1](assets\DFSusecionSignos.jpeg)
**Traza**
![Tra1](assets\TrazaSucesionSignos.jpeg)

**Codigo en java**
```java
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
```
## Ejercicio 2: Dibujo de Inicial
**Pseudocodigo**
![Tra2](https://github.com/user-attachments/assets/1e3cfb2c-b52f-48cb-b73d-7b7e2d7832d4)
![Tra2](assets\PseudocodigoDibujarIniciales2.jpeg)
**Diagrama de flujo**
![DF2](assets\DFDibugarInicial.jpeg)
**Traza**
![Tra2](assets\TrazaDI.jpeg)
**Codigo en java**
```java
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
```

## Ejecución Principal (Main)

```java
package src;
public class App {
    public static void main(String[] args) {
        // Creamos una instancia de la clase SecuenciaSimbolos
        SecuenciaSimbolos secuencia = new SecuenciaSimbolos();
        
        // Llamamos al método para generar la secuencia
        secuencia.generarSecuencia();
        // Creamos una instancia de la clase DibujarInicial
        DibujarInicial dibujar = new DibujarInicial();  
        dibujar.dibujarInicial();

    }
}
```
## Ejeccucion aplicacion
javac src/*.java
java src.App
