package br.com.alura.bdd;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinicaoDePassos {

    @Given("^o preço do curso de \"([^\"]*)\" seja R\\$ (\\d+)$")
    public void o_preço_do_curso_de_seja_R$(String arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Eu comprar (\\d+) curso de \"([^\"]*)\"$")
    public void eu_comprar_curso_de(int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^o total da minha fatura deve ser de R\\$ (\\d+)$")
    public void o_total_da_minha_fatura_deve_ser_de_R$(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
