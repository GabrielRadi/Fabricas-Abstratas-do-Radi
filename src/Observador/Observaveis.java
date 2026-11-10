package Decorator;

public interface Observaveis {
    void adicionarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores(String mensagem);
}
