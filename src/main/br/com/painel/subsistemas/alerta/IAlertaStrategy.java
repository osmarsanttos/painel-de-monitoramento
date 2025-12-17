package br.com.painel.subsistemas.alerta;

 // Padrão Strategy 
public interface IAlertaStrategy {
    boolean verificar(double consumo, double limite);
}

class AlertaVolumeFixo implements IAlertaStrategy {
    public boolean verificar(double c, double l) { return c > l; }
}
