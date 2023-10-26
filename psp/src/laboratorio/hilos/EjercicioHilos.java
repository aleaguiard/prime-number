package laboratorio.hilos;

import javax.swing.JOptionPane;

public class EjercicioHilos {

	public static void main(String[] args) {
		
		try {
            long num1 = Long.parseLong(JOptionPane.showInputDialog("Introduce el primer número"));
            long num2 = Long.parseLong(JOptionPane.showInputDialog("Introduce el segundo número"));
            long num3 = Long.parseLong(JOptionPane.showInputDialog("Introduce el tercer número"));

            HilosPrimos hilo1 = new HilosPrimos(num1, "hilo1");
            HilosPrimos hilo2 = new HilosPrimos(num2, "hilo2");
            HilosPrimos hilo3 = new HilosPrimos(num3, "hilo3");

            hilo1.start();
            hilo2.start();
            hilo3.start();
        } catch (NumberFormatException e) {
            System.err.println("Error: Ingrese un número válido.");
        }
    }
}


