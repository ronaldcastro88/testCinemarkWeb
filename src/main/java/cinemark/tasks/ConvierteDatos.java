package banco.tasks;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvierteDatos {

    public static double evaluarExpresion(String textoOperacionMatematica) throws ScriptException {
        String expresionModificada = eliminarCaracteres(textoOperacionMatematica, "=", "?");
        System.out.println("Expresión original: " + textoOperacionMatematica);
        System.out.println("Expresión modificada: " + expresionModificada);

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        // Evaluar la expresión y devolver el resultado como un Double
        return ((Number) engine.eval(expresionModificada)).doubleValue();
    }


    public static String eliminarCaracteres(String input, String... caracteresAEliminar) {
        // Iterar sobre los caracteres a eliminar y reemplazarlos con una cadena vacía
        for (String caracter : caracteresAEliminar) {
            input = input.replace(caracter, "");
        }
        return input;
    }

    public static String extraerNumeros(String input) {
        // Utilizar una expresión regular para encontrar solo los caracteres numéricos
        return input.replaceAll("[^0-9]", "");
    }

    public static String extraerLetraEspecial(String input) {
        // Utilizar una expresión regular para encontrar solo los caracteres numéricos
        Pattern pattern = Pattern.compile("\"([^\"]*)\"");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return ""; // Retornar una cadena vacía si no se encuentra ningún texto entre comillas
        }
    }

    public static int convertirAEntero(String input) {
        // Utilizar Integer.parseInt() para convertir la cadena a un valor entero
        return Integer.parseInt(input);
    }
}
