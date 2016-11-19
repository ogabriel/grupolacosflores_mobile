package lacosflores.com.br.lacosflores.java.dao;

import com.google.gson.Gson;

import java.net.URL;
import java.util.Scanner;

import lacosflores.com.br.lacosflores.java.model.Filial;

/**
 * Created by SENAI on 19/11/2016.
 */

public class FilialDAO {
    public static Filial filial(String filial) throws Exception{

        Filial filialEncontrado = null;

        //Define URL
        URL endereco = new URL("localhost:8080/" + filial);
        //Consome Web-Services
        Scanner leitor = new Scanner(endereco.openConnection().getInputStream());

        StringBuilder stringGrande = new StringBuilder();

        while (leitor.hasNextLine()) {
            //Devolve verdadeiro se chegar no fim
            stringGrande.append(leitor.nextLine());
        }

        leitor.close();

        Gson conversor = new Gson();
        filialEncontrado = conversor.fromJson(stringGrande.toString(), Filial.class);

        return filialEncontrado;
    }
}
