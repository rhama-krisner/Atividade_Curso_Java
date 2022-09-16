package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment = new Date();
    private String status;

    private double total;

    private List<Product> listaItens = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sdf.format(moment));
        return sb.toString();
    }

    public Order(Date moment, String status, double total) {
        this.moment = moment;
        this.status = status;
        this.total = total;
    }

    public Order(){

    }

    //Getter e setter de enum
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    //Getter e ser lista
    public List<Product> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Product> listaItens) {
        this.listaItens = listaItens;
    }

    //Adiciona e remove itens de lista
    public void addItens(Product itens){
        listaItens.add(itens);
    }
    public void removeItens(Product itens){
        listaItens.remove(itens);
    }

    public double getTotal() {
        return total;
    }

    public double total(){
        OrderItem order = new OrderItem();
        int quantidade = order.getQuantity();
        double preco = order.getPrice();
        return quantidade*preco;
    }

}
