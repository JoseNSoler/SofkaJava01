package Program.Productos;

// Interfaz Entregable para implementar metodos por defecto
public interface Entregable {
    void entregar();
    void devolver();
    boolean isEntregado();
    Object compareTo (Object a);
}
