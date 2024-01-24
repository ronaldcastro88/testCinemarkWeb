package cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrivadoPage {
    public static final Target PELICULA = Target.the("Pelicula que se selecciona en la página inicial").located(By.xpath("//h3[@class='jsx-1273177034 info-movie__title-movie' and contains(text(),'Aladdín De Disney')]"));
    public static final Target SELECTOR_CIUDAD = Target.the("Campo que lista las ciudades en el portal privado").located(By.xpath("//div[@class='select-location ant-select ant-select-enabled']"));
    public static final Target SELECTOR_ITEM_BOGOTA = Target.the("Valor para seleccionar Bogota en el select privado").located(By.xpath("//h2[@class='jsx-2649583977 item-select' and contains(text(),'Bogota')]"));
    public static final Target SELECTOR_HORARIO = Target.the("Campo para seleccionar el horario de la pelicula").located(By.xpath("//div[@class='jsx-1092747776 sessions__button--runtime ']"));
    public static final Target BOTON_CONFIRMAR_SILLAS = Target.the("Botón para confirmar las sillas elegidas").located(By.xpath("//button[@title='CONFIRMAR']"));
    public static final Target MASCARA_CERRAR_MODAL = Target.the("Mascara para ser seleccionada y cerrar la modal en el checkout").located(By.xpath("//button[@class='ant-modal-close']"));
    public static final Target SELECTOR_CANTIDAD_SILLAS = Target.the("Select con la cantidad de sillas").located(By.xpath("//div[(@class='select-seat-format ant-select ant-select-enabled')]"));
    public static final Target SELECTOR_CANTIDAD = Target.the("Select con la cantidad de sillas").located(By.xpath("//li[@role='option' and contains(text(),'1')]"));
    public static final Target SELECTOR_SILLA = Target.the("Select con la silla").located(By.xpath("//*[contains(@class, 'seat-item--available')]"));
    public static final Target BOTON_CONFIRMAR_SLLA = Target.the("Botón para confirmar la silla").located(By.xpath("//button[@title='confirmar']"));
    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Botón para agregar cómida al carrito de compra").located(By.xpath("//button[@class='jsx-2761899694 candy-store__btn-control candy-store__btn-control--left-space  candy-store__btn-control__enabled']"));
    public static final Target CHECK_TERMINOS_CARRITO = Target.the("Check para aceptar los términos y condiciones en el carrito").located(By.id("payment_agreement"));
    public static final Target CERRAR_MODAL_CINE_CLUB = Target.the("X para cerrar la modal de cine club").located(By.xpath("//button[@class='sc-gWHAAX iaVavt']"));
    public static final Target SELECTOR_TARJETA = Target.the("Select con los datos de las tarjetas").located(By.xpath("//div[@class='ant-collapse-item panel-payment ']"));
    public static final Target CAMPO_NUMERO_TARJETA = Target.the("Campo para ingresar el # de la tarjeta").located(By.id("payment_creditCard.number"));
    public static final Target CAMPO_NOMBRE_TARJETA = Target.the("Campo para ingresar el nombre del propietario de la tarjeta").located(By.id("payment_creditCard.name"));
    public static final Target CAMPO_FECHA_VENCIMIENTO = Target.the("Campo para ingresar la fecha de vencimiento de la tarjeta").located(By.id("payment_creditCard.expirationDate"));
    public static final Target CAMPO_CVV = Target.the("Campo para ingresar los digitos de seguridad").located(By.id("payment_creditCard.securityCode"));
    public static final Target SELECTOR_CUOTAS = Target.the("Select para elegir la cantidad de cuotas de la compra").located(By.id("payment_creditCard.installments"));
    public static final Target BOTON_ACEPTAR_PAGO = Target.the("Botón para aceptar el pago").located(By.xpath("//button[@title='ACEPTAR']"));
    public static final Target QR_EXITOSO = Target.the("Mensaje de compra exitosa").located(By.xpath("//h4[@class='jsx-335671319 text--uppercase']"));
    public static final Target BOTON_FINALIZAR = Target.the("Botón para finalizar el proceso").located(By.xpath("//button[@title='FINALIZAR']"));

    private PrivadoPage() {
        throw new IllegalStateException("Clase de interfaz de usuario");
    }
}
