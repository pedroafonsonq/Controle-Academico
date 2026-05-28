# Controle Academico - Analise de Testes com JUnit 5

Este projeto faz parte de uma atividade pratica de Engenharia de Software / Verificacao e Validacao de Software, ministrada pelo Prof. Douglas. O objetivo principal foi realizar o diagnostico e a manutencao corretiva de um bug de logica matematica em um sistema legado de controle academico utilizando o framework JUnit 5.

---

## O Problema Diagnosticado

O sistema legado possuia um defeito critico no metodo calcularMedia da classe ControleAcademicoService. Devido a falta de parenteses para isolar a operacao de soma, o Java executava primeiro a divisao (por regras de precedencia matematica), gerando medias completamente erradas.

* Codigo com Defeito:
```java
public double calcularMedia(double nota1, double nota2) {
    return nota1 + nota2 / 2;
}
A Solucao Aplicada
A correcao aplicada garantiu a precedencia da soma das notas antes de realizar a divisao por dois, utilizando tipos de ponto flutuante adequados para evitar truncamento de valores.

Codigo Corrigido:

Java
public double calcularMedia(double nota1, double nota2) {
    return (nota1 + nota2) / 2.0;
}
Estrutura dos Testes Automatizados (JUnit 5)
Foi desenvolvida uma suite de testes com a assercao assertEquals para validar o comportamento do metodo antes e depois da refatoracao:

testCalcularMediaChamada2: Valida o cenario onde as notas de entrada sao 7.0 e 9.0. A media esperada para este cenario e rigidamente 8.0.

Antes da correcao: O sistema retornava 11.5 e o teste falhava.

Apos a correcao: O sistema passou a retornar 8.0 e o teste obteve sucesso.

Como Rodar o Projeto Localmente
Pre-requisitos
Java JDK instalado (versao 17 ou superior recomendada).

VS Code com a extensao Extension Pack for Java ativada.

Execucao
Como o projeto utiliza gerenciamento manual de dependencias, os arquivos .jar necessarios estao localizados na pasta lib/ e mapeados no ambiente.

Abra o projeto no VS Code.

Certifique-se de que as bibliotecas da pasta lib/ estao listadas em Referenced Libraries.

Abra o arquivo ControleAcademicoServiceTest.java.

Clique no botao Run acima do metodo de teste ou utilize o painel de Testing lateral para rodar a suite.
