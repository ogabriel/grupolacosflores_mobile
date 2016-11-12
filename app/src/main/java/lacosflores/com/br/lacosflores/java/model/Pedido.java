package lacosflores.com.br.lacosflores.java.model;

/**
 * Created by SENAI on 05/11/2016.
 */

public class Pedido {
    private String id;
    private String numero;
    private String status;
    private Endereco endereco;
    private String observacao;
    private String item;
    private String quantidade;
    private String valorTotal;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", numero='" + numero + '\'' +
                ", status='" + status + '\'' +
                ", endereco='" + endereco + '\'' +
                ", observacao='" + observacao + '\'' +
                ", item='" + item + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", valorTotal='" + valorTotal + '\'' +
                '}';
    }
}
