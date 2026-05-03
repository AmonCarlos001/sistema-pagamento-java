# Sistema de Pagamentos em Java 🏦

Este projeto implementa uma simulação de processamento de pagamentos, explorando conceitos fundamentais de **Orientação a Objetos (POO)**. O foco principal foi a aplicação de **Polimorfismo** e **Herança** para criar um código escalável e de fácil manutenção.

## 🚀 Tecnologias Utilizadas
* **Java 17** (ou superior)
* **Lógica de Programação Orientada a Objetos**
* **Organização em Pacotes (Packages)** para melhor arquitetura de software

## 🛠️ Conceitos Aplicados
O sistema foi estruturado para demonstrar maturidade técnica no desenvolvimento Backend:

* **Polimorfismo:** A classe mãe `Pagamento` define o comportamento base, enquanto as classes filhas especializam as regras de negócio.
* **Sobrescrita de Métodos (@Override):** Implementação de cálculos de taxas específicos para cada modalidade de pagamento.
* **Encapsulamento:** Proteção da lógica de negócio e organização das entidades no pacote `model`.

## 📊 Regras de Negócio
| Método de Pagamento | Taxa Aplicada | Comportamento |
| :--- | :--- | :--- |
| **Pix** | 0% | Confirmação instantânea sem acréscimos. |
| **Cartão de Crédito** | 3% | Aplicação de taxa sobre o valor total da transação. |
| **Boleto Bancário** | 1% | Geração de documento com taxa percentual fixa. |

## 📂 Estrutura do Projeto
O código foi organizado seguindo padrões de mercado para facilitar a leitura e manutenção:
```text
src/
├── Main.java              # Classe principal de execução
└── model/                 # Pacote contendo as entidades do sistema
    ├── Pagamento.java     # Superclasse base
    ├── Pix.java           # Especialização para pagamentos via Pix
    ├── CartaoCredito.java # Especialização para crédito
    └── BoletoBancario.java # Especialização para boletos

💻 Como Executar

1. Clone o repositório:
| git clone [https://github.com/AmonCarlos001/sistema-pagamento-java.git](https://github.com/AmonCarlos001/sistema-pagamento-java.git) |
2. Importe o projeto em sua IDE (IntelliJ IDEA recomendada).
3. Execute a classe Main.java.

Desenvolvido por Amon Carlos — Focado em transição de carreira para Backend Developer com Java e Spring Boot.
