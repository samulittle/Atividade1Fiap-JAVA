package br.com.gullivertraveller.hospedagem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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

    public static void main(String[] args) {
        Reserva reserva = new Reserva(1, new Date(), "São Paulo - SP");
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE - dd/MM/yyyy", new Locale("pt", "BR"));
        String dataFormatada = dateFormat.format(reserva.getData());
        
        System.out.println("ID da Reserva: " + reserva.getId());
        System.out.println("Data da Reserva: " + dataFormatada);
        System.out.println("Localização da Reserva: " + reserva.getLocalizacao());
    }
}
