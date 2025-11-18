package com.conversor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ApiClient {
    private static final String API_KEY = "b31249d5886c5809fe61ccb2";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair";

    public static double convertir(String from, String to, double cantidad) {
        try {
            String urlStr = BASE_URL + "/" + from + "/" + to + "/" + cantidad;
            HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) content.append(line);
            in.close();

            JsonObject json = JsonParser.parseString(content.toString()).getAsJsonObject();
            if (json.get("result").getAsString().equals("success")) {
                return json.get("conversion_result").getAsDouble();
            } else {
                System.out.println("Error en la respuesta de la API.");
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Error al conectar con la API.");
            return -1;
        }
    }
}