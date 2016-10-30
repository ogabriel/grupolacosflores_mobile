package lacosflores.com.br.lacosflores.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import lacosflores.com.br.lacosflores.R;

public class MainActivity extends AppCompatActivity{
    private EditText edNum;
    private EditText edCod;
    private Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLog = (Button)findViewById(R.id.btnLog);
        edNum = (EditText)findViewById(R.id.edNumero);
        edCod = (EditText)findViewById(R.id.edCodigo);

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
