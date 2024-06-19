package org.example.Ejercicio2;

import java.util.Random;

public class Ejercicio2 {

    public static Persona[] LeerPersonas(){
        Persona[] personas = new Persona[50];
        Random random = new Random();

        for(int i = 0; i < personas.length; i++){
            Persona persona = new Persona();
            persona.sexo = random.nextBoolean() ? 'M' : 'F';
            persona.edad = random.nextInt(100) + 1;

            personas[i] = persona;
        }

        return personas;
    }

    public static void AlgoritmoPersonas(Persona[] personas){
        int mayoresEdad = 0, menoresEdad = 0, mayoresEdadHombres = 0, menoresEdadMujeres = 0;
        int mujeresTotal = 0;

        for(Persona persona : personas){
            if(persona.edad >= 18){
                mayoresEdad++;
                if(persona.sexo == 'M'){
                    mayoresEdadHombres++;
                } else {
                    mujeresTotal++;
                }
            } else {
                menoresEdad++;
                if(persona.sexo == 'F'){
                    menoresEdadMujeres++;
                    mujeresTotal++;
                }
            }
        }

        double porcentajeMayoresEdad = (mayoresEdad * 100) / personas.length;
        double porcentajeMujeres = (mujeresTotal * 100) / personas.length;

        System.out.println("Estadisticas: ");
        System.out.println("a. Cantidad de personas mayores de edad (18 años o más): " + mayoresEdad);
        System.out.println("b. Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("c. Cantidad de personas masculinas mayores de edad: " + mayoresEdadHombres);
        System.out.println("d. Cantidad de personas femeninas menores de edad: " + menoresEdadMujeres);
        System.out.println("e. Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentajeMayoresEdad);
        System.out.println("Porcentaje que representan las mujeres respecto al total de personas.: " + porcentajeMujeres);
    }
}
