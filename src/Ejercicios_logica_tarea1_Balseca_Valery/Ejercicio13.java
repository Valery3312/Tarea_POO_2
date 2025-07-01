package Ejercicios_logica_tarea1_Balseca_Valery;

import java.util.Scanner;

//El sistema solicita al usuario ingresar 5 números. Se debe acumular la suma de esos números y mostrar el total al final.

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        // Solicitar 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
            suma += numero; // Acumular la suma
        }

        // Mostrar el resultado final
        System.out.println("\n🔢 La suma total de los 5 números es: " + suma);

        sc.close();
    }
}