package br.com.alura.bdd;

import br.com.alura.bdd.model.CartaoDeCredito;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class DefinicaoDePassosDaFeatureLimite {

    private CartaoDeCredito nakedBank;

    //solução para não dar match com vazio - atalho para classes de caracter - \d+

    @Dado("^que tenho um cartão com limite de R\\$ (\\d+)$")
    public void que_tenho_um_cartão_com_limite_de_R$(int limite) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quando("^gastar R\\$ (\\d+) com esse cartão$")
    public void gastar_R$_com_esse_cartão(int valorDaCompra) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Então("^o meu limite disponível deve ser de R\\$ (\\d+)$")
    public void o_meu_limite_disponível_deve_ser_de_R$(int limiteDisponivel) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}