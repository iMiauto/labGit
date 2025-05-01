// lab de  hilos. 
public class hola extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola " + i);
            try {
                sleep(1000); // dormir un segundo
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        hola h = new hola();
        h.start(); // iniciar el hilo
    }
}
