Feature: Creación de nuevo registro
  Como usuario de la aplicación
  Quiero poder crear un nuevo registro
  Para que se muestre en la vista principal

  Scenario: Completar formulario de creación de registro y verificar su creación
    Given el usuario está en la página de creación de registros
    When el usuario completa el formulario de creación de registro
    Then el nuevo registro es creado y aparece listado en la vista principal