### Estrutura condicionais
-  Elas possibilitam a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas.
- Elas podem ser consideradas simples ou compostas.

### Estrutura condicionais - simples
- Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura simples;

### Estrutura condicionais - composta
- Quando o programa seguir mais de uma jornada de execução condicionado a uma regra de negocio, este cenário é denominado Estrutura condicional composta.

### Estrutura condicionais - encadeada
- Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.

### Estrutura condicionais - ternária
- Como já vimos anteriormente com os operadores, podemos abreviar nosso algoritmo condicional refatorando com o conceito de operador ternário. 

### Estrutura condicionais - Swich Case
- É uma estrutura que compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. 
- Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, utilizamos o comando break no final de cada bloco de códigos. 
- O comando break, quando executado, encerra a execução da estrutura onde ele se encontra.

- Sempre avaliar, a nível de estrutura e aplicação a usabilidade de swich case ou if else, pois as vezes, em questão de sintaxe, o swich case não acresenta ao código.

- O arquivo com o nome PlanoOperadora, utiliza primeiramente a estrutura com if else, e nesse caso, devido a execessiva repetição do código, acaba não sendo interessante utiliza-lo, e se você observar no arquivo PlanoOperadoraSwich, pode ver que o uso do swich case cai como uma luva para esse escopo.