import java.util.Date;

public class OrdendeCompra {
    int numerodeOrden;
    int nit;
    Date fechadelaOrden;
    Double montoTotaldelaorden;


    public OrdendeCompra(int numerodeOrden, int nit, Date fechadelaOrden, Double montoTotaldelaorden) {
        this.numerodeOrden = numerodeOrden;
        this.nit = nit;
        this.fechadelaOrden = fechadelaOrden;
        this.montoTotaldelaorden = montoTotaldelaorden;
    }

    public int getNumerodeOrden() {
        return numerodeOrden;
    }

    public void setNumerodeOrden(int numerodeOrden) {
        this.numerodeOrden = numerodeOrden;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Date getFechadelaOrden() {
        return fechadelaOrden;
    }

    public void setFechadelaOrden(Date fechadelaOrden) {
        this.fechadelaOrden = fechadelaOrden;
    }

    public Double getMontoTotaldelaorden() {
        return montoTotaldelaorden;
    }

    public void setMontoTotaldelaorden(Double montoTotaldelaorden) {
        this.montoTotaldelaorden = montoTotaldelaorden;
    }

    @Override
    public String toString() {
        return "OrdendeCompra{" +
                "numerodeOrden=" + numerodeOrden +
                ", nit=" + nit +
                ", fechadelaOrden=" + fechadelaOrden +
                ", montoTotaldelaorden=" + montoTotaldelaorden +
                '}';
    }
}
