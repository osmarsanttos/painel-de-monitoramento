package br.com.painel.app; 

import br.com.painel.fachada.FachadaPMH;

public class Main {
    public static void main(String[] args) {
        FachadaPMH fachada = new FachadaPMH();
        System.out.println("--- PMH CAGEPA INICIADO ---");
        fachada.cadastrarUsuario("Osmar Filho", "osmar@cagepa.com");
        fachada.processarLeitura("imagem_hidrometro_01.jpg");
    }
}
