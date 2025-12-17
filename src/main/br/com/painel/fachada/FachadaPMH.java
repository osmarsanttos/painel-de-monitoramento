package br.com.painel.fachada;

import br.com.painel.subsistemas.usuario.*;
import br.com.painel.subsistemas.alerta.*;
import br.com.painel.subsistemas.imagem.*;
import br.com.painel.subsistemas.infra.*;

 // Padrão Facade: Ponto de entrada 
public class FachadaPMH implements ILeituraObserver {
    private AlertaContext alerta = new AlertaContext();
    private LogManager logger = LogManager.getInstance();

    public void cadastrarUsuario(String nome, String email) {
        Usuario u = new UsuarioBuilder().setNome(nome).setEmail(email).setPerfil("ADMIN").build();
        logger.registrar("Usuário Builder criou: " + u.nome);
    }

    public void processarLeitura(String path) {
        ProcessadorSHA proc = new ProcessadorModeloA();
        proc.addObserver(this);
        proc.processarFluxo(path);
    }

    @Override
    public void atualizar(double leitura) {
        logger.registrar("Observer notificou leitura: " + leitura);
        // Regra de Alerta via Strategy
        alerta.setStrategy((c, l) -> c > l); 
        if (alerta.executar(leitura, 100.0)) {
            EmailService.getInstance().enviar("cliente@cagepa.com", "Consumo Elevado!");
        }
    }
}
