package laboratorio.hilos;

public class HilosPrimos extends Thread {

    private long numero;
    private String nombre;

    public HilosPrimos(long numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public void run() {
        boolean esPrimo = true;
        long tiempo;
        long tiempoInicio, tiempoFinal;

        tiempoInicio = System.currentTimeMillis();

        if (numero <= 1) {
            esPrimo = false; // Los números menores o iguales a 1 no son primos
        } else if (numero <= 3) {
            esPrimo = true; // 2 y 3 son primos
        } else if (numero % 2 == 0 || numero % 3 == 0) {
            esPrimo = false; // Los múltiplos de 2 y 3 no son primos
        } else {
            // Verificar divisibilidad por números primos mayores a 3
            for (int i = 5; i * i <= numero; i += 6) {
                if (numero % i == 0 || numero % (i + 2) == 0) {
                    esPrimo = false;
                    break; // Si se encuentra un divisor, salir del bucle
                }
            }
        }

        tiempoFinal = System.currentTimeMillis();
        tiempo = tiempoFinal - tiempoInicio;

        System.out.println("El número procesado es: " + numero +
                ". El nombre del hilo es " + nombre +
                ". El tiempo empleado ha sido de " + tiempo + " milisegundos" +
                ". Es primo: " + esPrimo);
    }

    // Getter and Setter

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
