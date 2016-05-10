Feature: Fatura

  Scenario: Comprar um curso
    Given o preço do curso de "BDD" seja R$ 100
    When Eu comprar 1 curso de "BDD"
    Then o total da minha fatura deve ser de R$ 100