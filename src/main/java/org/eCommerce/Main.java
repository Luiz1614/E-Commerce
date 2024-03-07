package org.eCommerce;

import com.google.gson.Gson;
import org.eCommerce.entities.ItemVenda;
import org.eCommerce.entities.Produto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        var produto = new Produto(1, "Notebook", "i5 10400f, gtx 1660", 4000, 30);

        Gson gson = new Gson();
        String json = gson.toJson(produto);

        File arquivo = new File("produto.json");
        try (FileWriter fw = new FileWriter(arquivo)) {
            fw.write(json);
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
