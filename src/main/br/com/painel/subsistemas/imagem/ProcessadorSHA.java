package br.com.painel.subsistemas.imagem;
import java.util.*;

 // Padrão Template Method 
public abstract class ProcessadorSHA {
    private List<ILeituraObserver> observers = new ArrayList<>();
    public final void processarFluxo(String path) {
        carregarImagem(path);
        double valor = aplicarOCR();
        for (ILeituraObserver o : observers) o.atualizar(valor);
    }
    protected abstract void carregarImagem(String path);
    protected abstract double aplicarOCR();
    public void addObserver(ILeituraObserver o) { observers.add(o); }
}
