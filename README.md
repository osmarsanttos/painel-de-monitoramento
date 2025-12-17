# Painel de Monitoramento de Hidrômetros (PMH)

O PMH é um sistema para gerenciar usuários, contas de água e monitorar o consumo individualizado de Hidrômetros de Aquisição de Sinal (SHA). O sistema utiliza uma **Fachada** como ponto de entrada principal para qualquer cliente (CLI, GUI ou sistemas externos), ocultando a complexidade dos subsistemas internos.

---

## 📈 Evolução do Projeto

Abaixo, apresento o status de desenvolvimento do sistema dividido por semanas:

| Semana | Funcionalidade / Etapa | Status | Progresso |
| --- | --- | --- | --- |
| **Semana 1** | Especificação de Requisitos e Diagramas 

 | Concluído | ██████████ 100% |

| **Semana 2** | Implementação da Fachada e Subsistemas Base 

 | Concluído | ██████████ 100% |

| **Semana 3** | Integração dos 6 Padrões de Projeto (GoF) 

 | Em Progresso | ████████░░ 80% |

| **Semana 4** | Testes de Integração e Vídeo de Entrega 
 
 | Em Progresso | ████████░░ 80% |



## 🏗️ Padrões de Projeto Aplicados

O projeto foi construído utilizando **6 Padrões de Projeto** para garantir modularidade e extensibilidade. Abaixo, detalho onde cada um pode ser visualizado no código:

### 1. Facade (Fachada)

* 
**Onde visualizar:** `src/main/java/br/com/painel/fachada/FachadaPMH.java`.


* 
**Descrição:** Simplifica a interface para os subsistemas complexos do PMH. Centraliza operações como cadastrar usuários e monitorar consumo.



### 2. Builder

* **Onde visualizar:** `src/main/java/br/com/painel/subsistemas/usuario/UsuarioBuilder.java`.
* 
**Descrição:** Utilizado para a criação complexa de objetos usuários, garantindo a configuração de atributos obrigatórios e perfis.



### 3. Strategy

* **Onde visualizar:** `src/main/java/br/com/painel/subsistemas/alerta/IAlertaStrategy.java`.
* 
**Descrição:** Permite lidar com diferentes tipos de alertas (ex: por volume ou média) sem modificar o núcleo da classe de alerta.



### 4. Observer

* **Onde visualizar:** `src/main/java/br/com/painel/subsistemas/imagem/ILeituraObserver.java`.
* 
**Descrição:** Notifica automaticamente o subsistema de Alerta sempre que uma nova leitura é processada pelo motor de imagem.



### 5. Template Method

* **Onde visualizar:** `src/main/java/br/com/painel/subsistemas/imagem/ProcessadorSHA.java`.
* 
**Descrição:** Define o fluxo fixo de processamento de imagem (carregar, interpretar, salvar) permitindo que subclasses tratem modelos específicos de SHA.



### 6. Singleton

* **Onde visualizar:** `src/main/java/br/com/painel/subsistemas/infra/LogManager.java`.
* 
**Descrição:** Garante que haja apenas uma instância do gerenciador de logs e do serviço de e-mail em todo o sistema.



---

## 🚀 Como Executar

1. Certifique-se de ter o **JDK 17+** e o **Maven** instalados.
2. Abra o projeto no VS Code.
3. Navegue até `src/main/java/br/com/painel/app/Main.java`.
4. Execute a classe `Main` para ver a interação entre os padrões no console.

---
