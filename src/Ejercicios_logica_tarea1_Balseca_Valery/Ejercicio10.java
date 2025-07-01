package Ejercicios_logica_tarea1_Balseca_Valery;

//Un sistema solicita al usuario que ingrese su nombre de usuario y contraseña. Si acierta  le muestra un mensaje de bienvenida.
// caso contrario Si falla UN MENSAJE que la información ingesada no es CORRECTA.

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos correctos predefinidos
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "12345";

        // Solicitar datos al usuario
        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioIngresado = sc.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = sc.nextLine();

        // Verificar si los datos coinciden
        if (usuarioIngresado.equals(usuarioCorrecto) && contrasenaIngresada.equals(contrasenaCorrecta)) {
            System.out.println("✅ Bienvenido, " + usuarioIngresado + "!");
        } else {
            System.out.println("❌ La información ingresada NO es correcta.");
        }

        sc.close();
    }
}