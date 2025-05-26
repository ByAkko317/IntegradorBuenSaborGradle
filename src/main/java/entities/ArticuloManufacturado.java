import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;

    private Set<ArticuloManufacturadoDetalle> detalles;

    public ArticuloManufacturado(String denominacion, String codigo, Double precioVenta, boolean habilitado,String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, codigo, precioVenta, habilitado);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.detalles = new HashSet<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Set<ArticuloManufacturadoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<ArticuloManufacturadoDetalle> detalles) {
        this.detalles = detalles;
    }

    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
        if(detalle != null) detalles.add(detalle);
    }

    public void removeDetalle(ArticuloManufacturadoDetalle detalle) {
        if(this.detalles.contains(detalle))this.detalles.remove(detalle);
    }

    public double getCostoTotal() {
        double costoTotal = 0;
        for (ArticuloManufacturadoDetalle detalle : detalles) {
            ArticuloInsumo insumo = detalle.getArticuloInsumo();
            costoTotal += detalle.getCantidad() * insumo.getPrecioCompra();
        }
        return costoTotal;
    }


}
