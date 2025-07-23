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
