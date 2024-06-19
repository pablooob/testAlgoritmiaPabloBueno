package org.example.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int horasTrabajadas = Ejercicio3.LeerHorasTrabajadas();
        double tarifa = Ejercicio3.LeerTarifa();
        Ejercicio3.CalculoSalario(tarifa, horasTrabajadas);
    }

}