package org.eCommerce.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.eCommerce.entities.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ClienteRepository extends _BaseRepositoryImpl<Cliente>{
    public ClienteRepository() {
        super(Cliente.class);
    }

    public void exportToJson(List<Cliente> lista, String filePath)  {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(filePath);
            gson.toJson(lista, writer);
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
