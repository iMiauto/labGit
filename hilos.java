// lab de  hilos. 
import java.util.*;

public class hilos extends Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de hilos: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hilos hilo = new hilos();
            hilo.start();
        }
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo " + this.getName() + " ejecutando iteracion " + i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido: " + e.getMessage());
            }
        }
    }
}
public void comentaro() {
    System.out.println("Este es un comentario en el código.");
}