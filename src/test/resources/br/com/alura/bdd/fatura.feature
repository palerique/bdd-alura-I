Feature: Fatura

  Scenario: Efetuando uma compra
    Given que tenho um limite de R$ 150
    When fizer uma compra de R$ 50
    Then o total da minha fatura deve ser de R$ 100