package lacosflores.com.br.lacosflores.java.activity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import lacosflores.com.br.lacosflores.R;
import lacosflores.com.br.lacosflores.java.dao.ApiaryDAO;
import lacosflores.com.br.lacosflores.java.dao.PedidoDAO;
import lacosflores.com.br.lacosflores.java.model.Apiary;
import lacosflores.com.br.lacosflores.java.model.Pedido;

/**
 * Created by SENAI on 29/10/2016.
 */

public class PedidoActivity extends AppCompatActivity {

    private ListView lstPedido;
    Pedido pedidosConsultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        Log.d("LAÇOS", "criou a activiry");

    }

    public static Apiary apiary() throws Exception {

        Apiary apiaryEncontrado = null;

        //Define URL
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
        apiaryEncontrado = conversor.fromJson(stringGrande.toString(), Apiary.class);

        return apiaryEncontrado;
    }



}
