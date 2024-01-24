package cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {
    public static final Target NOMBRE_USUARIO_DASHBOARD = Target.the("Nombre del usuario en el dashboard").located(By.xpath("//span[@title='Ronald Castro']"));
    public static final Target BOTON_CREAR_CUENTA = Target.the("Botón para acceder al formulario de creación de cuenta").located(By.xpath("//button[@title='CREAR CUENTA']"));
    public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar el nombre del usuario a registrarse").located(By.id("register_FirstName"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar el apellido del usuario a registrarse").located(By.id("register_LastName"));
    public static final Target SELECTOR_GENERO = Target.the("Campo que lista los géneros M/F").located(By.id("register_Gender"));
    public static final Target SELECTOR_MASCULINO = Target.the("Valor para seleccionar Masculino en el select").located(By.xpath("//li[@role='option' and contains(text(),'Masculino')]"));
    public static final Target CAMPO_NUMERO_DOCUMENTO = Target.the("Campo para ingresar el número de documento").located(By.id("register_NationalID"));
    public static final Target BOTON_CREAR_CUENTA_SIN_MEMBRESIA = Target.the("Botón para acceder al formulario de creación de cuenta desde la modal").located(By.xpath("//button[@class='ant-btn' and span='CREAR CUENTA SIN MEMBRESÍA']"));
    public static final Target CAMPO_CELULAR = Target.the("Campo para ingresar el celular").located(By.id("register_MobilePhone"));
    public static final Target CAMPO_DIRECCION = Target.the("Campo para ingresar la dirección").located(By.id("register_Address1"));
    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("Campo para ingresar el correo").located(By.id("register_Email"));
    public static final Target CONFIRMAR_CORREO_ELECTRONICO = Target.the("Campo para confirmar el correo").located(By.id("register_confirmEmail"));
    public static final Target CAMPO_CONTRASENA = Target.the("Campo para ingresar la contraseña nueva").located(By.id("register_Password"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("Campo para confirmar la contraseña").located(By.id("register_confirmPassword"));
    public static final Target SELECTOR_CIUDAD = Target.the("Campo que lista las ciudades (Bogota)").located(By.id("register_PreferredComplexCity"));
    public static final Target SELECTOR_BOGOTA = Target.the("Valor para seleccionar Bogota en el select").located(By.xpath("//li[@role='option' and contains(text(),'Bogota')]"));
    public static final Target SELECTOR_TEATRO = Target.the("Campo que lista los teatros de Bogota").located(By.id("register_PreferredComplex"));
    public static final Target SELECTOR_MULTIPLAZA = Target.the("Valor para seleccionar Multiplaza en el select").located(By.xpath("//li[@role='option' and contains(text(),'Lab v5 Multiplaza')]"));
    public static final Target CHECK_TERMINOS = Target.the("Check para aceptar los términos y condiciones").located(By.id("register_termines"));
    public static final Target BOTON_CREAR_CUENTA_FORM = Target.the("Botón para crear la cuenta desde el formulario").located(By.xpath("//button[@title='Crear cuenta']"));
    public static final Target BOTON_CONTINUAR = Target.the("Botón para continuar al portal privado").located(By.xpath("//button[@title='continuar']"));
    public static final Target DESCRIPCION_PELICULA = Target.the("Descripción de la pelicula").located(By.xpath("//p[@class='jsx-3159650756 description-text text--uppercase']"));
    public static final Target SELECCION_METODO_PAGO = Target.the("Título para seleccionar el método de pago").located(By.xpath("//h3[@class='jsx-3948091703 title-description text--uppercase ' and contains(text(),'SELECCIONE UN MÉTODO DE PAGO')]"));
    public static final Target TEXTO_MENSAJE_FINAL = Target.the("Mensaje exitoso al final").located(By.xpath("//h3[@class='jsx-3326677891 text--uppercase title']"));

    private DashboardPage() {
        throw new IllegalStateException("Clase de interfaz de usuario");
    }
}
