package Decorator;

import java.util.ArrayDeque;

public class Canal implements Observaveis {
    private String nome;
    private List<Observador> observadores = new ArrayDeque<>();


    public Canal(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.enviarEmail(mensagem);
        }
    }
}
