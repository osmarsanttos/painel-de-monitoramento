package br.com.painel.subsistemas.infra;

 // Padrão Singleton 
public class LogManager {
    private static LogManager instance;
    private LogManager() {}
    public static LogManager getInstance() {
        if (instance == null) instance = new LogManager();
        return instance;
    }
    public void registrar(String msg) { System.out.println("[LOG]: " + msg); }
}

class EmailService {
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
