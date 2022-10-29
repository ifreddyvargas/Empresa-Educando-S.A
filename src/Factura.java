import java.util.Date;

public class Factura extends Proveedor{
    public Factura(String nombre, Date fechadeOrden, Date fechadeEntrega) {
        super(nombre, fechadeOrden, fechadeEntrega);
    }

    int numerodeEntrada;
    Date fecha;
    int numerodeFactura;
    int totalBienes;
    Double valorTotal;

    public Factura(int numerodeEntrada, Date fecha, int numerodeFactura, int totalBienes, Double valorTotal) {
        this.numerodeEntrada = numerodeEntrada;
        this.fecha = fecha;
        this.numerodeFactura = numerodeFactura;
        this.totalBienes = totalBienes;
        this.valorTotal = valorTotal;
    }

    public int getNumerodeEntrada() {
        return numerodeEntrada;
    }

    public void setNumerodeEntrada(int numerodeEntrada) {
        this.numerodeEntrada = numerodeEntrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumerodeFactura() {
        return numerodeFactura;
    }

    public void setNumerodeFactura(int numerodeFactura) {
        this.numerodeFactura = numerodeFactura;
    }

    public int getTotalBienes() {
        return totalBienes;
    }

    public void setTotalBienes(int totalBienes) {
        this.totalBienes = totalBienes;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numerodeEntrada=" + numerodeEntrada +
                ", fecha=" + fecha +
                ", numerodeFactura=" + numerodeFactura +
                ", totalBienes=" + totalBienes +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
