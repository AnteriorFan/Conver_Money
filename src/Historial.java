import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Historial {
    private final List<Monedas> historial = new ArrayList<>();

    public void agregarResultado(Monedas m) {
        historial.add(m);
    }


    // Método para guardar el historial
    public void guardarHistorial() throws IOException {
        Gson gson = new GsonBuilder()

                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        try (FileWriter write = new FileWriter("Historial.json")) {
            gson.toJson(historial,write);

        }

    }

}


//    public void agregarResultado(Monedas m) throws IOException {
//        historial.add(m);

//        Gson gson = new GsonBuilder()
//                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//                .setPrettyPrinting()
//                .create();
//
//        try (FileWriter write = new FileWriter("Historial.json")) {
//            write.write(gson.toJson(m));
//            gson.toJson(historial, write);
//        }



//   public void historialArchivo(Monedas m) throws IOException {;
//
//
//       Gson gson = new GsonBuilder()
//               .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//               .setPrettyPrinting()
//               .create();
//
//
//       FileWriter write = new FileWriter("Historial.txt");
//       write.write(gson.toJson(m));
//       write.close();
//   }

