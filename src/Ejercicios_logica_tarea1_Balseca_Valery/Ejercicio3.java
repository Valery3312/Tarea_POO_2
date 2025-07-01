package Ejercicios_logica_tarea1_Balseca_Valery;

// Una persona compra 3 productos con precios distintos.
// Se desea calcular el total y aplicar un 10% de descuento si el total supera los 100.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Declaración de variables
        double producto1, producto2, producto3;
        double total, descuento = 0, totalFinal;

        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el precio del primer producto: ");
        producto1 = sc.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        producto2 = sc.nextDouble();

        System.out.print("Ingrese el precio del tercer producto: ");
        producto3 = sc.nextDouble();

        // Cálculo del total sin descuento
        total = producto1 + producto2 + producto3;

        // Aplicar 10% de descuento si el total supera 100
        if (total > 100) {
            descuento = total * 0.10;
        }

        totalFinal = total - descuento;

        // Mostrar resultados
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

        sc.close();
    }
}





