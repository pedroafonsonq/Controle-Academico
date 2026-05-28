Markdown
# Controle Acadêmico - Análise de Testes com JUnit 5

Este projeto faz parte de uma atividade prática de Engenharia de Software / Verificação e Validação de Software, ministrada pelo **Prof. Douglas**. O objetivo principal foi realizar o diagnóstico e a manutenção corretiva de um bug de lógica matemática em um sistema legado de controle acadêmico utilizando o framework **JUnit 5**.

---

##  O Problema Diagnosticado

O sistema legado possuía um defeito crítico no método `calcularMedia` da classe `ControleAcademicoService`. Devido à **falta de parênteses para isolar a operação de soma**, o Java executava primeiro a divisão (por regras de precedência matemática), gerando médias completamente erradas.

* **Código com Defeito:**
  ```java
  public double calcularMedia(double nota1, double nota2) {
      return nota1 + nota2 / 2; // Executa nota2 / 2 e depois soma com nota1
  }
 A Solução Aplicada
A correção aplicada garantiu a precedência da soma das notas antes de realizar a divisão por dois, utilizando tipos de ponto flutuante adequados para evitar truncamento de valores.

Código Corrigido:

Java
public double calcularMedia(double nota1, double nota2) {
    return (nota1 + nota2) / 2.0; // Soma primeiro, divide depois
}
 Estrutura dos Testes Automatizados (JUnit 5)
Foi desenvolvida uma suíte de testes com a asserção assertEquals para validar o comportamento do método antes e depois da refatoração:

testCalcularMediaChamada2: Valida o cenário onde as notas de entrada são 7.0 e 9.0. A média esperada para este cenário é rigidamente 8.0.

Antes da correção: O sistema retornava 11.5 e o teste falhava.

Após a correção: O sistema passou a retornar 8.0 e o teste obteve sucesso.

 Como Rodar o Projeto Localmente
Pré-requisitos
Java JDK instalado (versão 17 ou superior recomendada).

VS Code com a extensão Extension Pack for Java ativada.

Execução
Como o projeto utiliza gerenciamento manual de dependências, os arquivos .jar necessários estão localizados na pasta lib/ e mapeados no ambiente.

Abra o projeto no VS Code.

Certifique-se de que as bibliotecas da pasta lib/ estão listadas em Referenced Libraries.

Abra o arquivo ControleAcademicoServiceTest.java.

Clique no botão Run acima do método de teste ou utilize o painel de Testing lateral para rodar a suíte.
