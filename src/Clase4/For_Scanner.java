package Clase4;
import java.util.Scanner;
public class For_Scanner {
    public static void main (String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese un número: ");
      int num = sc.nextInt();
      int multi;
      for (int i=1; i<=5; i ++){
          multi =num * i;

          System.out.println(num+ " * "+ i + "=" + multi );









      }
    }






}
