package PatronSingleton;

import java.util.ArrayList;

public class Tickets implements TicketsIterador{
   ArrayList<Ticket> ticketList = new ArrayList<>();
    int posicion = 0;
    int voletosDisp=4;

    //PatronSingleton
    //Se crea instancia de la misma clase, para poder retornarla despues
    //static para que se pueda utilizar en el metodo getInstance();
    static  Tickets tickets;
    //Constructor privado, para que no pueda inicializar ningun objeto de esta manera.
    private Tickets(){}

    //getInstance hacen un wripper envoltorio del constructor que esta privado
    //de esta manera solo podemos instanciar de nuestra clase atraves de este metodo getInstance();
    public static Tickets getInstance(){
        if (tickets==null){
            tickets=new Tickets();
        }
        return Tickets.tickets;
    }


    public void crear(Ticket ticket){
        ticketList.add(ticket);
    }

    @Override
    public Ticket siguiente() {
        Ticket ticket;
        ticket = ticketList.get(posicion);
        posicion+=1;
        return ticket;
    }

    @Override
    public boolean hayMas() {
        if (posicion==voletosDisp){
            return false;
        }
       boolean haymas = posicion < ticketList.size();
        return haymas;
    }

    @Override
    public void reinicia() {
        System.out.println("Se reinicia la venta de los boletos ");
        posicion=0;
    }


}
