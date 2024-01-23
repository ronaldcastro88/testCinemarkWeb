package banco.tasks;

import banco.models.factories.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.thucydides.core.annotations.Step;

import static banco.userinterfaces.HomePage.CAMPO_CORREO;
import static banco.userinterfaces.HomePage.CAMPO_CONTRASENIA;
import static banco.userinterfaces.HomePage.BOTON_CERRAR_MODAL;
import static banco.userinterfaces.HomePage.BOTON_INGRESAR;
import static banco.userinterfaces.HomePage.BOTON_INICIAR_SESION;


public class IniciaSesion implements Task {

    private final String correo;
    private final String contrasena;

    public IniciaSesion(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public static Usuario enCinemark() {
        return new Usuario();
    }

    @Override
    @Step("{0} inicia sesi\u00F3n con usuario #usuario y contraseña #clave")
    public <T extends Actor> void performAs(T actor) {
        //actor.remember(CORREO.getValor(),usuario);
        actor.attemptsTo(
                Click.on(BOTON_CERRAR_MODAL),
                Click.on(BOTON_INICIAR_SESION),
                Type.theValue(correo).into(CAMPO_CORREO),
                Type.theValue(contrasena).into(CAMPO_CONTRASENIA),
                Click.on(BOTON_INGRESAR));
    }
}