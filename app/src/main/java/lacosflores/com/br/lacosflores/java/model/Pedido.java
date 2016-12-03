package lacosflores.com.br.lacosflores.java.model;

import android.net.wifi.WifiConfiguration;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by SENAI on 05/11/2016.
 */

public class Pedido implements Parcelable{
    private String id;
    private String numero;
    private String status;
    private String observacao;
    private String quantidade;
    private String valorTotal;
    private String item;

    public Pedido(){}

    public Pedido(Parcel in) {
        String[] dados = new String[7];
        in.readStringArray(dados);
        this.id = dados[0];
        this.numero = dados[1];
        this.status = dados[2];
        this.observacao = dados[3];
        this.quantidade = dados[4];
        this.valorTotal = dados[5];
        this.item = dados[6];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Pedido: " + numero;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[]{
            this.id,
            this.numero,
            this.status,
            this.observacao,
            this.quantidade,
            this.valorTotal,
            this.item,
        });
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public Pedido createFromParcel(Parcel in){
            return new Pedido(in);
        }
        public Pedido[] newArray(int size){
            return new Pedido[size];
        }
    };
}
