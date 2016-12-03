package lacosflores.com.br.lacosflores.java.model;

import java.util.List;

/**
 * Created by SENAI on 05/11/2016.
 */

public class Dispositivo {
    private String id;
    private String imei;
    private String senha;

    private List<Floricultura> floricultura;

    public List<Floricultura> getFilial() {
        return floricultura;
    }

    public void setFilial(List<Floricultura> floricultura) {
        this.floricultura = floricultura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
