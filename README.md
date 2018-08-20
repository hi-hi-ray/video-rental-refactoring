# Video Rental Refactoring
Refactoring Test

Livro base: Refactoring - Improving the design of existing code.
Martin Fowler

## Primeiro Passo

#### Create Test

Com base no primeiro capítulo a primeira coisa a se fazer é verificar se há testes, caso não exista é necessário criar-los com o objetivo de ser *self- checking*.

##### No nosso teste, estamos verificando a saída do método principal. [Commit e Arquivo Relacionado](https://github.com/hi-hi-ray/video-rental-refactoring/blob/e6fb7c3c4dfc245d0fc82b26e71a88b03ec8cc62/video-rental-refactoring/test/CustomerTest.java)


#### Decomposing and Redistributing

Com base ainda no primeiro capítulo é apontado a necessidade de desmantelar o método statement pois ele é muito longo e possui muitas funções centralizadas. O que torna dificil a manunteabilidade do código, atualização de método, busca por erros e até fazer teste unitários significativos.

##### Na nossa primeira refatoração, começamos o processo de distribuição do código. Nessa parte estamos removendo o *Bad Smell* conhecido como *Too Long* referênciado nas páginas do livro 76-77. [Commit e Arquivo Relacionado](#)