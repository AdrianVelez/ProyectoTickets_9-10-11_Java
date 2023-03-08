package PatronSingleton;

import java.time.LocalDate;
import java.util.Date;

/**
 * Clase modelo del proyecto Iterador
 */
public class Ticket {
    private static int contador=0;
    private  int id = 1;
    private  double folio = 1020;
    private  LocalDate fecha;
    private  Usuarios usuario;

    /**
     * Constructor de Clase modelo
     * @param fecha Recibe la variable fecha y la asigna a la variable local
     * @param usuario Recibe un objeto de Usuario y la asigna a la instancia temporal de Usuario.
     */
    public Ticket(LocalDate fecha, Usuarios usuario) {
        this.fecha = fecha;
        this.usuario = usuario;
        ++folio;
        this.id = ++contador;
    }

    /**
     *
     * @return retorna objeto usuario.
     */
    public Usuarios getUsuario(){
        return this.usuario;
    }


}
