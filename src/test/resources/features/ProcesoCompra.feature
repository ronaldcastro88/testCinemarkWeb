# language: es
Característica: Diligenciamiento del formulario de creación de cuenta

  @CreacionCuenta
  Escenario: Diligenciamiento exitosamente del formulario
    Dado el usuario quiere crear una cuenta en el portal de Cinemark
    Cuando diligencia el formulario de registro
    Entonces debe mostrar el mensaje REGISTRO EXITOSO