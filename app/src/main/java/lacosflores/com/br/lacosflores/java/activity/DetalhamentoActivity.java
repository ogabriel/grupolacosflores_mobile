package lacosflores.com.br.lacosflores.java.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import lacosflores.com.br.lacosflores.R;
import lacosflores.com.br.lacosflores.java.model.Pedido;

public class DetalhamentoActivity extends AppCompatActivity {

    private TextView txtNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhamento);

        //ArrayList<Pedido> dados = getIntent().getParcelableArrayListExtra("pedidos");

        Pedido pedido =  getIntent().getExtras().getParcelable("pedidos");

        txtNumero = (TextView) findViewById(R.id.edCodigo);

        txtNumero.setText(pedido.getNumero());

    }
}