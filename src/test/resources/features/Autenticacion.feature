# language: es
Característica: Autenticacion en el sitio de Cinemark

  @AutenticacionExitosa
  Escenario: Autenticación exitosa
    Dado Ronald no se encuentra autenticado
    Cuando el usuario ingresa sus credenciales
    Entonces debe ver el nombre del usuario Ronald Castro en el dashboard