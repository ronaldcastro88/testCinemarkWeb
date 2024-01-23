package banco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {

    public static final Target NOMBRE_USUARIO_DASHBOARD = Target.the("Nombre del usuario en el dashboard").located(By.xpath("//span[@title='Ronald Castro']"));
    public static final Target SELECCION_PRIMERA_OPERACION_MATEMATICA = Target.the("Selección de primera operación matemática").located(By.xpath("//div[@class=' flex flex-col items-center bg-white rounded-md shadow-md p-5 space-y-4 my-5 w-2/5 ']//child::p[2]"));

    public static final Target SELECCION_RESPUESTA_OPERACION_MATEMATICA = Target.the("Selección de opción de respuesta de la operación matemática").located(By.xpath("//select[@name='select']"));
    //public static final Target RESULTADO_RESPUESTA_OPERACION_MATEMATICA = Target.the("Resultado de opción de respuesta de la operación matemática").located(By.xpath("//option[@value='%s']"));
    public static Target resultadoRespuestaOperacionMatematica(String valor) {
        String xpath = String.format("//option[@value='%s']", valor);
        return Target.the("Resultado de opción de respuesta de la operación matemática").located(By.xpath(xpath));
    }
    public static Target resultadoRespuestaCheckRadioButton(String valor) {
        String xpath = String.format("//input[@value='%s']", valor);
        return Target.the("Resultado de opción de respuesta con radio button").located(By.xpath(xpath));
    }
    public static final Target SELECCION_SEGUNDA_OPERACION_MATEMATICA = Target.the("Selección de segunda operación matemática").located(By.xpath("//div[@class='bg-white rounded-md shadow-md p-5  flex flex-col items-center my-5 w-2/5 ']//child::p[2]"));
    public static final Target SELECCION_TERCERA_OPERACION = Target.the("Selección de tercera operación").located(By.xpath("//div[@class='bg-white rounded-md shadow-md p-5 flex flex-col items-center my-5 w-2/5 ']//child::p[1]"));

    public static final Target SELECCION_LISTADO_CHECKBOX = Target.the("Selección de los checkbox para comparar").located(By.xpath("//input[@name='checkbox']"));

    public static final Target SELECCION_LABEL_TEXT_AREA = Target.the("Selección de label del text_area text area").located(By.xpath("//div[@class='flex flex-col p-4 w-2/5 bg-white rounded-md shadow-md my-5 justify-around']//child::p[1]"));
    public static final Target SELECCION_TEXT_AREA = Target.the("Selección de text area para ingresar valores").located(By.xpath("//textarea[@name='text']"));
    public static final Target BOTON_CREAR_CUENTA = Target.the("Botón para acceder al formulario de creación de cuenta").located(By.xpath("//button[@title='CREAR CUENTA']"));
    public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar el nombre del usuario a registrarse").located(By.id("register_FirstName"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar el apellido del usuario a registrarse").located(By.id("register_LastName"));
    public static final Target SELECTOR_GENERO = Target.the("Campo que lista los géneros M/F").located(By.id("register_Gender"));

    public static final Target BOTON_CREAR_CUENTA_SIN_MEMBRESIA = Target.the("Botón para acceder al formulario de creación de cuenta desde la modal").located(By.xpath("//button[@class='ant-btn' and span='CREAR CUENTA SIN MEMBRESÍA']"));

    public static final Target TEXTO_MENSAJE_FINAL = Target.the("Mensaje exitoso al final").located(By.xpath("//h1[@class='text-center text-3xl p-3 m-3']"));

    private DashboardPage() {
        throw new IllegalStateException("Clase de interfaz de usuario");
    }
}
