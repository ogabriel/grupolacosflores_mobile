package lacosflores.com.br.lacosflores.java.dao;

import com.google.gson.Gson;

import java.net.URL;
import java.util.Scanner;

import lacosflores.com.br.lacosflores.java.model.Dispositivo;

/**
 * Created by SENAI on 05/11/2016.
 */

public class DispositivoDAO {
    public static Dispositivo dispositivoImei(String imei) throws Exception{

        Dispositivo dispositivoEncontrado = null;

        //Define URL
        URL endereco = new URL("localhost:8080/dispositivo/" + imei);
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
