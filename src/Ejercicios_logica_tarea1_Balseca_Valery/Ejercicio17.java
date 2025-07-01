package Ejercicios_logica_tarea1_Balseca_Valery;

//El usuario ingresará 15 números.
//Con un ciclo `for`, identificar cuántos de ellos son negativos.
//Mostrar cuántos valores negativos fueron ingresados.
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativos = 0;

        System.out.println("🔢 Ingrese 15 números:");

        // Bucle para ingresar 15 valores...
        for (int i = 1; i <= 15; i++) {
            System.out.print("Número " + i + ": ");
            double numero = sc.nextDouble();

            if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("\n❗ Cantidad de números negativos ingresados: " + negativos);

        sc.close();
    }
}
