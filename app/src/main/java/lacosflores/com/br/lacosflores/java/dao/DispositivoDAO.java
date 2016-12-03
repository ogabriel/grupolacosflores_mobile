package lacosflores.com.br.lacosflores.java.dao;

import android.content.Context;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lacosflores.com.br.lacosflores.java.model.Dispositivo;
import lacosflores.com.br.lacosflores.java.model.Pedido;

/**
 * Created by SENAI on 05/11/2016.
 */

public class DispositivoDAO {

    public static Dispositivo dispositivoImei() throws Exception{
        Dispositivo dispositivoEncontrado = null;

        //Define URL
        URL endereco = new URL("https://private-511b5e-lpluizpaulino.apiary-mock.com/dispositivos");
        //Consome Web-Services
        Scanner leitor = new Scanner(endereco.openConnection().getInputStream());

        StringBuilder stringGrande = new StringBuilder();

        while (leitor.hasNextLine()) {
            //Devolve verdadeiro se chegar no fim
            stringGrande.append(leitor.nextLine());
        }

        leitor.close();

        Gson conversor = new Gson();
        dispositivoEncontrado = conversor.fromJson(stringGrande.toString(), Dispositivo.class);

        return dispositivoEncontrado;
    }
}
