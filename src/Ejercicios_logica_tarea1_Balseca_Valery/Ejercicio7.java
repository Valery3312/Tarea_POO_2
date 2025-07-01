package Ejercicios_logica_tarea1_Balseca_Valery;

//En una tienda, un cliente compra productos con distintos precios.
// Si el total supera $150, se le aplica un 15% de descuento y si paga con tarjeta se suma una comisión del 2%. Calcular el monto final.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double descuento = 0;
        double comision = 0;
        double totalFinal;

        System.out.println("Ingrese los precios de los productos uno por uno.");
        System.out.println("Para finalizar, ingrese 0.");

        int contador = 1;
        while (true) {
            System.out.print("Precio del producto " + contador + ": ");
            double precio = sc.nextDouble();

            if (precio == 0) {
                break; // sale del bucle cuando el usuario ingresa 0
            }

            if (precio < 0) {
                System.out.println("Precio inválido. Intente nuevamente.");
                continue;
            }

            total += precio;
            contador++;
        }

        // Aplicar descuento si el total supera 150
        if (total > 150) {
            descuento = total * 0.15;
        }

        double subtotalConDescuento = total - descuento;

        // Preguntar si el pago es con tarjeta
        sc.nextLine(); // limpiar el buffer
        System.out.print("¿El pago es con tarjeta? (si/no): ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            comision = subtotalConDescuento * 0.02;
        }

        // Calcular total final
        totalFinal = subtotalConDescuento + comision;

        // Mostrar resultados
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Subtotal con descuento: $" + subtotalConDescuento);
        System.out.println("Comisión por tarjeta: $" + comision);
        System.out.println("Monto final a pagar: $" + totalFinal);

        sc.close();
    }
}
