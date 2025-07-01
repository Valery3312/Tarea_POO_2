package Ejercicios_logica_tarea1_Balseca_Valery;

//Se desea mostrar todos los números pares del 1 al 100. Al final, se debe indicar cuántos pares se encontraron.

public class Ejercicio12{
    public static void main(String[] args) {
        int contadorPares = 0;

        System.out.println("🔢 Números pares del 1 al 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                contadorPares++;
            }
        }

        System.out.println("\n\n✅ Total de números pares encontrados: " + contadorPares);
    }
}