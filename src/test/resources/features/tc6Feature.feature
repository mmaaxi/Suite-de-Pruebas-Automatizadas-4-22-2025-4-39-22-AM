Feature: Editar un registro existente

  Scenario: Modificación de datos en el formulario de edición
    Given El usuario está en la página de edición de un registro existente
    When Modifica los datos del formulario de edición
    Then Los cambios se actualizan correctamente en la base de datos