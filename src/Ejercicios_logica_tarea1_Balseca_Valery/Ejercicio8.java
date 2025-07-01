package Ejercicios_logica_tarea1_Balseca_Valery;

//Se registran las edades de 10 personas. El sistema debe contar cuántas son mayores de edad (18+) y mostrar un listado de las edades ingresadas.
// Además, mostrar la edad más alta y más baja.

    import java.util.Scanner;

    public class Ejercicio8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] edades = new int[10];
            int mayoresEdad = 0;
            int edadMax = Integer.MIN_VALUE;
            int edadMin = Integer.MAX_VALUE;

            // Registro de edades
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
                edades[i] = sc.nextInt();

                // Contar mayores de edad
                if (edades[i] >= 18) {
                    mayoresEdad++;
                }

                // Actualizar edad máxima y mínima
                if (edades[i] > edadMax) {
                    edadMax = edades[i];
                }

                if (edades[i] < edadMin) {
                    edadMin = edades[i];
                }
            }

            // Mostrar resultados
            System.out.println("\n📋 Edades registradas:");
            for (int edad : edades) {
                System.out.println("- " + edad + " años");
            }

            System.out.println("\n🔎 Cantidad de personas mayores de edad: " + mayoresEdad);
            System.out.println("📈 Edad más alta registrada: " + edadMax + " años");
            System.out.println("📉 Edad más baja registrada: " + edadMin + " años");

            sc.close();
        }
    }











