package br.com.gullivertraveller.hospedagem;

import java.util.ArrayList;
import java.util.List;

public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

   
    private static List<Endereco> listaEnderecos = new ArrayList<>();

    public Endereco(String logradouro, String numero, String cidade, String estado, String cep) {
        this.rua = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;


        listaEnderecos.add(this);
    }

    public String getLogradouro() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

   
    public static void adicionarEndereco(Endereco endereco) {
        listaEnderecos.add(endereco);
    }


    public static List<Endereco> getListaEnderecos() {
        return listaEnderecos;
    }

    public static void main(String[] args) {
       
        Endereco endereco = new Endereco("Rua A", "123", "São Paulo", "SP", "12345-678");

        
        adicionarEndereco(endereco);

      
        Endereco Endereco = getListaEnderecos().get(0);
        System.out.println("Rua: " + Endereco.getLogradouro());
        System.out.println("Número: " + Endereco.getNumero());
        System.out.println("Cidade: " + Endereco.getCidade());
        System.out.println("Estado: " + Endereco.getEstado());
        System.out.println("CEP: " + Endereco.getCep());
    }
}
