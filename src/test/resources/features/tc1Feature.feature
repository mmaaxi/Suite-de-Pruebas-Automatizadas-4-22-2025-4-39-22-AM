Feature: Validación de inicio de la aplicación

  Scenario: El usuario inicia la aplicación correctamente
    Given que la aplicación está instalada
    When el usuario inicia la aplicación
    Then la aplicación se inicia correctamente