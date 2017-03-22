package com.generarenteros.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        int d, m, a;

        System.out.println("Introduce la fecha :");
        System.out.println("Dia :");
        d = scanner.nextInt();
        System.out.println("Mes :");
        m = scanner.nextInt();
        System.out.println("Año :");
        a = scanner.nextInt();

        Fecha fecha = new Fecha(d, m, a);

        if (fecha.fechaCorrecta()) {
            System.out.println("Fecha introducida : " + fecha);

            System.out.println("Los 10 dias siguiente son :");
            for (int i = 0; i < 10; i++) {
                fecha.diaSiguiente();
                System.out.println(fecha);
            }
        } else {
            System.out.println("Fecha no valida : " + fecha);
        }
    }
}
