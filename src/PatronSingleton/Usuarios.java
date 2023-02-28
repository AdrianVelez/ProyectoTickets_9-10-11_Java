package PatronSingleton;

public class Usuarios {
    private int id;
    private static int contador = 0;

    private String nombre;
    private String Apellido;

    public Usuarios(String nombre, String apellido){
        this.nombre=nombre;
        this.Apellido=apellido;
        id = ++Usuarios.contador;
    }

    @Override
    public String toString() {
        return "PatronSingleton.Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
