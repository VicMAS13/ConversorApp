package com.conversor;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void mostrar() {
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.print("Eija una opción válida: ");
    }

    public static void ejecutarOpcion(int opcion) {
        String from, to;
        switch (opcion) {
            case 1 -> { from = "USD"; to = "ARS"; }
            case 2 -> { from = "ARS"; to = "USD"; }
            case 3 -> { from = "USD"; to = "BRL"; }
            case 4 -> { from = "BRL"; to = "USD"; }
            case 5 -> { from = "USD"; to = "COP"; }
            case 6 -> { from = "COP"; to = "USD"; }
            default -> {
                System.out.println("Opción no válida.");
                return;
            }
        }

        System.out.print("Ingrese la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = ApiClient.convertir(from, to, cantidad);
        if (resultado != -1) {
            System.out.printf("%.2f %s son %.2f %s%n", cantidad, from, resultado, to);
        }
    }
}