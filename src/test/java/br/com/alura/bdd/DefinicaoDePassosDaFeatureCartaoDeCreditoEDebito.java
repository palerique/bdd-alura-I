package br.com.alura.bdd;

import br.com.alura.bdd.model.CartaoDeCreditoEDebito;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DefinicaoDePassosDaFeatureCartaoDeCreditoEDebito {

    private CartaoDeCreditoEDebito cartaoBancoVestido;

    @Dado("^que tenho um cartão de crédito com R\\$ (\\d+) de limite de crédito$")
    public void que_tenho_um_cartão_de_crédito_com_R$_de_limite_de_crédito(int limite) throws Throwable {
        cartaoBancoVestido = new CartaoDeCreditoEDebito();
        cartaoBancoVestido.setLimiteDeCredito(limite);
    }

    @E("^função de débito numa conta corrente com R\\$ (\\d+) de saldo$")
    public void função_de_débito_numa_conta_corrente_com_R$_de_saldo(int saldo) throws Throwable {
        cartaoBancoVestido.setSaldoDeDebito(saldo);
    }

    @Quando("^fizer uma compra de R\\$ (\\d+) na função (.+)$")
    public void fizer_uma_compra_de_R$_na_função_débito(int valorDaCompra, String funcao) throws Throwable {
        switch (funcao) {
            case "débito":
                cartaoBancoVestido.comprarNoDebito(valorDaCompra);
                break;
            case "crédito":
                cartaoBancoVestido.comprarNoCredito(valorDaCompra);
                break;
        }
    }

    @Então("^o saldo da da minha conta corrente deve ser de R\\$ (\\d+)$")
    public void o_saldo_da_da_minha_conta_corrente_R$(int saldoDaContaCorrente) throws Throwable {
        assertThat(cartaoBancoVestido.getSaldoDaContaCorrente(), is(equalTo(saldoDaContaCorrente)));
    }

    @E("^o limite disponível R\\$ (\\d+)$")
    public void o_limite_disponível_R$(int limiteDisponivel) throws Throwable {
        assertThat(cartaoBancoVestido.getLimite(), is(equalTo(limiteDisponivel)));
    }
}