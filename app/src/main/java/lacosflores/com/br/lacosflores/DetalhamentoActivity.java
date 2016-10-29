package lacosflores.com.br.lacosflores;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetalhamentoActivity extends AppCompatActivity {

    EditText edCod = (EditText)findViewById(R.id.edCodigo);
    EditText edNome = (EditText)findViewById(R.id.edNome);
    EditText edPreco = (EditText)findViewById(R.id.edPreco);
    Button btnCancelar = (Button)findViewById(R.id.btnVoltar);
    Button btnEncerrar = (Button)findViewById(R.id.btnEncerrar);
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhamento);


        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(DetalhamentoActivity.this, PedidoActivity.class);
                startActivity(intent);
            }
        });

        btnEncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                    intent = new Intent(DetalhamentoActivity.this, FormularioActivity.class);
                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                    closeContextMenu();
                                break;
                        }
                    }
                };
            }
        });
    }

    public void passagem(String nome, int cod){
        edCod.setText(cod);
        edNome.setText(nome);
        edPreco.setText("R$500,00");
    }
}
