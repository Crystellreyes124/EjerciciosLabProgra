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
public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner leer =new Scanner(System.in);
         double salarioMensual, salarioAnual, ISR=0;
         String nombre;
          System.out.print(" || Ingrese el nombre de un empleado:  ||: ");
            nombre= leer.nextLine();
          
            System.out.print(" || Salario Mensual del empleado:  ||: ");
            salarioMensual= leer.nextInt();
            salarioAnual=salarioMensual*12;
            
            if (salarioAnual>=0.01 && salarioAnual<=152557.15){
                ISR=0.00;
            } else if (salarioAnual>=152557.16 && salarioAnual<=232622.61){
                ISR=salarioMensual*0.15;
            } else if (salarioAnual>=232622.62 && salarioAnual<=540982.82){
                ISR=salarioMensual*0.20;
            }else if (salarioAnual>=540982.82 ){
                ISR=salarioMensual*0.25;
            }
            
            
            System.out.print(" || Deduccion de IRS mensual:  ||: "+ ISR+"\n");
}
}
