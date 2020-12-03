package stepdefinition.ValidarArchivos;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;


/**
 * @author Juan Castillo
 * @since 30/11/2020
 */
public class StepsValidarArchivos {

    ValidarArchivos validarArchivos = new ValidarArchivos();

    @Dado("^que el archivo esta en la direccion \"([^\"]*)\"$")
    public void queElArchivoEstaEnLaDireccion(String direccion) throws Throwable {
        validarArchivos.direccionArchivo = direccion;
    }

    @Y("^el nombre del archivo es \"([^\"]*)\"$")
    public void elNombreDelArchivoEs(String nombre) throws Throwable {
        validarArchivos.nomeArchivo = nombre;
    }

    @Y("^el archivo es del tipo \"([^\"]*)\"$")
    public void elArchivoEsDelTipo(String tipo) throws Throwable {
        validarArchivos.tipoArchivo = tipo;
    }

    @Entonces("^realizo la carga del archivo$")
    public void realizoLaCargaDelArchivo() {

        validarArchivos.leerArchivo(validarArchivos.direccionArchivo,validarArchivos.nomeArchivo,validarArchivos.tipoArchivo,validarArchivos.nomeHoja);

    }

    @Y("^el nombre de la hoja es \"([^\"]*)\"$")
    public void elNombreDeLaHojaEs(String hoja) throws Throwable {

        validarArchivos.nomeHoja = hoja;

    }
}
