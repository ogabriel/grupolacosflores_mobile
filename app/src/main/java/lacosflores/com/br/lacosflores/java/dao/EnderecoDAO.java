package lacosflores.com.br.lacosflores.java.dao;

import com.google.gson.Gson;

import java.net.URL;
import java.util.Scanner;

import lacosflores.com.br.lacosflores.java.model.Endereco;

/**
 * Created by SENAI on 19/11/2016.
 */

public class EnderecoDAO {
    public static Endereco enderecoPedido(String enderecoPedido) throws Exception{

        Endereco enderecoEncontrado = null;

        //Define URL
        URL endereco = new URL("localhost:8080/" + enderecoPedido);
        //Consome Web-Services
        Scanner leitor = new Scanner(endereco.openConnection().getInputStream());

        StringBuilder stringGrande = new StringBuilder();

        while (leitor.hasNextLine()) {
            //Devolve verdadeiro se chegar no fim
            stringGrande.append(leitor.nextLine());
        }

        leitor.close();

        Gson conversor = new Gson();
        enderecoEncontrado = conversor.fromJson(stringGrande.toString(), Endereco.class);

        return enderecoEncontrado;
    }
}
