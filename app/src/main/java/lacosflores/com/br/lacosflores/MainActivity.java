package lacosflores.com.br.lacosflores;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static lacosflores.com.br.lacosflores.R.menu.activity_home_drawer;
import static lacosflores.com.br.lacosflores.R.menu.home_pedido;

public class MainActivity extends AppCompatActivity{

    Button btnLog = (Button)findViewById(R.id.btnLog);
    EditText edNum = (EditText)findViewById(R.id.edNumero);
    EditText edCod = (EditText)findViewById(R.id.edCodigo);

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edCod.equals("01") && edNum.equals("12345")){
                    Intent intent = new Intent(MainActivity.this, PedidoActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Código/Número inválido", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
