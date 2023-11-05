# Projeto de Simulação de Elevador

## Sobre o Projeto

Este projeto tem como objetivo simular o funcionamento de um elevador em um prédio. Para simplificar, assumimos as seguintes condições:

- O prédio possui apenas um elevador.
- Não nos preocupamos com o peso total dos passageiros.
- Haverá uma entidade externa que monitora as solicitações nos andares e move o elevador.
- O elevador sempre tende a subir ou descer.

## Funcionalidades

As pessoas podem interagir com o sistema do elevador em dois cenários:

### Cenário 1: Fora do Elevador

Neste cenário, a pessoa está em um determinado andar do prédio e fora do elevador. Ela pode realizar as seguintes ações:

- Solicitar o elevador para subir.
- Solicitar o elevador para descer.
- Esperar pela chegada do elevador.

### Cenário 2: Dentro do Elevador

Neste cenário, a pessoa já está dentro do elevador e pode interagir com o painel interno do elevador, realizando as seguintes ações:

- Pedir para o elevador fechar a porta.
- Solicitar parada em um ou mais andares.
- Esperar até o elevador parar.

## Como Executar

Para executar este projeto em sua máquina local, siga estas etapas:

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/elevador-simulation.git
