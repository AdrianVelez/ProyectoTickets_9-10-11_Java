package PatronSingleton;

import java.util.ArrayList;

/**
 * La clase Tickets: Implementa a la interface TicketsIterador, de esta manera podra sobre escribir sus metodos
 * con un desarrollo de logica para el proyecto.
 */
public class Tickets implements TicketsIterador{
    //Lista donde se almacenaran los elementos a iterar.

   ArrayList<Ticket> ticketList = new ArrayList<>();
    int posicion = 0;
    int voletosDisp=4;


    /** PatronSingleton
     * Se crea instancia de la misma clase, para poder retornarla despues,
     * static para que se pueda utilizar en el metodo getInstance();
     */
    static  Tickets tickets;
    //Constructor privado, para que no pueda inicializar ningun objeto de esta manera.
    private Tickets(){}


    /**
     *  getInstance(): hace un "wripper", envoltorio del constructor que esta privado,
     *  de esta manera solo podemos instanciar de nuestra clase atraves de este metodo getInstance();
     * @return Retorna una instancia de la clase Tickets, para no llamar varias veces al constructor.
     * este metodo realiza una evaluacion de las instancias creadas y depende de si estan ya creadas manda una u otra respuesta mejor conveniente.
     * */
    public static Tickets getInstance(){
        if (tickets==null){
            tickets=new Tickets();
        }
        return Tickets.tickets;
    }

    /**
     * @param ticket Recibe objeto de la clase Modelo, para ser agregada a nuestra lista de almacenamiento.
     *Este metodo solo agrega un elemento recibido como parametro a nuestro Array.
     *
     */
    public void crear(Ticket ticket){
        ticketList.add(ticket);
    }

    /**
     * Esta funcion accede al contenido de la posicion en nuestra lista, de acuerdo a una previa evaluacion de la misma lista
     * donde se pregunta que si aun hay espacios por recorrer
     * @return Retorna objeto Ticket de acuerdo a la posicion.
     */
    @Override
    public Ticket siguiente() {
        Ticket ticket;
        ticket = ticketList.get(posicion);
        posicion+=1;
        return ticket;
    }

    /**
     * Evalua si el total de boletos ya se ha igualado a la variable posicion, para retornar false y parar la ejecucion del recorrido.
     * @return Retorna un resultado de la condicion a evaluarse, para seguir o no recorriendo la lista.
     */
    @Override
    public boolean hayMas() {
        if (posicion==voletosDisp){
            return false;
        }
       boolean haymas = posicion < ticketList.size();
        return haymas;
    }

    /**
     * Este metodo solo reinicia la posicion a 0, para despues de el seguir haciendo cualquier otra evaluacion
     * con los mismos metodos utilizados.
     */
    @Override
    public void reinicia() {
        System.out.println("Se reinicia la venta de los boletos ");
        posicion=0;
    }


}
