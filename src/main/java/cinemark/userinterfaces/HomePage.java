package banco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BOTON_CERRAR_MODAL = Target.the("Botón para cerrar la modal inicial").located(By.xpath("//button[@class='ant-modal-close']"));
    public static final Target BOTON_INICIAR_SESION = Target.the("Botón para desplegar ventana de iniciar sesión").located(By.xpath("//button[@title='INICIAR SESIÓN']"));

    public static final Target CAMPO_CORREO = Target.the("Campo para ingresar el correo electronico").located(By.id("MemberEmail"));
    public static final Target CAMPO_CONTRASENIA = Target.the("Campo para ingresar el password").located(By.id("MemberPassword"));
    public static final Target BOTON_INGRESAR = Target.the("Botón para autenticarse en el portal").located(By.xpath("//button[@title='Ingresar']"));
    private HomePage() {
        throw new IllegalStateException("Clase de interfaz de usuario");
    }
}