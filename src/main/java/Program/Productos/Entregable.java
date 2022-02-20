package Program.Productos;

public interface Entregable {
    void entregar();
    void devolver();
    boolean isEntregado();
    Object compareTo (Object a);
}
