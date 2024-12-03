/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;
public class Empleado {
        public static double calcular_salario(double NHT, double VHN){
            /* Se crean dos variables horas extras trabajdas(HET) teniendo en
            cuenta el valor normal hora trabajada y se crea otra variable de
            horas extras que exceden de 8(HEE8) para reconocer las horas extras
            trabajadas por el empleado y sumarlas a su salario total
            */
            double HET, HEE8;
            if (NHT > 40){
                HET = NHT - 40;
                if (HET > 8){
                HEE8 = HET - 8;
                return 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
                }
                else {
                return 40 * VHN + HET * 2 * VHN;
                }
            }
            else {
            return NHT * VHN;
            }
    }
}
