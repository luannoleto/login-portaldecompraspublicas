package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class pageLogin {
    public static void aceitarCookies() {
        $(byText("Aceitar todos os cookies")).click();
    }

    public static void usuario(String user) { $(byName("usuario")).shouldBe(visible).setValue(user); }

    public static void senha(String password) {
        $(byName("password")).shouldBe(visible).setValue(password);
    }

    public static void botaoLogar() {
        $(byName("btLogar")).click();
    }

    public static void verificarAcessoDeUsuario() {
        $(byId("container")).shouldHave(text("Pregoeiro Luan - Comprador"));
    }

    public static String verificarAcessoNegado() {
        return $(byCssSelector(".alert-danger")).shouldBe(visible).getText().trim();
    }
}
