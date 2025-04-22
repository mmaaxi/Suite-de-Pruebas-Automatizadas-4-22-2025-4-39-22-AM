Feature: Validación de campos obligatorios

  Scenario: Intentar enviar formulario sin completar campos obligatorios
    Given El usuario está en la página del formulario
    When El usuario intenta enviar el formulario sin completar campos obligatorios
    Then El sistema muestra mensajes de error indicando los campos vacíos