package org.example.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static int LeerNumero(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("seleccione un numero: ");
        int numero = scanner.nextInt();
        return numero;
    }
    public static void numeroParImpar(int numero){
        if(numero % 2 == 0){
            System.out.println("El numero es par");
            System.out.println("Los numeros descendientes son");
            for(int i = numero; i >= 0; i -= 2){
                System.out.println(i);
            }
        } else {
            System.out.println("El numero es impar");
            System.out.println("Los numeros descendientes son");
            for(int i = numero; i >= 1; i -= 2){
                System.out.println(i);
            }
        }
    }
}
