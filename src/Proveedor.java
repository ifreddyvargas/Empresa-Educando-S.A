import java.util.Date;

public class Proveedor {
    String nombre;
    Date fechadeOrden;
    Date fechadeEntrega;

    public Proveedor(String nombre, Date fechadeOrden, Date fechadeEntrega) {
        this.nombre = nombre;
        this.fechadeOrden = fechadeOrden;
        this.fechadeEntrega = fechadeEntrega;
    }

    public Proveedor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadeOrden() {
        return fechadeOrden;
    }

    public void setFechadeOrden(Date fechadeOrden) {
        this.fechadeOrden = fechadeOrden;
    }

    public Date getFechadeEntrega() {
        return fechadeEntrega;
    }

    public void setFechadeEntrega(Date fechadeEntrega) {
        this.fechadeEntrega = fechadeEntrega;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", fechadeOrden=" + fechadeOrden +
                ", fechadeEntrega=" + fechadeEntrega +
                '}';
    }
}
