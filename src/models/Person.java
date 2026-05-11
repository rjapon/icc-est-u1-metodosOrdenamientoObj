package models;

public class Person {

    private String name;
    private int age;
    private int[] notas;

    public Person(String name, int age, int[] notas) {
        this.name = name;
        this.age = age;
        this.notas = notas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getPromedio(){
        //Calcular el promedio
        //(suma de todas las notas)/cantidad de notas

        int suma = 0;
        for(int i : notas){
            suma = suma + i;
        }

        int resultado = suma/notas.length;

        return resultado;
    }

    public int getValueName() {
        int value = 0;
        for (int i = 0; i < name.length(); i++) {
            char letra = name.toLowerCase().charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                value += 5;
            }else{
                value += age;
            }

        }

        return value;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", promedio=" + getPromedio() + ", vM=" + getValueName() + "]";
    }
    
}
