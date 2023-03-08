package PatronSingleton;

/**
 * Esta clase solo complementa la clase modelo.
 */
public class Usuarios {
    private int id;
    private static int contador = 0;
    private String nombre;
    private String Apellido;

    /**
     * El constructor tambien inicializa nuesto id con el post-incremento de la variable contandor.
     * @param nombre Recibe la variable nombre y la asigna a la variable local
     * @param apellido Recibe la variable apellido y la asigna a la variable local
     */
    public Usuarios(String nombre, String apellido){
        this.nombre=nombre;
        this.Apellido=apellido;
        id = ++Usuarios.contador;
    }

    /**
     *
     * @return Retorna los atributos de la clase convertida en String.
     */
    @Override
    public String toString() {
        return "PatronSingleton.Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
