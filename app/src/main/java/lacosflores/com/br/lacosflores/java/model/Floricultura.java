package lacosflores.com.br.lacosflores.java.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SENAI on 12/11/2016.
 */

public class Floricultura {
    private String id;
    private ArrayList<Pedido> pedidos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Floricultura{" +
                "id='" + id + '\'' +
                ", pedidos=" + pedidos +
                '}';
    }
}
