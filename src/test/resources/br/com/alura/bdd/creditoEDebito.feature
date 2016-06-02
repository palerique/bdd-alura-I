# language: pt
Funcionalidade: Cartão de Crédito e Débito
  Para poder comprar à vista ou a crédito
  Como cliente
  Desejo ter um cartão de débito e crédito

  Cenário: Comprando a débito
    Dado que tenho um cartão de crédito com R$ 1000 de limite de crédito
    E função de débito numa conta corrente com R$ 1000 de saldo
    Quando fizer uma compra de R$ 50 na função débito
    Então o saldo da da minha conta corrente deve ser de R$ 950
    E o limite disponível R$ 1000

    # descrevendo uma nova feature com a palavra chave 'E'
    # E aprender como capturar vários parâmetros!
    # Cada grupo - ( ) - é um parâmetro diferente