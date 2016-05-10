package br.com.alura.bdd;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinicaoDePassosDaFeatureFatura {

    @Given("^que tenho um limite de R\\$ (\\d+)$")
    public void que_tenho_um_limite_de_R$(int limite) throws Throwable {
        throw new PendingException();
    }

    @When("^fizer uma compra de R\\$ (\\d+)$")
    public void fizer_uma_compra_de_R$(int valorDaCompra) throws Throwable {
        throw new PendingException();
    }

    @Then("^o total da minha fatura deve ser de R\\$ (\\d+)$")
    public void o_total_da_minha_fatura_deve_ser_de_R$(int totalFatura) throws Throwable {
        throw new PendingException();
    }

}