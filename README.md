# POO-Electronic-Av01

Este projeto consiste na modelagem e implementação de um módulo de cadastro de clientes (Pessoas Físicas e Pessoas Jurídicas) para um e-commerce. O sistema utiliza os conceitos fundamentais de Programação Orientada a Objetos (POO).

# Módulo de Cadastro de Clientes - Appfull & Electronic

## 👤 Identificação do Estudante
*   **Nome:** Moisés L. Moraes
*   **Projeto:** Sistema de Cadastro com Validação e Testes Automatizados por Exceção.
*   **Empresa Simulada:** Appfull (Cliente: Electronic).

---

## 🛠️ Instruções para Executar o Projeto no VS Code

### Pré-requisitos
1.  Ter o **Java Development Kit (JDK)** instalado (versão 11 ou superior recomendada).
2.  Ter o **Visual Studio Code** instalado.
3.  Instalar a extensão oficial **Extension Pack for Java** no VS Code.

### Passo a Passo
### Passo a Passo
1.  Abra o VS Code e vá em **File > Open Folder...** para abrir a pasta do seu projeto.
2.  Certifique-se de que os códigos das classes (`Endereco`, `Cliente`, `PessoaFisica`, `PessoaJuridica` e `Main`) estejam salvos na mesma pasta ou estrutura de pacotes.
3.  Abra o arquivo `Main.java`.
4.  Clique no botão **Run** que aparece logo acima da linha `public static void main` ou pressione a tecla `F5`.
5.  Os testes de validação serão executados automaticamente e o resultado completo aparecerá na aba **Terminal** na parte inferior do seu VS Code.

---

## 📊 Evidências de Teste (Saída do Terminal)

Abaixo está registrada a saída exata gerada pelo console ao rodar a classe `Main`. O programa executa os cenários sequencialmente, capturando os erros isolados em blocos `try-catch` para que os cadastros válidos continuem sendo processados sem interromper o sistema.

```texto

-----------=====Cadastro de Clientes da Electronic=====----------

SUCESSO: A Boiadeira foi cadastrada.
[ERRO]: Falha ao cadastrar Thiaguinho => Erro de Validação: A data de nascimento não pode ser futura.
SUCESSO: Electronic Store foi cadastrada.
[ERRO]: Falha ao cadastrar Eletro Norte => Erro de Validação: A razão social é obrigatória.
[ERRO]: Falha ao cadastrar PH => Erro de Validação: O nome deve ter ao menos 3 caracteres.

----------=====RELATÓRIO DE CADASTROS VÁLIDOS=====----------

[Pessoa Física] Nome: Ana Castela | CPF: 12312312310 | Nasc: 2003-11-16 | Endereço: Av. Belém, Nº 30 - Belém/PA
[Pessoa Jurídica] Nome Fantasia: Electronic Store | Razão Social: Tech Eletronicos LTDA | CNPJ: 12111111222233 | Endereço: Av. Belém, Nº 30 - Belém/PA


----------==========     FIM DE PROGRAMA     ==========----------
```

### Detalhamento dos Cenários Registrados

*   **Cenário 1: Pessoa Física Válida (Ana Castela)**
    *   *Objetivo:* Validar o cadastro informando dados corretos, enviando o CPF formatado com pontuação (`123.123.123-10`) e data de nascimento passada.
    *   *Resultado:* O sistema limpou os caracteres especiais do CPF deixando-o com 11 dígitos numéricos brutos e incluiu o cliente com sucesso no relatório final.
---------------------------------------------------------------------
*   **Cenário 2: Pessoa Física Inválida (Thiago André Barbosa)**
    *   *Objetivo:* Testar a resistência do sistema ao tentar cadastrar uma data de nascimento no futuro (`2083, 03, 11`).
    *   *Resultado:* O método `setDataNascimento` lançou uma exceção que foi capturada pelo `catch`. O erro foi impresso na tela e o programa continuou rodando.
--------------------------------------------------------------------------------------
*   *   **Cenário 3: Pessoa Jurídica Válida (Electronic Store)**
    *   *Objetivo:* Validar o cadastro de empresa informando o CNPJ formatado (`12.111.111/2222-33`) e Razão Social válida.
    *   *Resultado:* O sistema efetuou a higienização do CNPJ para 14 dígitos brutos e armazenou o cliente com sucesso.
----------------------------------------------------------------------------
*   **Cenário 4: Pessoa Jurídica Inválida (Eletro Norte)**
    *   *Objetivo:* Testar a obrigatoriedade do campo Razão Social enviando apenas espaços em branco (`"   "`).
    *   *Resultado:* O método `setRazaoSocial` barrou a operação gerando uma exceção de validação, impedindo o armazenamento incorreto e mantendo a integridade do e-commerce.

---

## ⏳ Histórico de Commits (Evolução do Trabalho)

Abaixo está o histórico cronológico de desenvolvimento exigido pelos padrões corporativos da Appfull, mostrando o avanço do projeto passo a passo:

*   `commit c2db4fd`: **feat: inicializar classes de base Main**
    *   *Criação do Main, a classe base-principal que é executada ao rodar o projeto.*
    *   *Cria a Classe principal do projeto: Main.java*

*   `commit f41e689`: **feat:Implementa a Super Classe Abstrata Cliente**

*   `commit c71ab60`: **feat: implementar subclasses PessoaFisica**
 
*   `commit c8b02d5`: **feat: implementa a classe Endereco**

*   `commit 5e75780`: **feat:implementar subclasses PessoaJuridica**


*   `commit f2d4e03`: **docs: estruturar README com identificação do Estudante e evidências baseadas na primeira versão**
    *   *Criação e fechamento da documentação técnica.*
