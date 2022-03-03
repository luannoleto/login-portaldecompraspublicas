package runners;

import config.TestConfig;
import org.testng.annotations.Test;
import steps.stepLogin;

public class runnerLogin extends TestConfig {

    //[Caso de Teste 01: Usuário logado com sucesso]
    @Test
    public void deveAutenticarUsuario() {
        new stepLogin().logarUsuario("pregoeiro.luan", "senha123");
    }

    //[Caso de Teste 02: Usuário e senha não informados]
    @Test
    public void usuarioSenhaNaoInformados() {
        new stepLogin().usuarioSenhaNaoInformados("", "");
    }

    //[Caso de Teste 03: Usuário não informado]
    @Test
    public void usuarioNaoInformado() {
        new stepLogin().usuarioNaoInformado("", "senha123");
    }

    //[Caso de Teste 04: Senha não informada]
    @Test
    public void senhaNaoInformada() {
        new stepLogin().senhaNaoInformada("pregoeiro.luan", "");
    }

    //[Caso de Teste 05: Usuário e senha incorrtetos]
    @Test
    public void loginSenhaIncorretos() { new stepLogin().loginSenhaIncorretos("Teste", "Teste"); }
}