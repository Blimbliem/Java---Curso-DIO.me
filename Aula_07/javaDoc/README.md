## Aula 07 - Java Doc
- A linguagem Java é, desde suas primeiras versões, uma linguagem de documentação rica e detalhada sobre os seus recursos.

- Para ser um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.
 
- A recomendação é leitura e busca da documentação oficial da oracle sobre o Java.

### Tags
- Java Documentation é composto por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos;

- @autor
- @version
- @since
- @param
- @return
- @throws

Exemeplo sobre essas tags na classe calculadora.

### Tipos de comentários
- One Line
- Mult Line
- Documentation

- Obs: Um comentário não possui a finalidade de amenizar um algoritmo não estruturado conforme as convenções da linguagem
 
 ### Javadoc
 - É um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML.

 - Basta executar o comando abaixo no terminal:
 javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d../docs src/*.java