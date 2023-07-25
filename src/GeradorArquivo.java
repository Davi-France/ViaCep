import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeradorArquivo {

    public void Gerar(ArrayList endereco) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("enderecos.json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }

}
