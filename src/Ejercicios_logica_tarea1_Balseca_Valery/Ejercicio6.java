package Ejercicios_logica_tarea1_Balseca_Valery;

//Un sistema de votación verifica si una persona puede votar. Para hacerlo, debe tener al menos 16 años y presentar su cédula.
// Si cumple ambas condiciones, puede votar. Si no, se indica el motivo.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        String tieneCedula;

        // Solicitar la edad
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer antes de leer texto

        // Preguntar si tiene cédula
        System.out.print("¿Presenta su cédula? (si/no): ");
        tieneCedula = sc.nextLine();

        // Evaluar condiciones
        if (edad >= 16 && tieneCedula.equalsIgnoreCase("si")) {
            System.out.println("✅ Usted PUEDE votar.");
        } else {
            System.out.println("❌ Usted NO puede votar por los siguientes motivos:");

            if (edad < 16) {
                System.out.println("- No cumple con la edad mínima (16 años).");
            }

            if (!tieneCedula.equalsIgnoreCase("si")) {
                System.out.println("- No presentó su cédula.");
            }
        }

        sc.close();
    }
}