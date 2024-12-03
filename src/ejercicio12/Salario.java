/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
public class Salario {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String NOM;
        double NHT, VHN,SALARIO;
        /* Se crea una variable tipo string para el nombre(NOM), se crean 3 
        variables tipo double para el número de horas trabajadas(NHT), valor 
        hora normal trabajada(VHN) y para el pago total que recibe el trabajador
        (SALARIO)
        */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        NOM = lectura.next();
        
        System.out.println("Ingrese el número de horas trabajadas: ");
        NHT = lectura.nextDouble();
        
        System.out.println("Ingrese el valor normal de horas trabajadas: ");
        VHN = lectura.nextDouble();
        /*Se llama a la clase empleado para que retorne el salario del 
        trabajador con los valores ingresados anteriormente
        */
        SALARIO = Empleado.calcular_salario(NHT,VHN);
        System.out.println("El trabajador "+ NOM+ " Devengo $"+ SALARIO);
    }
}
