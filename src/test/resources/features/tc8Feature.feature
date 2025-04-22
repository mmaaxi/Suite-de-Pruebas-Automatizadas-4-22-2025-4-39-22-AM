Feature: Búsqueda en la base de datos

  Scenario: El usuario ingresa un término de búsqueda
    Given El usuario está en la página de inicio
    When El usuario ingresa un término de búsqueda válido
    Then El sistema devuelve resultados que coinciden con el término