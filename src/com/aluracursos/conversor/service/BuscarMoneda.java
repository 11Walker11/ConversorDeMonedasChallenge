package com.aluracursos.conversor.service;

import com.aluracursos.conversor.model.Moneda;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscarMoneda {

    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/b0ff53d179dd6715f7d68c9f/latest/";
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private final Scanner scanner;

    public BuscarMoneda() {
        this.scanner = new Scanner(System.in);
    }

    private Moneda buscaMonedaApi(String codigoMoneda) {
        URI direccion = URI.create(URL_BASE + codigoMoneda);

        try {
            HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            System.err.println("Error al buscar la moneda: " + e.getMessage());
            return null;
        }
    }

    private double convertirDolar(double cantidad, String monedaDestino) {
        Moneda tasaDeCambio = buscaMonedaApi("USD");

        if (tasaDeCambio != null) {
            JsonObject conversionRates = tasaDeCambio.conversion_rates();
            if (conversionRates.has(monedaDestino)) {
                double tasaMonedaDestino = conversionRates.get(monedaDestino).getAsDouble();
                return cantidad * tasaMonedaDestino;
            } else {
                System.out.println("La tasa de cambio para " + monedaDestino + " no está disponible.");
            }
        } else {
            System.out.println("No se pudo obtener la tasa de cambio del dólar a la moneda deseada.");
        }
        return 0.0;
    }

    private double convertirPeso(double cantidad, String monedaDestino) {
        Moneda tasaDeCambio = buscaMonedaApi("USD");

        if (tasaDeCambio != null) {
            JsonObject conversionRates = tasaDeCambio.conversion_rates();
            if (conversionRates.has(monedaDestino)) {
                double tasaMonedaDestino = conversionRates.get(monedaDestino).getAsDouble();
                return cantidad / tasaMonedaDestino;
            } else {
                System.out.println("La tasa de cambio para " + monedaDestino + " no está disponible.");
            }
        } else {
            System.out.println("No se pudo obtener la tasa de cambio del dólar a la moneda deseada.");
        }
        return 0.0;
    }

    public void convertirDolarAPesoMexicano() {
        System.out.print("Ingrese la cantidad de dólares a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = convertirDolar(cantidad, "MXN");
        System.out.println(cantidad + " USD son equivalentes a " + resultado + " MXN");
    }

    public void convertirPesoMexicanoADolar() {
        System.out.print("Ingrese la cantidad de pesos mexicanos a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = convertirPeso(cantidad, "MXN");
        System.out.println(cantidad + " MXN son equivalentes a " + resultado + " USD");
    }

    public void convertirDolarAPesoArgentino() {
        System.out.print("Ingrese la cantidad de dólares a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = convertirDolar(cantidad, "ARS");
        System.out.println(cantidad + " USD son equivalentes a " + resultado + " ARS");
    }

    public void convertirPesoArgentinoADolar() {
        System.out.print("Ingrese la cantidad de pesos argentinos a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = convertirPeso(cantidad, "ARS");
        System.out.println(cantidad + " ARS son equivalentes a " + resultado + " USD");
    }

    public void convertirDolarAPesoColombiano() {
        System.out.print("Ingrese la cantidad de dólares a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = convertirDolar(cantidad, "COP");
        System.out.println(cantidad + " USD son equivalentes a " + resultado + " COP");
    }

    public void convertirPesoColombianoADolar() {
        System.out.print("Ingrese la cantidad de pesos colombianos a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = convertirPeso(cantidad, "COP");
        System.out.println(cantidad + " COP son equivalentes a " + resultado + " USD");
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
