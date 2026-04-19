# Deber: Ejercicios en java

**Nombre:** Mateo Cardenas
**Carrera:** Ciencia de Datos e IA
**Materia** Programacion 2

## Ejercicio 1: Secuencia de Símbolos
**Pseudocodigo**

![Pseudocodigo1](https://github.com/user-attachments/assets/7c49f77d-26ed-4213-8a31-1bc39c8d0bc5)

**Diagrama de flujo**

![DF1](https://github.com/user-attachments/assets/daab357e-da70-44b4-813a-6e6896353b4a)

**Traza**

![Tra1](https://github.com/user-attachments/assets/6afc8540-9ec7-4474-a288-2a58102dc72c)

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
![Tra2](https://github.com/user-attachments/assets/e2b23f27-c7cc-41e3-8091-ceeb6243571d)

**Diagrama de flujo**

![DF2](https://github.com/user-attachments/assets/44f045c8-1dce-44ca-bfb0-55dd67b4f165)

**Traza**

![Tra2](https://github.com/user-attachments/assets/1dd0661b-56ef-478f-ab7f-1222f6a154c0)

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
