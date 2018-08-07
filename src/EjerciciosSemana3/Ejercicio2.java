/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSemana3;
import java.util.Scanner;
/**
 *
 * @author Crystell Reyes
 */
public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner leer =new Scanner(System.in);
         int copia=0;
         
         
         
         do{
             int factorial, resultado=1;

         System.out.print(" || Ingrese un número:  ||: ");
            factorial= leer.nextInt();
             copia=factorial;
             while(factorial>=1){
                 resultado*=factorial;
                 factorial-=1;
   
             }
             
         if (copia>0){
         System.out.print(" || Factorial:  ||: "+ resultado+"\n");
         }
         
         } while(copia>0);
}
}