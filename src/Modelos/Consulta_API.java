package Modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta_API {

        public Busqueda_Api buscarApi(String monedaBase, String monedObjetivo, double cantidad){

            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/67ef28b16b3678843fad0111/pair"+"/"+monedaBase+"/"+monedObjetivo+"/"+cantidad);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Busqueda_Api.class);
            } catch (Exception e) {
                throw new RuntimeException("No encontre esa Divisa");
            }
        }
}


