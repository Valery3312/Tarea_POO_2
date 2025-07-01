package Clase4;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[] args) {
        Scanner ingreso=new Scanner(System.in);

        System.out.println("INGRESE UN VALOR DE LA RECTA");
           Double num=ingreso.nextDouble();

           if (num>0){
               System.out.println("EL VALOR INGRESADO ES POSITIVO");
           }

           else{
               System.out.println("EL VALOR INGRESADO ES NEGATIVO");
           }
    }

}

