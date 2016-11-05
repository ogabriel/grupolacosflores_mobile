package lacosflores.com.br.lacosflores.java.activity;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import lacosflores.com.br.lacosflores.R;

public class MainActivity extends AppCompatActivity {
    private EditText edNum;
    private EditText edCod;
    private Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLog = (Button) findViewById(R.id.btnLog);
        edNum = (EditText) findViewById(R.id.edNumero);
        edCod = (EditText) findViewById(R.id.edCodigo);

        getMacAddress(MainActivity.this);

    }

    public String getMacAddress(Context context) {
        WifiManager wimanager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        String macAddress = wimanager.getConnectionInfo().getMacAddress();
        if (macAddress == null) {
            macAddress = "Device don't have mac address or wi-fi is disabled";
        }
        edNum.setText(macAddress);
        return macAddress;
    }

    public void loginClick(View view) {
        Intent intent = new Intent(MainActivity.this, PedidoActivity.class);
        startActivity(intent);
    }

}
