package br.com.painel.subsistemas.alerta;

public class AlertaContext {
    private IAlertaStrategy strategy;
    public void setStrategy(IAlertaStrategy s) { this.strategy = s; }
    public boolean executar(double c, double l) { return strategy.verificar(c, l); }
}