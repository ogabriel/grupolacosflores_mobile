package lacosflores.com.br.lacosflores.java.model;

/**
 * Created by SENAI on 05/11/2016.
 */

public class Dispositivo {
    private String id;
    private String imei;
    private Filial filial;

    public String getIdDispositivo() {
        return id;
    }

    public void setIdDispositivo(String id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "idDispositivo='" + id + '\'' +
                ", imei='" + imei + '\'' +
                ", filial='" + filial + '\'' +
                '}';
    }
}
