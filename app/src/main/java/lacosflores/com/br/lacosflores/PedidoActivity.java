package lacosflores.com.br.lacosflores;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import lacosflores.com.br.lacosflores.DetalhamentoActivity;

/**
 * Created by SENAI on 29/10/2016.
 */

public class PedidoActivity extends AppCompatActivity {

    ListView lstPedido = (ListView)findViewById(R.id.listViewPedidos);
    String [] itens = { "Buquê de Rosas", "Coroa de Flores Sortidas", "Coroa de Flores Premium", "Coroa de Flores Super-Luxo" };
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_pedido);

        lstPedido.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens));


        lstPedido.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DetalhamentoActivity dt = new DetalhamentoActivity();
                Intent intent;
                switch (position){
                    case 1:
                         intent = new Intent(PedidoActivity.this, DetalhamentoActivity.class);
                        startActivity(intent);
                        dt.passagem(itens[0], position);
                        break;
                    case 2:
                        intent = new Intent(PedidoActivity.this, DetalhamentoActivity.class);
                        startActivity(intent);
                        dt.passagem(itens[1], position);
                        break;
                    case 3:
                        intent = new Intent(PedidoActivity.this, DetalhamentoActivity.class);
                        startActivity(intent);
                        dt.passagem(itens[2], position);
                        break;
                    case 4:
                        intent = new Intent(PedidoActivity.this, DetalhamentoActivity.class);
                        startActivity(intent);
                        dt.passagem(itens[3], position);
                        break;
                }
            }
        });
    }
}
