package Clase4;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);

        System.out.println("INGRESE lA CAPITAL");
        String capital=ingreso.nextLine();

        if (capital.equalsIgnoreCase("QUITO")){
            System.out.println("ES LA CAPITAL DEL ECUADOR");
        }
        else{ System.out.println("NO ES LA CAPITAL, INGRESE LA CAPITAL");
        }

    }
}