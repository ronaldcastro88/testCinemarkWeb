package cinemark.exceptions;

public class PortalCinemarkError extends AssertionError {

    public static final String INICIO_DE_SESION_FALLIDO = "El usuario no pudo iniciar sesión de forma exitosa";
    public static final String FORMULARIO_MAL_DILIGENCIADO = "El usuario no pudo diligenciar correctamente el formulario";
    public static final String COMPRA_NO_REALIZADA = "El usuario no pudo realizar la compra correctamente";
}
