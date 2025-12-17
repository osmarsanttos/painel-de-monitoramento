package br.com.painel.subsistemas.infra;

//Padrão Singleton
public class EmailService {
    private static EmailService instance;
    private EmailService() {}
    public static EmailService getInstance() {
        if (instance == null) instance = new EmailService();
        return instance;
    }
    public void enviar(String para, String msg) { 
        System.out.println("[EMAIL enviado para " + para + "]: " + msg); 
    }
}