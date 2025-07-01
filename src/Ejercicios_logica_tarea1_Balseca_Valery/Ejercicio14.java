package Ejercicios_logica_tarea1_Balseca_Valery;

//Se ingresan las calificaciones de 6 estudiantes. Mostrar cada una, calcular el promedio y decir si el grupo en general aprobó (promedio ≥ 7).

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[6];
        double suma = 0;

        System.out.println("Ingrese las calificaciones de los 6 estudiantes:");

        // Ingreso de notas
        for (int i = 0; i < 6; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        // Mostrar todas las calificaciones
        System.out.println("\n📋 Calificaciones registradas:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
        }

        // Calcular promedio
        double promedio = suma / 6;
        System.out.println("\n📊 Promedio general del grupo: " + promedio);

        // Verificar aprobación
        if (promedio >= 7) {
            System.out.println("✅ El grupo APROBÓ en general.");
        } else {
            System.out.println("❌ El grupo NO aprobó en general.");
        }

        sc.close();
    }
}