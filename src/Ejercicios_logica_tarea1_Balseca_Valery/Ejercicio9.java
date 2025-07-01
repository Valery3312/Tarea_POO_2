package Ejercicios_logica_tarea1_Balseca_Valery;

//Un estudiante realiza 4 exámenes. Si su promedio es mayor o igual a 7 y no tuvo ninguna nota menor a 4, aprueba el curso.
// Caso contrario, reprueba. Mostrar el promedio y el resultado.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double suma = 0;
        boolean tieneNotaMenorA4 = false;

        // Ingreso de notas
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la nota del examen " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            suma += notas[i];

            // Verificar si alguna nota es menor a 4
            if (notas[i] < 4) {
                tieneNotaMenorA4 = true;
            }
        }

        double promedio = suma / 4;

        // Evaluar condiciones de aprobación
        System.out.println("\nPromedio: " + promedio);

        if (promedio >= 7 && !tieneNotaMenorA4) {
            System.out.println("✅ El estudiante APRUEBA el curso.");
        } else {
            System.out.println("❌ El estudiante REPRUEBA el curso.");
        }

        sc.close();
    }
}