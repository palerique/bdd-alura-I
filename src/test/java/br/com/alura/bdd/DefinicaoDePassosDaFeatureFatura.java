package br.com.alura.bdd;

import br.com.alura.bdd.model.CartaoDeCredito;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DefinicaoDePassosDaFeatureFatura {

    private CartaoDeCredito nakedBank;

    @Dado("^que tenho um cartão de crédito$")
    public void que_tenho_um_cartão_de_crédito() throws Throwable {
        nakedBank = new CartaoDeCredito();
    }

    @Quando("^fizer uma compra de R\\$ (\\d+)$")
    public void fizer_uma_compra_de_R$(int valorDaCompra) throws Throwable {
        nakedBank.efetuarCompra(valorDaCompra);
    }

    @Então("^o total da minha fatura deve ser de R\\$ (\\d+)$")
    public void o_total_da_minha_fatura_deve_ser_de_R$(int totalFatura) throws Throwable {
        assertThat(nakedBank.getValorDaFatura(), is(equalTo(totalFatura)));
    }
}