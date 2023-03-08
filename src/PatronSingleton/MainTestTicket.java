package PatronSingleton;

import java.time.LocalDate;
import java.util.Date;

public class MainTestTicket {

    /**
     * Metodo principal main
     * Ejecuta la logica de nuestro proyecto.
     * @param args
     */
    public static void main(String[] args) {


        //Relacion muchos a uno, basicamente es el patron de diseño singleton.
        Usuarios user2=new Usuarios("Luis", "Hernandez");
        Usuarios user3=new Usuarios("Cristiano", "Ronaldo");
        Usuarios user4=new Usuarios("Brandon", "perez");

        //1er manera de inicializar nuestro constructor, directamente con otro objeto dentro.
        Ticket t1 = new Ticket(LocalDate.now(),new Usuarios("Adrian", "velez"));
        //2da manera de inicializar constructor, mas clara mandando los objetos.
        Ticket t2 = new Ticket(LocalDate.now(),user2);
        Ticket t3 = new Ticket(LocalDate.now(),user3);
        Ticket t4 = new Ticket(LocalDate.now(),user4);

        /*Creamos unicamente un objeto que nos ayuda a instanciar las clases de muestra clase implementacion
          de nuestra interface Iterador, para poder controlar con los metodos de iteracion el programa.
          esto gracias al patron Singleton implementado en la clase Tickets.
     */
        Tickets tickets = Tickets.getInstance();

        //se crean objetos
        tickets.crear(t1);
        tickets.crear(t2);
        tickets.crear(t3);
        tickets.crear(t4);


        //se evalua la sentencia con ayuda de hayMas(), para seguir recorriendo la Lista.
        //En caso de que si, se llama al metodo siguiente(), para obtener el contenido de la posicion de la lista.
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
