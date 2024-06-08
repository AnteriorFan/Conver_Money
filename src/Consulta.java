import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

        public Monedas mon_P(String nombre_Moneda, String otra_moneda, float monto) {

            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ccf8ee31a0113186fc476c2d/pair/"+nombre_Moneda+"/"+otra_moneda+"/"+monto+"/");
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Monedas.class);

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }finally{
                System.out.println("....................................");
            }

        }

}
