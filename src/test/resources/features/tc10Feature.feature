Feature: Test Case 10 - Prueba de rendimiento

  Scenario: Ejecutar 1000 solicitudes simultáneas
    Given el sistema está preparado para la prueba de carga
    When ejecuto 1000 solicitudes simultáneas
    Then el sistema responde dentro de los tiempos establecidos sin caídas