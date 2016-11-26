package lacosflores.com.br.lacosflores.java.dao;

import android.util.Log;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import lacosflores.com.br.lacosflores.java.model.Apiary;


public class ApiaryDAO {

    private static final String URL = "https://private-511b5e-lpluizpaulino.apiary-mock.com/questions";

    public static List<Apiary> sendGet() throws IOException {
        List<Apiary> listagem = new ArrayList<>();


        URL endereco = new URL("http://polls.apiblueprint.org/questions");
        //Consome Web-Services
        Scanner leitor = new Scanner(endereco.openConnection().getInputStream());

        StringBuilder stringGrande = new StringBuilder();

        while (leitor.hasNextLine()) {
            //Devolve verdadeiro se chegar no fim
            stringGrande.append(leitor.nextLine());
        }

        leitor.close();

        Gson conversor = new Gson();

        try {
            JSONArray dados = new JSONArray(stringGrande.toString());

            for(int i=0; i < dados.length(); i++) {
                Apiary a = conversor.fromJson(dados.get(i).toString(), Apiary.class);
                listagem.add(a);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


        //Apiary apiaryEncontrado = conversor.fromJson(stringGrande.toString(), Apiary.class);

        //return apiaryEncontrado;
        return listagem;



    }
}


//        OkHttpClient client = new OkHttpClient();
//
//        client.setConnectTimeout(30, TimeUnit.SECONDS);
//        client.setReadTimeout(30, TimeUnit.SECONDS);
//        Request request = new Request.Builder()
//                .url(URL)
//                .addHeader("content-type", "application/json")
//                .build();
//
//        Gson conversor = new Gson();
//        Apiary apiaryEncontrado = conversor.fromJson(client.newCall(request).toString(), Apiary.class);
//
//        return  apiaryEncontrado; //client.newCall(request).execute().body().string();



//        URL endereco = new URL("http://polls.apiblueprint.org/questions");
//        //Consome Web-Services
//        Scanner leitor = new Scanner(endereco.openConnection().getInputStream());
//
//        StringBuilder stringGrande = new StringBuilder();
//
//        while (leitor.hasNextLine()) {
//            //Devolve verdadeiro se chegar no fim
//            stringGrande.append(leitor.nextLine());
//        }
//
//        leitor.close();


//        Cep cepEncontrado = null;
//
//        //Define URL
//        java.net.URL endereco = new URL("http://viacep.com.br/ws/" + cepParaPesquisar + "/json");
//        //Consome Web-Services
//        Scanner leitor = new Scanner(endereco.openConnection().getInputStream());
//
//        StringBuilder stringGrande = new StringBuilder();
//
//        while (leitor.hasNextLine()) {
//            //Devolve verdadeiro se chegar no fim
//            stringGrande.append(leitor.nextLine());
//        }
//
//        leitor.close();
//
//        Gson conversor = new Gson();
//        cepEncontrado = conversor.fromJson(stringGrande.toString(), Cep.class);
//
//        return cepEncontrado;

