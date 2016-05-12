# language: pt
Funcionalidade: Limite
  Para limitar os gastos
  Como instituição financeira
  Desejo ter um limite de gastos estabelecido para cada cliente

  Cenário: Efetuando uma compra com limite disponível suficiente 1000
    Dado que tenho um cartão com limite de R$ 1000
    Quando gastar R$ 50 com esse cartão
    Então o meu limite disponível deve ser de R$ 950

  Cenário: Efetuando uma compra com limite disponível suficiente 500
    Dado que tenho um cartão com limite de R$ 500
    Quando gastar R$ 100 com esse cartão
    Então o meu limite disponível deve ser de R$ 400

  Cenário: Efetuando uma compra com limite disponível suficiente 10000
    Dado que tenho um cartão com limite de R$ 10000
    Quando gastar R$ 1 com esse cartão
    Então o meu limite disponível deve ser de R$ 9999

  Cenário: Efetuando uma compra com limite disponível suficiente doido
    Dado que tenho um cartão com limite de R$ 0
    Quando gastar R$ 0 com esse cartão
    Então o meu limite disponível deve ser de R$ 0

    # solucionado com \d+

