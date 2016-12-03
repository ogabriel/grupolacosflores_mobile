package lacosflores.com.br.lacosflores.java.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import lacosflores.com.br.lacosflores.R;
import lacosflores.com.br.lacosflores.java.dao.DispositivoDAO;
import lacosflores.com.br.lacosflores.java.model.Dispositivo;
import lacosflores.com.br.lacosflores.java.model.Floricultura;
import lacosflores.com.br.lacosflores.java.model.Pedido;

/**
 * Created by SENAI on 29/10/2016.
 */

public class PedidoActivity extends AppCompatActivity {

    private ListView lstPedido;
    private DispositivoDAO disp;
    private Dispositivo dispositivos;
    private Pedido pedidos;
    private Floricultura floricultura;
    private ArrayList<Pedido> p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        lstPedido = (ListView) findViewById(R.id.listViewPedidos);

        disp = new DispositivoDAO();
        dispositivos = new Dispositivo();
        floricultura = new Floricultura();

        lstPedido.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(PedidoActivity.this, DetalhamentoActivity.class);
                i.putParcelableArrayListExtra("pedidos",p);

                startActivity(i);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        try {
            dispositivos = disp.dispositivoImei();
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Floricultura> floriculturas = dispositivos.getFilial();
        p = floriculturas.get(0).getPedidos();

        ArrayAdapter<Pedido> adaptador =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, p);

        lstPedido.setAdapter(adaptador);
    }



}
