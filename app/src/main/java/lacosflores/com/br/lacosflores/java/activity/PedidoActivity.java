package lacosflores.com.br.lacosflores.java.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import lacosflores.com.br.lacosflores.R;

/**
 * Created by SENAI on 29/10/2016.
 */

public class PedidoActivity extends AppCompatActivity {

    private ListView lstPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        Log.d("LAÇOS", "criou a activiry");

        String[] itens = new String[]{ "Buquê de Rosas", "Coroa de Flores Sortidas", "Coroa de Flores Premium", "Coroa de Flores Super-Luxo" };
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,itens);

        lstPedido = (ListView) findViewById(R.id.listViewPedidos);
        lstPedido.setAdapter(adaptador);
        lstPedido.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PedidoActivity.this, "Posição " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
