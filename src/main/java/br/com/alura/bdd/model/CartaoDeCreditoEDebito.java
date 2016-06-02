package br.com.alura.bdd.model;

/**
 * Created by ph on 6/2/16.
 */
public class CartaoDeCreditoEDebito {
    private int limiteDeCredito;
    private int saldoDeDebito;

    public int getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(int limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public int getSaldoDeDebito() {
        return saldoDeDebito;
    }

    public void setSaldoDeDebito(int saldoDeDebito) {
        this.saldoDeDebito = saldoDeDebito;
    }

    //Implementando os métodos para que os testes passem:
    public void comprarNoDebito(int valorDaCompra) {
        saldoDeDebito -= valorDaCompra;

    }

    //Implementando os métodos para que os testes passem:
    public void comprarNoCredito(int valorDaCompra) {
        limiteDeCredito -= valorDaCompra;
    }

    public Integer getSaldoDaContaCorrente() {
        return saldoDeDebito;
    }

    public Integer getLimite() {
        return limiteDeCredito;
    }
}
