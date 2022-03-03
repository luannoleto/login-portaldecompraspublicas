package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;

public class pageHome {
    public static void criarNovoProcesso() {
        $(byTitle("Criar Novo Processo")).shouldBe(visible).click();
    }
}