package lacosflores.com.br.lacosflores.java.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import lacosflores.com.br.lacosflores.R;
import lacosflores.com.br.lacosflores.java.util.Permissoes;

public class MainActivity extends AppCompatActivity {
    private EditText edNum;
    private EditText edCod;
    private Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLog = (Button) findViewById(R.id.btnLog);
        edNum = (EditText) findViewById(R.id.edImei);
        edCod = (EditText) findViewById(R.id.edCodigo);

        // Permissões
        String[] permissoes = new String[]{
                Manifest.permission.READ_PHONE_STATE
        };

        Permissoes.checarPermissao(this, 1, permissoes);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String IMEI = getIMEI(this);
        edNum.setText(IMEI);
    }

    public void loginClick(View view) {
        Intent intent = new Intent(MainActivity.this, PedidoActivity.class);
        startActivity(intent);
    }

    private String getIMEI(Activity activity) {
        TelephonyManager esteCelular = (TelephonyManager) activity
                .getSystemService(Context.TELEPHONY_SERVICE);

        return esteCelular.getDeviceId();
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
