package pages;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class pageCadastroProcesso {
    public static void modalidade(String modalidade) {
        $(byName("slCD_TIPO_LICITACAO")).shouldBe(visible).selectOption(modalidade);
    }

    public static void realizacao(String realizacao) {
        $(byName("slCD_TIPO_REALIZACAO_LICITACAO")).shouldBe(visible).selectOption(realizacao);
    }

    public static void julgamento(String julgamento) {
        $(byName("slCD_TIPO_JULGAMENTO_LICITACAO")).shouldBe(visible).selectOption(julgamento);
    }

    public static void aplicarCotas(String cota) {
        $(byName("slCD_BOLEANO_D_APLICAR_147")).shouldBe(visible).selectOption(cota);
    }

    public static void tratamentoDiferenciado(String tratamentoDiferenciado) {
        $(byName("slCD_TRATAMENTO_DIFERENCIADO")).shouldBe(visible).selectOption(tratamentoDiferenciado);
    }

    public static void beneficioLocalRegional(String beneficioLocalRegional){
        $(byName("slCD_BOLEANO_D_BENEFICIO_LOCAL")).shouldBe(visible).selectOption(beneficioLocalRegional);
    }

    public static void compraMajorada(String compraMajorada) {
        $(byName("slCD_BOLEANO_D_DECRETO_MUNICIPAL")).shouldBe(visible).selectOption(compraMajorada);
    }

    public static void tratamentoFaseLances(String tratamentoFase){
        $(byName("slCD_TRATAMENTO_FASE_LANCE")).shouldBe(visible).selectOption(tratamentoFase);
    }

    public static void aplicarIntervaloMinimoLances(String aplicarIntervaloMinimoLances){
        $(byName("slCD_BOLEANO_D_EXIBE_INTERVALO")).shouldBe(visible).selectOption(aplicarIntervaloMinimoLances);
    }

    public static void tipoIntervaloLances(String tipoIntervaloLances){
        $(byName("slCD_TIPO_INTERVALO_LANCE")).shouldBe(visible).selectOption(tipoIntervaloLances);
    }

    public static void valorIntervaloLances(String valorIntervaloLances){
        $(byId("ttVALOR_INTERVALO_LANCE")).shouldBe(visible).setValue(valorIntervaloLances);
    }

    public static void separarItensPorLotes(String itensPorLote) {
        $(byName("slCD_BOLEANO_D_LOTES")).shouldBe(visible).selectOption(itensPorLote);
    }

    public static void formaDisputaLote(String formaDisputaLote){
        $(byId("slCD_OPERACAO_LOTE")).shouldBe(visible).setValue(formaDisputaLote);
    }

    public static void valorReferencia(String valorReferencia) {
        $(byName("slCD_BOLEANO_D_VALOR_REFERENCIA")).shouldBe(visible).selectOption(valorReferencia);
    }

    public  static void orcamentoSigiloso(String orcamentoSigiloso) {
        $(byName("slCD_BOLEANO_D_VALOR_REFERENCIA")).shouldBe(visible).selectOption(orcamentoSigiloso);
    }

    public static void origemRecursos() {
        $(byId("ckCD_TIPO_ORIGEM_RECURSO1")).shouldBe(visible).click();
    }

    public static void unidadeDeCompra(String unidadeCompra) {
        $(byName("slCD_UNIDADE_COMPRADORA")).shouldBe(visible).selectOption(unidadeCompra);
    }

    public static void autoridadeCompetente(String autoridadeCompetente) {
        $(byName("slCD_USUARIO_ENTIDADE_D_ORDENADOR")).shouldBe(visible).selectOption(autoridadeCompetente);
    }

    public static void equipeApoio() {
        $(byId("ckCD_USUARIO_APOIO274588")).shouldBe(visible).click();
    }

    public static void numeroProcessoExterno(String processoExterno) {
        $(byId("ttNUMERO_PREGAO")).shouldBe(visible).setValue(processoExterno);
    }

    public static void numeroProcessoInterno(String processoInterno) {
        $(byId("ttNUMERO_PROCESSO")).shouldBe(visible).setValue(processoInterno);
    }

    public static void objeto(String descricaoProcesso) {
        $(byId("ttOBJETO")).shouldBe(visible).setValue(descricaoProcesso);
    }

    public static void garantiaContratual(String garantiaContratual) {
        $(byName("slCD_BOLEANO_D_GARANTIA")).shouldBe(visible).selectOption(garantiaContratual);
    }

    public static void casasDecimais(String decimais) {
        $(byName("slCD_BOLEANO_D_GARANTIA")).shouldBe(visible).selectOption(decimais);
    }

    public static void dataInicioProposta(String dtInicioProposta) {
        $(byId("ttDATA_INICIO_PROPOSTAS")).shouldBe(visible).setValue(dtInicioProposta);
    }

    public static void dataLimiteImpugnacao(String dtImpugnacao) {
        $(byId("ttDATA_LIMITE_RECURSO_EDITAL")).shouldBe(visible).setValue(dtImpugnacao);
    }

    public static void dataLimitePedidoEsclarecimento(String dtEsclarecimento) {
        $(byId("ttDATA_LIMITE_ESCLARECIMENTO")).shouldBe(visible).setValue(dtEsclarecimento);
    }

    public static void dataFinalProposta(String dtFimProposta) {
        $(byId("ttDATA_FINAL_PROPOSTAS")).shouldBe(visible).setValue(dtFimProposta);
    }

    public static void dataAberturaProposta(String dtAberturaProposta) {
        $(byId("ttDATA_INICIO_LANCES")).shouldBe(visible).setValue(dtAberturaProposta);
    }

    public static void horaInicioProposta(String hrInicioProposta) {
        $(byId("ttHORA_INICIO_PROPOSTAS")).shouldBe(visible).setValue(hrInicioProposta);
    }

    public static void horaLimiteImpugnacao(String hrImpugnacao) {
        $(byId("ttHORA_LIMITE_RECURSO_EDITAL")).shouldBe(visible).setValue(hrImpugnacao);
    }

    public static void horaLimitePedidoEsclarecimento(String hrEsclarecimento) {
        $(byId("ttHORA_LIMITE_ESCLARECIMENTO")).shouldBe(visible).setValue(hrEsclarecimento);
    }

    public static void horaFinalProposta(String hrFimProposta) {
        $(byId("ttHORA_FINAL_PROPOSTAS")).shouldBe(visible).setValue(hrFimProposta);
    }

    public static void horaAberturaProposta(String hrAberturaProposta) {
        $(byId("ttHORA_INICIO_LANCES")).shouldBe(visible).setValue(hrAberturaProposta);
    }

    public static void botaoSalvar() {
        $(byName("btGravar")).shouldBe(visible).click();
    }

    private void selecionarEdital(File capa) {
            String jsScript = "document.getElementById('upcover').classList.remove('el-upload__input');";
            executeJavaScript(jsScript);

            $(byId("ttDadosArquivo")).uploadFile(capa);
        }

//    public static void botaoSalvar() {
//        $(byName("btGravar")).shouldBe(visible).click();
//    }














    public static String verificarMensagemSucesso() {
        return $(byCssSelector(".alert-danger")).shouldBe(visible).getText().trim();
    }

}
