# Contador
## Desafio bootcamp Santander 2023

Consiste no desenvolvimento de um fluxo de código que recebe dois números, onde o segundo input deve ser maior que o primeiro.

Para tal é feito a criação de uma Exception personalizada. 

###  É necessario utilizar de extends da classe Exception/UnchekedException na classe que será o nossa Exceção, onde:

Exception são os erros recuperáveis

UnchekedException são erros não recuperáveis

Exemplo de código utilizado para captura e tratamento de erros em java:

```java
//try "tenta" executar o bloco de código, caso encontre determinado erro direciona para o bloco catch
try {
    // seu código

//catch "captura" o erro passado por parâmetro para trata-lo dentro do bloco de código do mesmo.
} catch (<nome da exceção> e) {

//finally é executado independente da execução acima.
//desde que o programa não seja encerrado devido a uma uncheked
} finally {
    //seu código
}
```
#### 📚 Palavras-chave Throw e Throws

##### Breve explicação:
Imagine nossos blocos de código como caixas, e dentro destas caixas possuimos outras caixas.
Quando utilizamos throw estamos falando que a responsabilidade de abrir aquela caixa está sendo "jogada pra cima", de maneira que a caixa que está acima tem de resolver o que está ali ou ela também pode "jogar para cima" a responsabilidade.

Já na utilização de throws é diferente estamos dizendo para determinada caixa: "A responsabilidade é sua, resolve ai".

Lembre-se que estamos falando de tratativas de erros. Abraços.

