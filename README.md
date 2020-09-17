# Projeto Maior Número Irmão

Este programa tem o objetivo de retornar o maior número irmão de um número inteiro positivo.

O método biggestNumberBrother recebe um número inteiro positivo e retorna o maior número irmão.

Exemplos de entrada e saída:<br>
Entrada de 213 tem uma saída de 321;<br>
Entrada de 553 tem uma saída de 553;

O método uiBiggestNumberBrother implementa a interface gráfica do usuário e valida o tipo de dado informado pelo usuário.

### Execução do Projeto

1° Clone o repositório: 

```
$ git clone https://github.com/webvirtua/MaiorNumeroIrmao.git
```
2° Importe o projeto para sua área de trabalho.<br>
3° Execute o programa (Run As > Java Application).

### Testes Unitários

Casos de Teste:

1̣° Testar um número aleatório dentro da faixa de 0 a 100.000.000.<br>
Entrada **213**, resultado esperado: **321**.<br>
Resultado do teste: **passou**.

2° Testar o limite inferior aceito pela especificação.<br>
Entrada **0**, resultado esperado: **0**.<br>
Resultado do teste: **passou**.

3° Testar o limite superior aceito pela especificação.<br>
Entrada **100000000**, resultado esperado: **100000000**.<br>
Resultado do teste: passou.

4° Testar o limite superior excedido aceito pela especificação.<br>
Entrada **100000001**, resultado esperado: **-1**.<br>
Resultado do teste: **passou**.

5° Testar um valor negativo.
Entrada **-1**, resultado esperado: **0**.<br>
Resultado do teste: **passou**.

### Testes Funcionais

Casos de Teste:

1̣° Digitar um número aleatório dentro da faixa de 0 a 100000000.<br>
Entrada **213845**, resultado esperado: **O maior número irmão de 213845 é 854321**.<br>
Resultado do teste: **passou**.

2° Digitar 0 que é o limite inferior aceito pela especificação.<br>
Entrada **0**, resultado esperado: **O maior número irmão de 0 é 0**.<br>
Resultado do teste: **passou**.

3° Digitar 100.000.000 que é o limite superior aceito pela especificação.<br>
Entrada **100000000**, resultado esperado: **O maior número irmão de 100000000 é 100000000**.<br>
Resultado do teste: **passou**.

4° Digitar 100.000.001 que excedide o limite superior aceito pela especificação.<br>
Entrada **100000001**, resultado esperado: **O resultado do maior número irmão não pode ser superior a 100.000.000**.<br>
Resultado do teste: **passou**.

5° Digitar -1 que é um valor negativo.
Entrada **-1**, resultado esperado: **-1 não corresponde a um número inteiro positivo**.<br>
Resultado do teste: **passou**.

6° Digitar números com letras.
Entrada **120ab**, resultado esperado: **Entrada não corresponde a um número inteiro positivo**.<br>
Resultado do teste: **passou**.

7° Digitar somente letras.
Entrada **abCdE**, resultado esperado: **Entrada não corresponde a um número inteiro positivo**.<br>
Resultado do teste: **passou**.

8° Digitar um número maior que 2147483647.
Entrada **21474836479**, resultado esperado: **Entrada não corresponde a um número inteiro positivo**.<br>
Resultado do teste: **passou**.

