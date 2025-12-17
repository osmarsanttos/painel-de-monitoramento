 package br.com.painel.subsistemas.imagem;

public class ProcessadorModeloA extends ProcessadorSHA {
    protected void carregarImagem(String p) { System.out.println("Lendo arquivo de imagem do SHA..."); }
    protected double aplicarOCR() { return 150.75; } // Valor simulado
}
