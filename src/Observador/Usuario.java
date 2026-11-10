package Decorator;

public class Usuario implements Observaveis {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("Enviando e-mail para " + nome + ": " + mensagem);
    }
}
