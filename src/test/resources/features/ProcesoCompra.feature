# language: es
Característica: Compra exitosa de un boleto para ver una pelicula

  @ProcesoCompra
  Escenario: Compra exitosa de un ticket en el portal de Cinemark
    Dado el usuario se encuentra autenticado en el portal de Cinemark
    Cuando realiza todo el proceso el carrito de compras
    Entonces se muestra el QR del tiquete de compra exitosa con el código de confirmación