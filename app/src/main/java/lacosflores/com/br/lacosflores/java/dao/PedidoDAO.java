package lacosflores.com.br.lacosflores.java.dao;

import com.google.gson.Gson;

import java.net.URL;
import java.util.Scanner;

import lacosflores.com.br.lacosflores.java.model.Pedido;

/**
 * Created by SENAI on 05/11/2016.
 */

public class PedidoDAO {
    public static Pedido pedidoFilial(String filial) throws Exception{

        Pedido pedidoEncontrado = null;

        //Define URL
        URL endereco = new URL("localhost:8080/pedido/" + filial);
        //Consome Web-Services
        Scanner leitor = new Scanner(endereco.openConnection().getInputStream());

        StringBuilder stringGrande = new StringBuilder();

        while (leitor.hasNextLine()) {
            //Devolve verdadeiro se chegar no fim
            stringGrande.append(leitor.nextLine());
        }

        leitor.close();

        Gson conversor = new Gson();
        pedidoEncontrado = conversor.fromJson(stringGrande.toString(), Pedido.class);

        return pedidoEncontrado;
    }
}
