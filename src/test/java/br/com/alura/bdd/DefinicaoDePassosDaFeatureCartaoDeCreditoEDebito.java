package br.com.alura.bdd;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class DefinicaoDePassosDaFeatureCartaoDeCreditoEDebito {

//    private CartaoDeCreditoEDebito bancoVestido;

    @Dado("^que tenho um cartão de crédito com R\\$ (\\d+) de limite de crédito$")
    public void que_tenho_um_cartão_de_crédito_com_R$_de_limite_de_crédito(int limite) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @E("^função de débito numa conta corrente com R\\$ (\\d+) de saldo$")
    public void função_de_débito_numa_conta_corrente_com_R$_de_saldo(int saldo) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //Capturando dois parâmetros:

    @Quando("^fizer uma compra de R\\$ (\\d+) na função (.+)$")
    public void fizer_uma_compra_de_R$_na_função_débito(int valorDaCompra, String funcao) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Então("^a minha fatura deve ser de R\\$ (\\d+)$")
    public void a_minha_fatura_deve_ser_de_R$(int valorDaFatura) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @E("^o saldo da da minha conta corrente R\\$ (\\d+)$")
    public void o_saldo_da_da_minha_conta_corrente_R$(int saldoDaContaCorrente) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @E("^o limite disponível R\\$ (\\d+)$")
    public void o_limite_disponível_R$(int limiteDisponivel) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}