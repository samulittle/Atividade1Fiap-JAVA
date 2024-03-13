package br.com.gullivertraveller.hospedagem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Endereco> enderecos;

    public Hotel() {
        this.enderecos = new ArrayList<>();
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void removerEndereco(Endereco endereco) {
        enderecos.remove(endereco);
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Endereco endereco1 = new Endereco("Rua A", "123", "São Paulo", "SP", "12345-678");
        Endereco endereco2 = new Endereco("Avenida B", "456", "Rio de Janeiro", "RJ", "98765-432");

        hotel.adicionarEndereco(endereco1);
        hotel.adicionarEndereco(endereco2);

        System.out.println("Endereços:");
        for (Endereco endereco : hotel.getEnderecos()) {
            System.out.println(endereco.getLogradouro() + ", " + endereco.getNumero() + " - "
                    + endereco.getCidade() + "/" + endereco.getEstado() + " - "
                    + endereco.getCep());
        }
    }
}
