package br.com.gullivertraveller.hospedagem;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    private String estado;
    private String pais;
    private String siglaPais;
    private List<Cidade> cidades;

    public Cidade(String nome, String estado, String pais, String siglaPais) {
        this.nome = nome;
        this.estado = estado;
        this.pais = pais;
        this.siglaPais = siglaPais;
        this.cidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSiglaPais() {
        return siglaPais;
    }

    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public static void main(String[] args) {
        Cidade gulliverTraveller = new Cidade("Brasil", "BR", "Brasil", "BR");

        
        adicionarCidadesBrasil(gulliverTraveller);

        
        List<Cidade> cidades = gulliverTraveller.getCidades();
        for (Cidade cidade : cidades) {
            System.out.println("Cidade: " + cidade.getNome() + ", Estado: " + cidade.getEstado() + ", País: " + cidade.getPais());
        }
    }

    private static void adicionarCidadesBrasil(Cidade gulliverTraveller) {
        
        adicionarCidade(gulliverTraveller, "Acre", "AC");
        adicionarCidade(gulliverTraveller, "Amapá", "AP");
        adicionarCidade(gulliverTraveller, "Amazonas", "AM");
        adicionarCidade(gulliverTraveller, "Pará", "PA");
        adicionarCidade(gulliverTraveller, "Rondônia", "RO");
        adicionarCidade(gulliverTraveller, "Roraima", "RR");
        adicionarCidade(gulliverTraveller, "Tocantins", "TO");

       
        adicionarCidade(gulliverTraveller, "Alagoas", "AL");
        adicionarCidade(gulliverTraveller, "Bahia", "BA");
        adicionarCidade(gulliverTraveller, "Ceará", "CE");
        adicionarCidade(gulliverTraveller, "Maranhão", "MA");
        adicionarCidade(gulliverTraveller, "Paraíba", "PB");
        adicionarCidade(gulliverTraveller, "Pernambuco", "PE");
        adicionarCidade(gulliverTraveller, "Piauí", "PI");
        adicionarCidade(gulliverTraveller, "Rio Grande do Norte", "RN");
        adicionarCidade(gulliverTraveller, "Sergipe", "SE");

        
        adicionarCidade(gulliverTraveller, "Distrito Federal", "DF");
        adicionarCidade(gulliverTraveller, "Goiás", "GO");
        adicionarCidade(gulliverTraveller, "Mato Grosso", "MT");
        adicionarCidade(gulliverTraveller, "Mato Grosso do Sul", "MS");

        
        adicionarCidade(gulliverTraveller, "Espírito Santo", "ES");
        adicionarCidade(gulliverTraveller, "Minas Gerais", "MG");
        adicionarCidade(gulliverTraveller, "Rio de Janeiro", "RJ");
        adicionarCidade(gulliverTraveller, "São Paulo", "SP");

        
        adicionarCidade(gulliverTraveller, "Paraná", "PR");
        adicionarCidade(gulliverTraveller, "Rio Grande do Sul", "RS");
        adicionarCidade(gulliverTraveller, "Santa Catarina", "SC");
    }

    private static void adicionarCidade(Cidade gulliverTraveller, String cidade, String estado) {
        Cidade novaCidade = new Cidade(cidade, estado, "Brasil", "BR");
        gulliverTraveller.adicionarCidade(novaCidade);
    }
}
