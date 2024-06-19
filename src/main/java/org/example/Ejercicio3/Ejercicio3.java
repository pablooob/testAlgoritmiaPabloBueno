package org.example.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static int LeerHorasTrabajadas(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        return horasTrabajadas;
    }

    public static double LeerTarifa(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la tarifa: ");
        double tarifa = scanner.nextDouble();
        return tarifa;
    }

    public static void CalculoSalario(double tarifa, int horasTrabajadas){
        double salario = 0;
        if(horasTrabajadas > 40){
            int horasExtras = horasTrabajadas - 40;
            salario = 40 * tarifa + horasExtras * (tarifa * 1.5);
        } else {
            salario = horasTrabajadas * tarifa;
        }
        System.out.println("El salario es: " + salario);

    }
}
