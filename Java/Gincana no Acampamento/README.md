### **Gincana no Acampamento**

***Desafio:***
  Nas férias de Dezembro, várias escolas se organizam e levam seus 
alunos para um acampamento de férias por uma semana. Nestes acampamentos 
os alunos são divididos em cabanas coletivos por gênero e idade, sempre 
com um adulto que, além de dormir com o grupo no cabana, também são 
responsáveis por criar e executar várias atividades, como por exemplo 
jogos, excursões, Gincanas Noturnas, etc.

  No primeiro dia foi realizada uma gincana em que a atividade constituia 
em agrupar os alunos em um círculo (organizado no sentido anti-horário) do 
qual seriam retiradas uma a uma até que sobrasse apenas um aluno, que seria 
o vencedor.

  No momento em que entra no círculo, cada aluno recebe uma pequena ficha 
que contém um valor de 1 a 500. Depois que o círculo é formado, conta-se, 
iniciando no aluno que está ao lado da primeira que entrou no círculo, o 
número correspondente à ficha que o primeiro detém. O aluno onde o número 
contado cair, deve ser retirado do grupo, e a contagem inicia novamente 
segundo a ficha do aluno que acabou de ser eliminado. Para ficar mais 
interessante, quando o valor que consta na ficha é par, a contagem é feita 
no sentido horário e quando o valor que consta na ficha é ímpar, a contagem 
é feita no sentido anti-horário.

  Desenvolva um programa para que no próximo evento o responsável pela brincadeira 
saiba previamente qual criança irá ser a vencedora de cada grupo, com base nas 
informações fornecidas.

## Entrada
  A entrada contém vários casos de teste. A primeira linha de cada caso de teste 
contém um inteiro N (1 ≤ **N** ≤ 100), indicando a quantidade de alunos que farão parte 
de cada círculo. Em seguida, as N linhas de cada caso de teste conterão duas informações, 
o Nome e o Valor (1 ≤ **Valor** ≤ 500) que consta na ficha de cada aluno, separados por um 
espaço, na ordem de entrada na formação do círculo inicial.

  *OBS*: O Nome de cada aluno não deverá ultrapassar 30 caracteres e contém apenas letras 
maiúsculas e minúsculas, sem acentos, e o caractere “_”. O final da entrada é indicado 
pelo número zero.

## Saída
  Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço 
após o sinal ":" indicando qual é o aluno do grupo que venceu a brincadeira.

*Exemplo de Entrada e Saída:*

|   Entrada    |         Saída         |
| :----------: | :-------------------: |
|      3       | Vencedor(a): Fernanda |
|  Fernanda 7  |  Vencedor(a): Pedro   |
|  Fernando 9  |  Vencedor(a): Pedro   |
|  Gustavo 11  |                       |
|      5       |                       |
|   Maria 7    |                       |
|   Pedro 9    |                       |
| Joao_Vitor 5 |                       |
|  Isabel 12   |                       |
|   Laura 8    |                       |
|      3       |                       |
|   Maria 4    |                       |
|   Pedro 3    |                       |
|    Joao 2    |                       |
|      0       |                       |

## Fórmula

  Depois de conseguir montar um script que encontrasse os vencedores de cada grupo, percebi que havia um padrão, uma lógica diferente da que eu tinha encontrado e que envolvia algumas condicionais e loops. Descobri um jeito de calcular o vencedor e desenvolvi uma fórmula para não ter que fazer muitas manipulações na lista do grupo, ou seja, removendo o item e contando o próximo a ser eliminado do grupo. 

A fórmula funcionou tanto para os testes abertos quanto para os testes fechados da DIO. Não sei se essa fórmula já existe ou se realmente funciona para todas as condições possíveis, pois a única maneira de termos certeza é através da prova matemática.

Apliquei essa fórmula no método **iniciarGincana**:

![Web 1](https://raw.githubusercontent.com/flavioportugal20/Desafios-DIO/main/Java/Gincana%20no%20Acampamento/formula.png)

***tv*** = total dos valores das placas pertencentes ao grupo

***tg*** = total de alunos no grupo

***v1*** = valor da placa do primeiro aluno que entrou no grupo

**Passo a passo:**

1. Somar os valores de todas as placas do grupo.  **(P1)**
2. Guardar o total de alunos do grupo. **(P2)**
3. Somar todas as posições do grupo, ou seja, se um grupo tem 3 alunos, temos  (0 + 1 + 2). **(P3)**
4. Guardar o valor da placa do primeiro aluno que entrou no grupo, somando 1 ao valor. **(P4)**
5. Subtrair o (P1) por (P3). **(P5)**
6. Somar (P5) com o resto da operação (P4) dividido por 2. **(P6)**
7. Guardar o valor do resto da operação (P6) dividido por (P2). **(P7)**
8. Usar o valor de (P7), que representa a posição de um aluno, para retornar o aluno vencedor.

# Autor

[![Linkedin Badge](https://img.shields.io/static/v1?label=IN&message=Fl%C3%A1vio%20Potugal&color=blue)](https://www.linkedin.com/in/flavio-portugal/)
