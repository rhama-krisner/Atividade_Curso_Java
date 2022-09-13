package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
        private String name;
        private String email;
        private Date data;

    public Client(String name, String email, Date data) {
        this.name = name;
        this.email = email;
        this.data = data;
    }

    public Client(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Primeiro instancia o Simple date format, com o formato de data que deseja
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " ");
        //Depois chama o Simple Date Format, passa o atributo format para mudar o formato da data
        //Depois passa a variável que está recebendo a data
        sb.append("(" + sdf.format(data) + ") ");
        sb.append(email + " ");
        return sb.toString();
    }
}