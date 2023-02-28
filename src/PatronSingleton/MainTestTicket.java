package PatronSingleton;

import java.time.LocalDate;
import java.util.Date;

public class MainTestTicket {

    public static void main(String[] args) {


        //Relacion muchos a uno, basicamente es el patron de diseño singleton.
        Usuarios user2=new Usuarios("Luis", "Hernandez");
        Usuarios user3=new Usuarios("Cristiano", "Ronaldo");
        Usuarios user4=new Usuarios("Brandon", "perez");

        Ticket t1 = new Ticket(LocalDate.now(),new Usuarios("Adrian", "velez"));
        Ticket t2 = new Ticket(LocalDate.now(),user2);
        Ticket t3 = new Ticket(LocalDate.now(),user3);
        Ticket t4 = new Ticket(LocalDate.now(),user4);

        Tickets tickets = Tickets.getInstance();

        tickets.crear(t1);
        tickets.crear(t2);
        tickets.crear(t3);
        tickets.crear(t4);


        while (tickets.hayMas()){
            //Se crea instancia de Usuario temporal y se le asigna el metodp siguiente que es del mismo tipo Usuario
            Ticket tik = tickets.siguiente();
            System.out.println("Usuario: "+ tik.getUsuario());
            String sinVoleto = tickets.hayMas() ? "Todavia se Pueden comprar boletos":"Ya no hay boletos que comprar: Agotados!!";
            System.out.println(sinVoleto);

        }

        tickets.reinicia();

        while (tickets.hayMas()){
            //Se crea instancia de Usuario temporal y se le asigna el metodp siguiente que es del mismo tipo Usuario
            Ticket tik = tickets.siguiente();
            System.out.println("Usuario: "+ tik.getUsuario());
            String sinVoleto = tickets.hayMas() ? "Todavia se Pueden comprar boletos":"Ya no hay boletos que comprar: Agotados!!";
            System.out.println(sinVoleto);
        }














    }
}
