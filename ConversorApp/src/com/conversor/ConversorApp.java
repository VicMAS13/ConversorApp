package com.conversor;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            Menu.mostrar();
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 6) {
                Menu.ejecutarOpcion(opcion);
            } else if (opcion == 7) {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}