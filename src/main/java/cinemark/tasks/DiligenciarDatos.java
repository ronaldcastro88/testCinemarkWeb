package banco.tasks;

import banco.models.factories.Usuario;
import banco.questions.CapturarTextoOperacionMatematica;
import banco.questions.CapturarTextoRepetitivo;
import banco.questions.CapturarTextoSegundaOperacionMatematica;
import banco.questions.CapturarTextoTerceraOperacionMatematica;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import net.thucydides.core.annotations.Step;

import javax.script.ScriptException;

import static banco.tasks.ConvierteDatos.evaluarExpresion;
import static banco.tasks.ConvierteDatos.convertirAEntero;
import static banco.tasks.ConvierteDatos.extraerNumeros;
import static banco.tasks.ConvierteDatos.extraerLetraEspecial;
import static banco.userinterfaces.DashboardPage.*;


public class DiligenciarDatos implements Task {

    private final String nombre;
    private final String apellido;


    public DiligenciarDatos(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static Usuario delFormulario() {
        return new Usuario();
        //return new DiligenciarDatos();
        return Tasks.instrumented(DiligenciarDatos.class);
    }

    @Override
    @Step("{1} Diligencia los datos del formulario ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_CREAR_CUENTA),
                //Type.theValue(cadenaRepetida.toString()).into(SELECCION_TEXT_AREA),
                Click.on(BOTON_CREAR_CUENTA_SIN_MEMBRESIA),
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO));
        /*String textoOperacionMatematica;
        long entero;
        for (int i=0;i<10;i++){
            int f;
            for (f=0;f<2;f++) {
                double resultado;
                try {
                    if (f == 0) {
                        textoOperacionMatematica = actor.asksFor(CapturarTextoOperacionMatematica.deLaPagina());
                        System.out.println("Texto de la operación matemática: " + textoOperacionMatematica);
                        resultado = evaluarExpresion(textoOperacionMatematica);
                        entero = Math.round(resultado);
                        System.out.println("Resultado 1: " + entero);
                        actor.attemptsTo(
                                Click.on(SELECCION_RESPUESTA_OPERACION_MATEMATICA),
                                Click.on(resultadoRespuestaOperacionMatematica(String.valueOf(entero))));
                    } else if (f == 1) {
                        textoOperacionMatematica = actor.asksFor(CapturarTextoSegundaOperacionMatematica.deLaPagina());
                        System.out.println("Texto de la operación matemática 2: " + textoOperacionMatematica);
                        resultado = evaluarExpresion(textoOperacionMatematica);
                        entero = Math.round(resultado);
                        System.out.println("Resultado 2: " + entero);
                        actor.attemptsTo(
                                Click.on(resultadoRespuestaCheckRadioButton(String.valueOf(entero))));
                    }
                }
                catch (ScriptException e) {
                    System.out.println("Error al evaluar la expresión: " + e.getMessage());
                }
            }
            String numerosExtraidos = actor.asksFor(CapturarTextoTerceraOperacionMatematica.deLaPagina());
            System.out.println("Expresión original: " + numerosExtraidos);
            numerosExtraidos = extraerNumeros(numerosExtraidos);
            System.out.println("Numeros extraidos: " + numerosExtraidos);
            entero = convertirAEntero(numerosExtraidos);
            System.out.println("Valor entero: " + entero);
            actor.attemptsTo(
                 CapturarValoresHtml.deLaLista(SELECCION_LISTADO_CHECKBOX, entero));
            numerosExtraidos = actor.asksFor(CapturarTextoRepetitivo.deLaPagina());
            String extraerCaracterRepetitivo = extraerLetraEspecial(numerosExtraidos);
            System.out.println("EL CARACTER REPETITIVO ES: " + extraerCaracterRepetitivo);
            numerosExtraidos = extraerNumeros(numerosExtraidos);
            System.out.println("Numeros extraidos DEL TEXTO REPETITIVO ES : " + numerosExtraidos);
            entero = convertirAEntero(numerosExtraidos);
            System.out.println("EL VALOR ENTERO CONVERTIDO ES: " + entero);
                    actor.attemptsTo(Click.on(SELECCION_TEXT_AREA));
            StringBuilder cadenaRepetida = new StringBuilder();
            for (int g=0;g<entero;g++){
                cadenaRepetida.append(extraerCaracterRepetitivo);
            }*/

                }
}

