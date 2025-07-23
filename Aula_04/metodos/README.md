## Métodos
- Todas as ações das aplicações são consideradas métodos.

- Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponiveis dentro de nossas classes.

### Critérios de nomeação de métodos
São convenções que facilitam a vida de programadores ao trabalharem em códigos de forma colaborativa.

- Deve ser momeado como verbo, normalmente, no infinitivo;
- Seguir o padrão camelCase;

Ex:
somar(int n1, int n2){}
abrirConexao(){}
findById(int id){}
calcularImprimir(){} // O que ele faz Imprimi ou Calcula? Seguindo as boas práticas, esse método só deveria ter uma unica ação.

- Não existe no Java, o conceito de métodos globais. Isso significa que todos os métodos devem sempre ser definidos dentro de uma classe.

### Critérios para definição de métodos:
- 1 Qual a proposta principal do método? Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
- 2 Qual o tipo de retorno esperado após executar o método? Você deve analisar se o método será responsável por retornar algum valor ou não.
- Caso o método não retorne nenhum valor, ele será representado pela key-word "void".

- Quais parâmetros serão necessários para execução do método?
- O método possui o risco de apresentar alguma execeção? 
- Qual a visibilidade do método?

### Exercicio - Televisão
- Criar um exemplo de classe para representar uma TV, onde:
1- Tenha características: Ligada (boolean), canal (int) e volume (int)
2- TV poderá ligar e desligar e assim mudar o estado ligada(ou seja, só podera realizar as outras ações se o ligado for true);
3- TV aumentará e diminuirá o volume sempre +1 ou -1;
4- TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
