package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal("cebra",1);
        animal1.nombre="Cebra";
        animal1.peso=1;


        Animal animal2 = new Animal("caballo",2);
        animal2.nombre="Caballo";
        animal2.peso=1;





        Familia familia = new Familia("cabrq","caballo");


        familia.tenerhijo("Cebrallo");


        familia.imprimirFamilia();




    }
}