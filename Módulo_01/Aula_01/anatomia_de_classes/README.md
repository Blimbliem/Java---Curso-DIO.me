## Aula 01 - Anatomia das classes

Uma classe bem estruturada não quer guerra com ninguem.

Normalmente, todas as classes contém um nome interativo com aquilo que a mesma estará realizando, ou seja, é necessário, para a criação das classes, ter essa preocupação/cuidado na hora de escolher um nome para suas classes.

Em uma classe, é muito importante levar em consideração a forma como iniciamos a sua escrita: deve sempre começar com letra maiúscula e sempre ter aquele principio de inteção, ou seja, qual a minha intenção ao criar aquela classe? o que ela fará para o meu projeto? Isso vai deixar o código mais legível.

Outro aspecto importante na criação de classes é sobre as classes executáveis e não executáveis. Sendo bem direto ao ponto: executáveis = deverá carregar o método main, não executáveis = não precisa utilizar o metodo main.

### Padrões de nomenclatura:
- Arquivo ".java": Todo arquivo ".java" deve começar com letra maiúscula. Ex: Calculadora.java

- Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo ".java".
Ex: arquivo CalculadoraCientifica.java
    nome da classe: "public class CalculadoraCientifica {}"

- Nome de variável: Toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser maiúscula. Ex: ano e anoPublicacao (camelCase);

- Variáveis constantes segue a seguinte convenção: Deve ser escrita em maiúscula. Ex:
    String BR = "Brasil"; -> o valor dessa variável não deve ser alterado. Neste caso utilizamos a expressão "final" e por fim ficará dessa forma:
    final String BR = "Brasil";

No arquivo "Convencoes.java" contem exemplos das convenções que devem e não devem ser seguidas.


### Declaração de variaveis
Estrutura:

Tipo NomeBemDefinido = Atribuiçãoo (opcional em alguns casos)

Exemplo:

int idade = 23;
double altura = 1.80;
Dog spike;

Voce pode averiguar no arquivo "Variaveis.java".


### Declaração de métodos
Estrutura:

TipoDeRetorno NomeObjetivoNoInfinitivo Parametro(s)

Exemplo:

int somar (int numeroUm, int numero2)

String formatarCep (long cep)

Você pode averiguar no arquivo "Metodos.java".

### Organizando arquivos
A organização de arquivos é realizada através de packages. É uma forma de criarmos uma estrutura de subdiretórios, sendo assim, teremos uma melhor estruturação dos arquivos.
Ex:
com.hypertech.notification.app
com.hypertech.notification.model
com.hypertech.notification.util
com.hypertech.notification.service


edu.blimblim.aulaum

