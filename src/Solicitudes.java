import java.util.Date;

public class Solicitudes extends OrdendeCompra {

    public Solicitudes(int numerodeOrden, int nit, Date fechadelaOrden, Double montoTotaldelaorden) {
        super(numerodeOrden, nit, fechadelaOrden, montoTotaldelaorden);
    }
    int numerodesolicitud;
    Date fecha;
    Double centrodeCostos;
    String nombredelBien;
    int cantidadSolicitada;
    int valorUnitario;
    Double valorTotal;
}
