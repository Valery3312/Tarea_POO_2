package Ejercicios_logica_tarea1_Balseca_Valery;

//Enunciado claro para programar:
//Se registran las visitas a una página web durante 30 días.
//Usar un for para pedir al usuario que ingrese el número de visitas de cada día.
//Al final, mostrar la suma total y el promedio.
//Entrada esperada: 30 números (visitas por día)
//Estructura usada: for
//Salida esperada:
//•	Total de visitas del mes
//•	Promedio diario

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalVisitas = 0;

        System.out.println("📊 Registro de visitas diarias durante 30 días:");

        // Registrar visitas de cada día
        for (int dia = 1; dia <= 30; dia++) {
            System.out.print("Ingrese el número de visitas del día " + dia + ": ");
            int visitasDia = sc.nextInt();

            // Validar que no se ingresen visitas negativas
            while (visitasDia < 0) {
                System.out.print("❌ Valor inválido. Ingrese un número positivo: ");
                visitasDia = sc.nextInt();
            }

            totalVisitas += visitasDia;
        }

        // Calcular promedio
        double promedio = (double) totalVisitas / 30;

        // Mostrar resultados
        System.out.println("\n📈 Total de visitas del mes: " + totalVisitas);
        System.out.println("📉 Promedio diario de visitas: " + promedio);

        sc.close();
    }
}