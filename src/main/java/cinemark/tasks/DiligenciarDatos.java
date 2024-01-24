package cinemark.tasks;

import cinemark.models.factories.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static cinemark.userinterfaces.DashboardPage.SELECTOR_CIUDAD;
import static cinemark.userinterfaces.DashboardPage.BOTON_CREAR_CUENTA;
import static cinemark.userinterfaces.DashboardPage.BOTON_CREAR_CUENTA_SIN_MEMBRESIA;
import static cinemark.userinterfaces.DashboardPage.CAMPO_NOMBRE;
import static cinemark.userinterfaces.DashboardPage.CAMPO_APELLIDO;
import static cinemark.userinterfaces.DashboardPage.SELECTOR_GENERO;
import static cinemark.userinterfaces.DashboardPage.SELECTOR_MASCULINO;
import static cinemark.userinterfaces.DashboardPage.CAMPO_NUMERO_DOCUMENTO;
import static cinemark.userinterfaces.DashboardPage.CAMPO_CELULAR;
import static cinemark.userinterfaces.DashboardPage.CAMPO_DIRECCION;
import static cinemark.userinterfaces.DashboardPage.CAMPO_CORREO_ELECTRONICO;
import static cinemark.userinterfaces.DashboardPage.CONFIRMAR_CORREO_ELECTRONICO;
import static cinemark.userinterfaces.DashboardPage.CAMPO_CONTRASENA;
import static cinemark.userinterfaces.DashboardPage.CONFIRMAR_CONTRASENA;
import static cinemark.userinterfaces.DashboardPage.SELECTOR_BOGOTA;
import static cinemark.userinterfaces.DashboardPage.SELECTOR_TEATRO;
import static cinemark.userinterfaces.DashboardPage.SELECTOR_MULTIPLAZA;
import static cinemark.userinterfaces.DashboardPage.CHECK_TERMINOS;
import static cinemark.userinterfaces.DashboardPage.BOTON_CREAR_CUENTA_FORM;

import static cinemark.userinterfaces.HomePage.BOTON_CERRAR_MODAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class DiligenciarDatos implements Task {
    private final String nombre;
    private final String apellido;
    private final String direccion;
    private final String pass;


    public DiligenciarDatos(String nombre, String apellido, String direccion, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.pass = pass;
    }

    public static Usuario delFormulario() {
        return new Usuario();
    }

    @Override
    @Step("{1} Diligencia los datos del formulario ")
    public <T extends Actor> void performAs(T actor) {
        String correo;
        actor.attemptsTo(
                Click.on(BOTON_CERRAR_MODAL),
                Click.on(BOTON_CREAR_CUENTA),
                Click.on(BOTON_CREAR_CUENTA_SIN_MEMBRESIA),
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Click.on(SELECTOR_GENERO),
                Click.on(SELECTOR_MASCULINO),
                ConvierteDatos.aleatorio());
        String numeroAleatorio = actor.recall("numeroAleatorio");
        System.out.println("Número aleatorio de 10 caracteres: " + numeroAleatorio);
        correo = numeroAleatorio + "@yopmail.com";
        actor.attemptsTo(Enter.theValue(numeroAleatorio).into(CAMPO_NUMERO_DOCUMENTO),
                Enter.theValue(numeroAleatorio).into(CAMPO_CELULAR),
                Enter.theValue(direccion).into(CAMPO_DIRECCION),
                Enter.theValue(correo).into(CAMPO_CORREO_ELECTRONICO),
                Enter.theValue(correo).into(CONFIRMAR_CORREO_ELECTRONICO),
                Enter.theValue(pass).into(CAMPO_CONTRASENA),
                Enter.theValue(pass).into(CONFIRMAR_CONTRASENA),
                Click.on(SELECTOR_CIUDAD),
                Click.on(SELECTOR_BOGOTA),
                Click.on(SELECTOR_TEATRO),
                Click.on(SELECTOR_MULTIPLAZA),
                Click.on(CHECK_TERMINOS),
                WaitUntil.the(BOTON_CREAR_CUENTA_FORM, isPresent()).forNoMoreThan(5).seconds(),
                Click.on(BOTON_CREAR_CUENTA_FORM));
    }
}
