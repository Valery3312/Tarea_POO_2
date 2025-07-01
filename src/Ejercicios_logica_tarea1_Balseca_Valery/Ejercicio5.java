package Ejercicios_logica_tarea1_Balseca_Valery;

//Se deben imprimir los números del 1 al 10 y calcular su suma total.

public class Ejercicio5 {
    public static void main(String[] args) {

        int suma = 0; // Variable para acumular la suma

        System.out.print("Números del 1 al 10:");

        // Bucle para recorrer los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);     // Imprime el número actual
            suma = suma + i;           // Acumula la suma
        }

        // Muestra el resultado final
        System.out.print("La suma total es: " + suma);
    }
}