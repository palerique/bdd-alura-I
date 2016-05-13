package br.com.alura.bdd;

import br.com.alura.bdd.model.CartaoDeCredito;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DefinicaoDePassosDaFeatureLimite {

    private CartaoDeCredito nakedBank;

    //implementando o teste!

    @Dado("^que tenho um cartão com limite de R\\$ (\\d+)$")
    public void que_tenho_um_cartão_com_limite_de_R$(int limite) throws Throwable {
        nakedBank = new CartaoDeCredito();
        nakedBank.setLimiteTotal(limite);
    }

    @Quando("^gastar R\\$ (\\d+) com esse cartão$")
    public void gastar_R$_com_esse_cartão(int valorDaCompra) throws Throwable {
        nakedBank.efetuarCompra(valorDaCompra);
    }

    @Então("^o meu limite disponível deve ser de R\\$ (\\d+)$")
    public void o_meu_limite_disponível_deve_ser_de_R$(int limiteDisponivel) throws Throwable {
        assertThat(nakedBank.getLimiteDisponivel(), is(equalTo(limiteDisponivel)));
    }

}