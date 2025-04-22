Feature: Navegación del menú

  Scenario: Seleccionar opción del menú 'Configuración'
    Given el usuario está en la página principal
    When el usuario selecciona la opción 'Configuración' del menú
    Then el usuario es dirigido a la página de configuración