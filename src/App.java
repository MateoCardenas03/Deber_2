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
