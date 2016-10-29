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

public class MainActivity extends AppCompatActivity {

    Button btnLog = (Button)findViewById(R.id.btnLog);

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
