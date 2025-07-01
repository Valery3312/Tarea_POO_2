package Ejercicios_logica_tarea1_Balseca_Valery;

//Un trabajador gana un sueldo base de 400. Por cada hora extra trabajada gana 10 adicionales.
// Debe calcularse el sueldo total si trabajó 5 horas extra.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Declaración e inicialización de variables
        double sueldoBase = 400.0;
        int horasExtra;
        double pagoPorHoraExtra = 10.0;
        double sueldoTotal;

        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la cantidad de horas extra trabajadas: ");
        horasExtra = sc.nextInt();

        // Cálculo del sueldo total
        sueldoTotal = sueldoBase + (horasExtra * pagoPorHoraExtra);

        // Mostrar resultado
        System.out.println("El sueldo total del trabajador es: $" + sueldoTotal);

        sc.close();
    }
}