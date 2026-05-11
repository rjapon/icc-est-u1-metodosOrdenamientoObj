import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas = {
            new Person("Juan", 25,new int[] {10, 15, 20}),
            new Person("Ana", 19, new int[] {15, 15, 20}),
            new Person("Carlos", 30, new int[] {10, 10, 10}),
            new Person("Maria", 22, new int[] {20, 15, 20}),
            new Person("Diego", 15, new int[] {20, 10, 20}),
        };

        //Imprimir
        //Ordenar
        //Imprimir

        for (Person person : personas) {
            System.out.println(person);
        }

        PersonController pController = new PersonController();

        pController.sortPersonByAge(personas);
        System.out.println("\n==== Ordenado ByAge ====\n");
        for (Person person : personas) {
            System.out.println(person);
        }

        pController.sortPersonByName(personas);
        System.out.println("\n==== Ordenado ByName ====\n");
        for (Person person : personas) {
            System.out.println(person);
        }

        pController.sortPersonByAvrNotas(personas);
        System.out.println("\n==== Ordenado ByNotas ====\n");
        for (Person person : personas) {
            System.out.println(person);
        }

    }

}
