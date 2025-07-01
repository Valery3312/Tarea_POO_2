package Ejercicios_logica_tarea1_Balseca_Valery;

//Se tienen lecturas de 50 sensores en tiempo real.
//Usar un `for` para ingresar cada valor de lectura.
//Mostrar cuántos sensores están fuera de rango (valor > 100 o valor < 0).

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fueraDeRango = 0;

        System.out.println("📡 Ingreso de lecturas de 50 sensores:");

        // Bucle para ingresar las 50 lecturas
        for (int i = 1; i <= 50; i++) {
            System.out.print("Lectura del sensor " + i + ": ");
            double lectura = sc.nextDouble();

            // Verificar si está fuera del rango permitido
            if (lectura < 0 || lectura > 100) {
                fueraDeRango++;
            }
        }

        // Mostrar el resultado
        System.out.println("\n⚠️ Sensores fuera de rango: " + fueraDeRango);

        sc.close();
    }
}