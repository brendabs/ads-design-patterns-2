# E-commerce ADS

Atividade desenvolvida como requisito parcial de avaliação na disciplina Análise e Desenvolvimento de Sistemas do curso de Sistemas de Informação do Centro Universitário de Patos de Minas, sob orientação do professor Filipe Guelber Melo.

## Objetivo

O objetivo deste trabalho foi a implementação de um Caso de Uso representando a compra de determinado(s) produto(s) em um e-commerce de eletrônicos.

## Design Patterns Utilizados

* Proxy
* Observer
* Composite
* Facade

## Justificativa do uso de cada Pattern

* Proxy: redirecionar o cliente para as ofertas com desconto exclusivo de Black Friday ou prosseguir com a compra sem desconto específico desta data;
* Observer: tratar a excessão onde não há determinado produto em estoque. Caso não tenha, o cliente será informado por e-mail assim que o produto estiver em estoque novamente e prosseguirá com a compra;
* Composite: tratar a situação onde o cliente opta por comprar um combo de produtos. Quando isso ocorre, é aplicado um desconto de forma automática como forma de beneficiar o cliente por optar pelo combo;
* Facade: transferir a responsabilidade de venda para o vendedor (SaleService). O cliente apenas se preocupa com solicitar a compra, enquanto o vendedor trata o restante das responsabilidades para atender o pedido do cliente.

## Autores

* brendabs => Brenda Braga de Santana
* ederwms => Éder Willian Moreira Sousa