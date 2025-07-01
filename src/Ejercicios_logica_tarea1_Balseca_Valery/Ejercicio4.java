package Ejercicios_logica_tarea1_Balseca_Valery;

//En una competencia, cada participante recibe un puntaje.
// Si el puntaje es mayor o igual a 80, gana medalla. Si no, queda como finalista.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Declaración de variables
        int puntaje;

        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el puntaje del participante: ");
        puntaje = sc.nextInt();

        // Evaluación del puntaje
        if (puntaje >= 80) {
            System.out.println("¡Felicidades! El participante gana una MEDALLA.");
        } else {
            System.out.println("El participante queda como FINALISTA.");
        }

        sc.close();
    }
}