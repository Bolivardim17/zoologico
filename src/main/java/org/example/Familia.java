package org.example;

public class Familia {

    String papa = "cebra";
    String mama = "caballo";
    String hijo = "cebrallo";

    public Familia(Animal papa, Animal mama, Animal hijo) {
        this.papa = "papa";
        this.mama = "mama";
        this.hijo = "hijo";
    }

    public Familia(String cebra, String caballo) {
    }

    public void imprimirFamilia() {

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: " + this.papa +
                        "\nLa mamá es: " + this.mama +
                        "\nEl hijo es: " + this.hijo
        );

    }

    public void tenerHijo(String nombre) {

        if (this.papa != null && this.mama != null) {

            Animal hijo = new Animal(nombre, 1);
            hijo.nombre = nombre;
            hijo.peso = hijo.peso;
            double random = Math.random();
            if (random < 0.5) {
                hijo.genero = "F";
            } else {
                hijo.genero = "M";
            }
            this.hijo = "M";

        } else {
            System.out.println("Aun no puedes tener hijos");
        }


    }

    public void tenerhijo(String cebrallo) {
    }
}