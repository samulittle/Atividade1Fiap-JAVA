package br.com.gullivertraveller.hospedagem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private List<String> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getQuartos() {
        return quartos;
    }

    public void adicionarQuarto(String quarto) {
        quartos.add(quarto);
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Gulliver", "Rua das Palmeiras, 123");

      
        System.out.println("Nome do Hotel: " + hotel.getNome());
        System.out.println("Endereço do Hotel: " + hotel.getEndereco());

     
        hotel.adicionarQuarto("Quarto 101: Simples, Capacidade: 1");
        hotel.adicionarQuarto("Quarto 201: Luxo, Capacidade: 2");

        
        System.out.println("Quartos disponíveis:");
        List<String> quartos = hotel.getQuartos();
        for (String quarto : quartos) {
            System.out.println(quarto);
        }
    }
}
