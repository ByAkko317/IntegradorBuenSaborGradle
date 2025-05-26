import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;

    private Set<DetallePedido> detallesPedido;

    public Pedido() {
    }

    public Pedido(LocalTime horaEstimadaFinalizacion, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.total = 0.0;
        this.totalCosto = 0.0;
        this.detallesPedido = new HashSet<>();
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(Double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Set<DetallePedido> getDetallePedido() {
        return detallesPedido;
    }

    public void setDetallePedido(Set<DetallePedido> detallePedido) {
        this.detallesPedido = detallePedido;
    }

    public void addDetallePedido(DetallePedido detallePedido) {
        if (this.detallesPedido == null) this.detallesPedido = new HashSet<>();
        this.detallesPedido.add(detallePedido);
    }

    public void removeDetallePedido(DetallePedido detallePedido) {
        if (this.detallesPedido.contains(detallePedido)) this.detallesPedido.remove(detallePedido);
    }

    public double totalCosto() {
        double totalCosto = 0;
        for (DetallePedido detalle : detallesPedido) {
            totalCosto += detalle.getCosto();
        }
        return totalCosto;
    }
}
