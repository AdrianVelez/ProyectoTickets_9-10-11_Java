package PatronSingleton;

/**
 * Interface Iterador: Esta nos permitira instanciar los metodos de cada clase que la implemente.
 */
public interface TicketsIterador {

    /**
     * Metodo: Siguiente.
     * @return Retorna un Ticket de la clase modelo con todos sus atributos.
     */
    public Ticket siguiente();

    /**
     * Metodo: HayMas.
     * @return Regresa un valor boolean=True o False, depende de si se cumple la sentencia que se implementa
     * para saber si el iterador sigue recorriendo la lista pasando al metodo Siguiente o hasta ahi termina.
     */
    public boolean hayMas();

    /**
     * Solo Reinicia la variable de posicion, para empezar de 0 nuevamente.
     */
    public void reinicia();
}
