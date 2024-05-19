package com.aluracursos.conversor.model;

import com.google.gson.JsonObject;

public record Moneda(String base_code, JsonObject conversion_rates) {
}
