package lacosflores.com.br.lacosflores.java.util;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


public class Permissoes {
    public static boolean checarPermissao(Activity activity, int requestCode, String... permissoes) {
        List<String> listaNegacoes = new ArrayList<String>();
        for (String permissao : permissoes) {
            Log.w("PERMISSAO", ContextCompat.checkSelfPermission(activity, permissao) + "");
            if (ContextCompat.checkSelfPermission(activity, permissao) != PackageManager.PERMISSION_GRANTED) {
                listaNegacoes.add(permissao);
            }
        }
        if (listaNegacoes.isEmpty()) {
            return true;
        } else {
            String[] permissoesNegadas = new String[listaNegacoes.size()];

            listaNegacoes.toArray(permissoesNegadas);
            ActivityCompat.requestPermissions(activity, permissoesNegadas, requestCode);
            return false;
        }
    }
}

