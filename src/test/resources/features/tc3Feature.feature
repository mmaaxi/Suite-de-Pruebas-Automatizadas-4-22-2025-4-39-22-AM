Feature: Manejo de error de login

  Scenario: El sistema debería mostrar un mensaje de error de autenticación cuando se ingresan credenciales inválidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa un nombre de usuario "usuarioInvalido" y una contraseña "contraseñaInvalida"
    And el usuario hace clic en el botón de inicio de sesión
    Then el sistema muestra un mensaje de error de autenticación