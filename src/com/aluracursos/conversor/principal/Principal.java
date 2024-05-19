package com.aluracursos.conversor.principal;

import com.aluracursos.conversor.service.BuscarMoneda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        BuscarMoneda buscar = new BuscarMoneda();
        System.out.println("Bienvenido al conversor de moneda....");

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("1) Dolar ===> Peso Mexicano");
            System.out.println("2) Peso Mexicano ===> Dolar");
            System.out.println("3) Dolar ===> Peso Argentino");
            System.out.println("4) Peso Argentino ===> Dolar");
            System.out.println("5) Dolar ===> Peso Colombiano");
            System.out.println("6) Peso Colombiano ===> Dolar");
            System.out.println("7) Salir");

            System.out.print("Elija una opción válida: ");

            if (lectura.hasNextInt()) {
                opcion = lectura.nextInt();
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

                switch (opcion) {
                    case 1:
                        buscar.convertirDolarAPesoMexicano();
                        break;
                    case 2:
                        buscar.convertirPesoMexicanoADolar();
                        break;
                    case 3:
                        buscar.convertirDolarAPesoArgentino();
                        break;
                    case 4:
                        buscar.convertirPesoArgentinoADolar();
                        break;
                    case 5:
                        buscar.convertirDolarAPesoColombiano();
                        break;
                    case 6:
                        buscar.convertirPesoColombianoADolar();
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } else {
                if (lectura.hasNext()) { // Verificar si hay más tokens disponibles
                    System.out.println("Entrada no válida. Inténtalo de nuevo.");
                    lectura.next(); // Limpiar el buffer del Scanner
                } else {
                    System.out.println("No hay más entradas disponibles. Saliendo...");
                    break;
                }
            }
        }

        lectura.close(); // Cerrar el Scanner al finalizar su uso
    }
}

