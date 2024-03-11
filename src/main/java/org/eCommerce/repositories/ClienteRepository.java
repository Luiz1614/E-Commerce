package org.eCommerce.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.eCommerce.entities.Cliente;
import org.eCommerce.utils.LocalDateTimeAdapter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class ClienteRepository extends _BaseRepositoryImpl<Cliente>{
    public ClienteRepository() {
        super(Cliente.class);
    }

    public void exportToJson(List<Cliente> lista, String filePath) {
        try {
            // Cria um GsonBuilder e registra o TypeAdapter personalizado para LocalDateTime
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter.LocalDateTimeTypeAdapter())
                    .create();

            FileWriter writer = new FileWriter(filePath);
            gson.toJson(lista, writer);
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
