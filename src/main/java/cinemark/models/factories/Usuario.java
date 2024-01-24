package cinemark.models.factories;

import cinemark.tasks.DiligenciarDatos;
import cinemark.tasks.IniciaSesion;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Usuario {
    private String usuario;
    private String clave;
    private String nombre;
    private String apellido;
    private String direccion;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Performable conDatosCorrectos() {
        setUsuario("ronald@yopmail.com");
        setClave("Test2023+");
        return instrumented(IniciaSesion.class, this.usuario, this.clave);
    }

    public Performable conDatosNuevos() {
        setNombre("nombre Test");
        setApellido("apellido Test");
        setDireccion("direccion Test");
        setClave("Test2023+");
        return instrumented(DiligenciarDatos.class, this.nombre, this.apellido, this.direccion, this.clave);
    }
}
