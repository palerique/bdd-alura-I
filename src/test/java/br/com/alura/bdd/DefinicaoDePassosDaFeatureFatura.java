package br.com.alura.bdd;

import br.com.alura.bdd.model.CartaoDeCredito;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DefinicaoDePassosDaFeatureFatura {

    private CartaoDeCredito nakedBank;

    @Given("^que tenho um cartão de crédito$")
    public void que_tenho_um_cartão_de_crédito() throws Throwable {
        nakedBank = new CartaoDeCredito();
    }

    @When("^fizer uma compra de R\\$ (\\d+)$")
    public void fizer_uma_compra_de_R$(int valorDaCompra) throws Throwable {
        nakedBank.efetuarCompra(valorDaCompra);
    }

    @Then("^o total da minha fatura deve ser de R\\$ (\\d+)$")
    public void o_total_da_minha_fatura_deve_ser_de_R$(int totalFatura) throws Throwable {
        assertThat(nakedBank.getValorDaFatura(), is(equalTo(totalFatura)));
    }
}