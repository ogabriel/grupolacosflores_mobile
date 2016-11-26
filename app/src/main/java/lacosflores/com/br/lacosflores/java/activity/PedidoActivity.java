package lacosflores.com.br.lacosflores.java.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
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
import java.util.List;
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
    private List<Apiary> listApiary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        lstPedido = (ListView) findViewById(R.id.listViewPedidos);

        try {
            preencheList();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void preencheList() throws Exception{
        ApiaryDAO consulta = new ApiaryDAO();

        ArrayAdapter<Apiary> adaptador =
                new ArrayAdapter<Apiary>(this, android.R.layout.simple_list_item_1, consulta.sendGet());

        lstPedido.setAdapter(adaptador);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        for (int resultado : grantResults) {
            if (resultado == PackageManager.PERMISSION_DENIED) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setTitle("Sem conceder a permissão o app não funcionará");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        }
    }

}
