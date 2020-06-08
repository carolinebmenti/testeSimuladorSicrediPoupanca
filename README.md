# Teste para QA da Plataforma Digital Sicredi

**1. Ferramentas de Testes utilizadas**

1.1 Teste de UI com Selenium Webdriver em Java "1.8.0_251" com Junit, PageObject, DataDrivenTest (Gerenciamento de massa de dados)

1.2 Chromedriver na versão 81 do Chrome

1.3 Teste de API com Rest Assured em Java "1.8.0_251" com Junit e BDD(Given, When, Then)

1.4 IDE - Intellij com Gradle 6.5 das dependencias.

1.5 É necessário ter a versão do Google Chrome igual a 83.0.4103.97.

**2. Estratégia de Testes utilizadas**

2.1 Foram realizados os métodos de testes chamados "Partição de Classe de Equivalência" e "Análise de Valor Limite" para realizar a entrada (inputs) de dados dos campos 'valor inicial' e 'valor a investir' para os testes de UI (user interface) com Selenium Webdriver.
A escolha dessa estratégia teve como intuito limitar o número de caso de testes e ter um resultado satisfatório a fim de focar na qualidade da solução a ser implementada.

**3. Casos de testes**

_3.1 Selenium Webdriver:_

3.1.1 simularInvestimentoDaPoupanca:
Descrição: inserção de inputs de entrada de valor inicial, valor a investir e tempo.
Caso de Teste: Positivo

3.1.2 informarValorInferiorAoMinimoPermitido:
Descrição: inserção de inputs de entrada de valor inicial, valor a investir e tempo inferior ao minimo permitido.
Caso de Teste: Negativo

3.1.3 informarValorSuperiorAoMaximoPermitido:
Descrição: inserção de inputs de entrada de valor inicial e valor a investir superior ao maximo permitido.
Caso de Teste: Negativo

_3.2 Rest Assured:_

3.2.1 consultarRecursoInexistente
Descrição: consulta a um recurso inexistente para ver o comportamento do sistema.
Caso de Teste: Negativo

3.2.2 consultarDadosSimulacao
Descrição: consultar ao resultado da simulação das 4 opções geradas pela aplicação de meses e valores.
Caso de Teste: Positivo

3.2.3 tentarDeletarDadosSimulador
Descrição: realizado um teste de segurança, para garantir que os dados não possam ser deletados da base.
Caso de Teste: Negativo

**4.Passo a passo para baixar o repositório do GITHUB no Intellij IDEA**

4.1 Abrir a ferramenta Intellij IDEA

4.2 Clicar em 'File'

4.3 Clicar em 'New'

4.4 Clicar em 'Project from Version Control'

4.5 campo (Version Control), selecionar a opção 'Git'

4.6 campo (URL), inserção da URL (https://github.com/carolinebmenti/testeSimuladorSicrediPoupanca.git)

4.7 Clicar no botão 'Clonar'


