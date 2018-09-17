# Video Rental Refactoring
Refactoring Test

Livro base: Refactoring - Improving the design of existing code.
Martin Fowler

## Primeiro Passo

#### Create Test

Com base no livro a primeira coisa a se fazer é verificar se há testes, caso não exista é necessário criar-los com o objetivo de ser um *self-checking*.

Um dos outros motivos principais para se ter testes unitários antes de refatorar o seu código, é poder visualizar se as mudanças que você está fazendo não está quebrando o que já existe.

##### No nosso teste, estamos verificando a saída do método principal. 

###### [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/e6fb7c3c4dfc245d0fc82b26e71a88b03ec8cc62/video-rental-refactoring/test/CustomerTest.java)

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

No livro é apontado que após a nossa última mudança que foi feita, tornou a variável *thisAmount* redundante dentro do método *statement*, e que podemos remover essa variável.
 

##### Na nossa terceira refatoração, começamos o processo de substituição. Onde era utilizado a variável *thisAmount* foi substituido pelo método *getCharge* da classe *Rental*.

###### [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/ff7974e3fbefc98ade2592a2f2d2522912735842/video-rental-refactoring/src/com/refactoring/Customer.java)

------------

No livro é apontado que ainda podemos remover a variável o qual está sendo utilizada para pegar o total de aluguéis (*rentals*) se relacionando com o cliente (*customer*).


##### Na nossa quarta refatoração, faremos outra substituição. Onde era a variável *totalAmount* foi substituido pelo método *getTotalCharge*.

###### [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/62d0d8effaf1252a047bd458e0d7b77da86d3436/video-rental-refactoring/src/com/refactoring/Customer.java)


#### Extract Method

No livro é comentado que devemos colocar o *frequentRenterPoints* e a forma que ele é calculado na classe que fará mais sentido.
 

##### Na nossa quinta refatoração, começamos o processo de extração do *frequentRenterPoints* e inserimento na classe *Rental*. Após essa mudança ser feita é perceptível que na lógica é necessário adicionar 2 caso ele responda a condição caso (*(getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1*).

###### [Commit e Arquivos Relacionados](https://github.com/hi-hi-ray/video-rental-refactoring/commit/c8d9380e1eb35f2b45533209ca1c9de24c695d9a#diff-04c6e90faac2675aa89e2176d2eec7d8)


#### Replace a Temp with a Query

Agora como foi apontado no livro podemos remover a variável o qual está sendo utilizada para pegar o total de pontos (*frequentRenterPoints*).


##### Na nossa sexta refatoração, faremos outra substituição. Onde era a variável *frequentRenterPoints* foi substituido pelo método *getFrequentRenterPoints*.

###### [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/80e20901155ededfa53dafe12b45b15811bbbc0c/video-rental-refactoring/src/com/refactoring/Customer.java)


#### Put a HTML in the Statement function

No livro é falado que podemos por um html com as respostas do nosso sistema.

##### Aqui atualizamos o código inserindo o html e mudando o nome do método *statement*. E também atualizamos o teste e classe main.

###### [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/42b95d5ca626e24afd7e28515c6f0b9f1c7e9dc4)

                          
#### Replace Conditional with Polymorphism

No livro é apontado a necessidade de desmantelar o método *getCharge*, pois ele possui um *Switch Statement* o qual utiliza um outro objeto (*Movie*). 

*Switch Statements* é um *bad smell* que pode trazer código duplicado e demonstra uma falta de orientação objetiva e uma oportunidade perdida de confiar na elegância do polimorfismo.


##### Na nossa sétima refatoração, começamos o processo de mover o método de *getCharge* para o *Movie*. E mudamos o conteúdo do método *getCharge* em *Rental* 
 
##### Nessa parte estamos removendo o *Bad Smell* conhecido como *Switch Statements* referênciado nas páginas do livro base 82. 

###### [Commit e Arquivos Relacionados](https://github.com/hi-hi-ray/video-rental-refactoring/commit/5757e0345c190ff63c76e7ef7684e8d5ebb48c4c)

------------

Seguindo a mesma linha de raciocínio acima iremos fazer o mesmo procedimento para *getFrequentRenterPoints*.


##### Na nossa oitava refatoração, começamos o processo de mover o método de *getFrequentRenterPoints* para o *Movie*. E mudamos o conteúdo do método *getFrequentRenterPoints* em *Rental* 

###### [Commit e Arquivos Relacionados](https://github.com/hi-hi-ray/video-rental-refactoring/commit/888a8ed9dee9a07507e0be98b7463ce55695eba1)


#### Self Encapsulate Field 

No livro é comentado que agora o proximo passo é criar uma herança na classe *Movie*, porém devemos criar uma nova classe nesse processo chamada de *Price*.

##### Na nossa nona refatoração, vamos criar uma classe *Price* e criar filhos para ela. 

###### [Commit e Arquivos Relacionados](https://github.com/hi-hi-ray/video-rental-refactoring/commit/8068ea05420f332de7cf150df76c4b34bbe80d51)


#### Moving Method

No livro é comentado que agora o proximo passo é mover o *getCharge* para a classe *Price*, pois ela faria mais sentido esse método estar na classe citada.

##### Na nossa décima refatoração, vamos mover para a classe *Price* o método *getCharge*.

###### [Commit e Arquivos Relacionados]()


