package Ejercicios_logica_tarea1_Balseca_Valery;

// El usuario ingresa un número, y el sistema debe mostrar la tabla de multiplicar del 1 al 10 de ese número utilizando un ciclo for.

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número al usuario
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = sc.nextInt();

        System.out.println("\n📊 Tabla de multiplicar del " + numero + ":");

        // Ciclo for para generar la tabla
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}