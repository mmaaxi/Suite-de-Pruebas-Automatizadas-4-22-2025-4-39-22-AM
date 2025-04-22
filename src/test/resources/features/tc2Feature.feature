Feature: Verificación de login

  Scenario: Autenticar usuario con credenciales válidas
    Given el usuario está en la página de login
    When ingresa credenciales válidas
    Then el usuario es autenticado y redirigido al dashboard