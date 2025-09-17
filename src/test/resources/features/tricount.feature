
Feature: Gestión de gastos compartidos en Tricount

  Como usuario de Tricount
  Quiero poder registrar, visualizar y liquidar gastos compartidos
  Para organizar fácilmente los gastos de grupo

  Background:
    Given el usuario abre la aplicación Tricount en un dispositivo Android con la app instalada


  Scenario Outline: Inicio de sesión con Google
    When el usuario inicia sesión con la cuenta de Google "<google_account>"
    Then el usuario ve el mensaje "<resultado>"

    Examples:
      | google_account           | resultado                  |
      | cuenta_invalida@gmail.com| Cuenta de Google inválida  |

  Scenario: Creación de grupo de gastos
    Given el usuario ha iniciado sesión
    When el usuario crea un grupo llamado "Viaje Cartagena" con participantes "Ana y Luis"


  Scenario: Registro de gasto compartido
    Given el usuario está en el grupo
    When el usuario agrega un gasto con descripción Hotel pagado por Ana
    Then el gasto Hotel aparece en la lista de gastos del grupo


  Scenario: Visualización y liquidación de saldos
    Given el usuario consulta el resumen de saldos
    When el usuario ve que Luis debe a Ana
    And Luis registra un pago a Ana
    Then la deuda entre Luis y Ana se liquida
