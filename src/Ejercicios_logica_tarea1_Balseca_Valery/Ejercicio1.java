package Ejercicios_logica_tarea1_Balseca_Valery;

//Un estudiante tiene una calificación inicial de 14.
// Si su asistencia supera el 80%, se le suman 2 puntos. Para aprobar necesita mínimo 16 puntos finales.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Declaración de variables
        double calificacionInicial = 14.0;
        double asistencia;
        double calificacionFinal;

        Scanner sc = new Scanner(System.in);

        // Entrada de datos: porcentaje de asistencia ........
        System.out.print("Ingrese el porcentaje de asistencia del estudiante (ejemplo: 85 para 85%): ");
        asistencia = sc.nextDouble();

        // Lógica de evaluación
        if (asistencia > 80) {
            calificacionFinal = calificacionInicial + 2;
        } else {
            calificacionFinal = calificacionInicial;
        }

        // Mostrar resultados
        System.out.println("Calificación final: " + calificacionFinal);

        if (calificacionFinal >= 16) {
            System.out.println("¡El estudiante APRUEBA!");
        } else {
            System.out.println("El estudiante NO aprueba.");
        }

        sc.close();
    }
}