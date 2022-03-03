package steps;

import org.junit.Assert;
import pages.pageLogin;

public class stepLogin {
    public void logarUsuario(String user, String pass) {
        pageLogin.aceitarCookies();
        pageLogin.usuario(user);
        pageLogin.senha(pass);
        pageLogin.botaoLogar();
        pageLogin.verificarAcessoDeUsuario();

        new pageLogin();
    }

    public void loginSenhaIncorretos(String user, String pass) {
        pageLogin.aceitarCookies();
        pageLogin.usuario(user);
        pageLogin.senha(pass);
        pageLogin.botaoLogar();
        String msgErro = pageLogin.verificarAcessoNegado();
        Assert.assertEquals("Login e/ou Senha Incorretos!", msgErro);

        new pageLogin();
    }

    public void usuarioSenhaNaoInformados(String user, String pass) {
        pageLogin.aceitarCookies();
        pageLogin.usuario(user);
        pageLogin.senha(pass);
        pageLogin.botaoLogar();
        String msgErro = pageLogin.verificarAcessoNegado();
        Assert.assertEquals("Usuário e senha não informados!", msgErro);

        new pageLogin();
    }

    public void usuarioNaoInformado(String user, String pass) {
        pageLogin.aceitarCookies();
        pageLogin.usuario(user);
        pageLogin.senha(pass);
        pageLogin.botaoLogar();
        String msgErro = pageLogin.verificarAcessoNegado();
        Assert.assertEquals("Usuário não informado!", msgErro);

        new pageLogin();
    }

    public void senhaNaoInformada(String user, String pass) {
        pageLogin.aceitarCookies();
        pageLogin.usuario(user);
        pageLogin.senha(pass);
        pageLogin.botaoLogar();
        String msgErro = pageLogin.verificarAcessoNegado();
        Assert.assertEquals("Senha não informada!", msgErro);

        new pageLogin();
    }
}
