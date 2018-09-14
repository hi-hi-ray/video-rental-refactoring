# Video Rental Refactoring
Refactoring Test

Livro base: Refactoring - Improving the design of existing code.
Martin Fowler

## Primeiro Passo

#### Create Test

Com base no livro a primeira coisa a se fazer é verificar se há testes, caso não exista é necessário criar-los com o objetivo de ser um *self-checking*.

Um dos outros motivos principais para se ter testes unitários antes de refatorar o seu código, é poder visualizar se as mudanças que você está fazendo não está quebrando o que já existe.

##### No nosso teste, estamos verificando a saída do método principal. [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/e6fb7c3c4dfc245d0fc82b26e71a88b03ec8cc62/video-rental-refactoring/test/CustomerTest.java)

## Segundo Passo - Que comece a Refatoração!

#### Decomposing and Redistributing

No livro é apontado a necessidade de desmantelar o método *statement*, pois ele é muito longo e possui muitas funções centralizadas. 

Métodos que são muito longo possui um *bad smell* que torna difícil a manunteabilidade do código, atualização de método, busca por erros e até fazer teste unitários significativos.


##### Na nossa primeira refatoração, começamos o processo de distribuição do código. 
##### Nessa parte estamos removendo o *Bad Smell* conhecido como *Too Long* referênciado nas páginas do livro base 76-77. 
###### [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/ccb0791b3a7cc5c48470aa5074c68ea47c6c785d/video-rental-refactoring/src/com/refactoring/Customer.java)


#### Moving Method

No livro é apontado que o método que acabamos de criar *(amountFor)*, ele não faz muito sentido estar na classe *Customer* e sim na classe *Rental*, pois ele está utilizando dados da classe citada.

Métodos que são fazem a requisição de atributos de uma outra classe possui um *bad smell* que o torna não coerente e realiza requisições a outras classes desnecessárias.


##### Na nossa segunda refatoração, adicionamos o método em *Rental* para trazer uma coesão no código. 
##### Nessa parte estamos removendo o *Bad Smell* conhecido como *Feature Envy* referênciado nas páginas do livro base 80-81. 
###### [Commit e Arquivos Relacionados](https://github.com/hi-hi-ray/video-rental-refactoring/commit/6848de65b39c1253cc27849a7c52e78ce5c48528)


#### Replace a Temp with a Query

No livro é apontado que após a nossa última mudança que foi feita, a variável *amountFor* se tornou redundante dentro do método *statement* da classe *Customer*

##### Na nossa terceira refatoração, começamos o processo de substituição. 
###### [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/ff7974e3fbefc98ade2592a2f2d2522912735842/video-rental-refactoring/src/com/refactoring/Customer.java)



                          
