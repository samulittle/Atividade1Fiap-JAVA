package br.com.gullivertraveller.hospedagem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Usuario {
    private int id;
    private String nivel;
    private String genero;
    private String email;
    private String senha;
    private String nome;
    private Date nascimento;
    private Date ultimoAcesso;
    private List<Reserva> reservas;

    public Usuario() {
        this.reservas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNivel("Premium");
        usuario.setGenero("Masculino");
        usuario.setEmail("alunofiap@example.com");
        usuario.setSenha("123456");
        usuario.setNome("Aluno Fiap");
        usuario.setNascimento(new Date());
        usuario.setUltimoAcesso(new Date());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));

        System.out.println("Dados do Usuário:");
        System.out.println("ID: " + usuario.getId());
        System.out.println("Nível: " + usuario.getNivel());
        System.out.println("Gênero: " + usuario.getGenero());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Senha: " + usuario.getSenha());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Data de Nascimento: " + dateFormat.format(usuario.getNascimento()));
        System.out.println("Último Acesso: " + dateFormat.format(usuario.getUltimoAcesso()));
    }
}
