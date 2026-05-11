package controllers;

import models.Person;

public class PersonController {
    
    //Metodo que ordena un arreglo de persona
    //por su EDAD(age), con  metodo insercion

    public void sortPersonByAge(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j>=0 && personas[j].getAge() > aux.getAge()) {
                personas[j+1] = personas[j];
                j--;
            }     
            personas[j + 1] = aux;
        }
    }

    public void sortPersonByName(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j>=0 && personas[j].getName().compareTo(aux.getName())>0){
                personas[j+1] = personas[j];
                j--;
            }     
            personas[j + 1] = aux;
        }
    }

    //Metodo ordena las personas segun el promedio de sus notas con seleccion

    public void sortPersonByAvrNotas(Person[] personas){
        for (int i = 0; i < personas.length; i++) {
            int indiceMenor = i;
            for (int j = i+1; j < personas.length; j++) {
                // comparacion para actualizar el idiceMenor
                if(personas[j].getPromedio() < personas[indiceMenor].getPromedio()){  // <-- se puede quitar las llaves cuando dentro del if, while, etc. hay una sola linea de codigo
                    indiceMenor = j;
                }
            }
            // Pregunto si el indiceMenor != i
            // Entonces cambio de posiciones
            if( i != indiceMenor){
                Person aux = personas[i];
                personas[i] = personas[indiceMenor];
                personas[indiceMenor] = aux;
            }
        }
    }

    // Ordenar el arreglo de personas por un valor de su nombre
    // el valor del nombre sera la cantidad de letras
    // donde las vocales valen 5
    // y las consonantes valen el valor de la edad
    // Ej: Juan 20                Ej: Ana 80
    // 20 + 5 + 5 + 20 = 50       5 + 80 + 5 = 90 

    public void sortPersonByNameValue(Person[] personas){
        
            for (int i = 0; i < personas.length; i++) {
            int indiceMenor = i;
            for (int j = i+1; j < personas.length; j++) {
                if(personas[j].getValueName() < personas[indiceMenor].getValueName()){  // <-- se puede quitar las llaves cuando dentro del if, while, etc. hay una sola linea de codigo
                    indiceMenor = j;
                }
            }

            if( i != indiceMenor){
                Person aux = personas[i];
                personas[i] = personas[indiceMenor];
                personas[indiceMenor] = aux;
            }
        }
    }

}