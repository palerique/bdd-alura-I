Feature: Fatura

  Scenario: Efetuando uma compra
    Given que tenho um cartão de crédito
    When fizer uma compra de R$ 50
    Then o total da minha fatura deve ser de R$ 50