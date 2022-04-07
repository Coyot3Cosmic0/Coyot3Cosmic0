package com.company;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarMotor();
        System.out.println(miCoche.Puertas);
        System.out.println(miCoche.Motor);
    }

    static class Coche {
        int Puertas = 0;
        int Motor = 0;

        void AgregarPuertas() {
            this.Puertas++;
        }

        public void AgregarMotor() {
            this.Motor++;
        }
    }
}