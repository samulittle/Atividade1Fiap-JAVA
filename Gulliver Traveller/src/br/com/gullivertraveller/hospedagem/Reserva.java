package br.com.gullivertraveller.hospedagem;

import java.util.Date;

public class Reserva {
    private int id;
    private Date data;
    private String localizacao;

    public Reserva(int id, Date data, String localizacao) {
        this.id = id;
        this.data = data;
        this.localizacao = localizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
