package br.com.alura.bdd.model;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private List<Integer> compras = new ArrayList<>();
    private int limiteTotal;

    public void efetuarCompra(int valorDaCompra) {
        compras.add(valorDaCompra);
    }

    public int getValorDaFatura() {
        int total = 0;
        for (Integer valor : compras) {
            total += valor;
        }
        return total;
    }

    public int getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(int limite) {
        this.limiteTotal = limite;
    }

    public int getLimiteDisponivel() {
        return getLimiteTotal() - getValorDaFatura();
    }
}
