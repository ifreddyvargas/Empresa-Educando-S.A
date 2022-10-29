import java.util.Date;

public class EntradadeAlmacen extends Solicitudes {
    int numerodeEntrada;
    Date fechadeentrada;

    public EntradadeAlmacen(int numerodeOrden, int nit, Date fechadelaOrden, Double montoTotaldelaorden) {
        super(numerodeOrden, nit, fechadelaOrden, montoTotaldelaorden);
    }
}
