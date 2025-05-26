public class DetallePedido extends Base{
    private Integer cantidad;
    private Double subtotal;
    // Agregar Promocion como atributo
    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(Integer cantidad) {
        this.cantidad = cantidad;
        this.subtotal = subtotal();
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() { return subtotal;}

    public void setSubtotal(Articulo articulo) {
        this.subtotal= cantidad * articulo.getPrecioVenta();
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public double subtotal() {
        if(articulo != null) {
             return cantidad * articulo.precioVenta;
        }else{
            return 0;
        }
    }
    public double getCosto() {
        /*
        *
        *
        * Determinar si estoy calculando una promoción o un Articulo
        *
        * */


        if (articulo instanceof ArticuloManufacturado) {
            ArticuloManufacturado manufacturado = (ArticuloManufacturado) articulo;
            return cantidad * manufacturado.getCostoTotal();
        } else if (articulo instanceof ArticuloInsumo) {
            ArticuloInsumo insumo = (ArticuloInsumo) articulo;
            return cantidad * insumo.getPrecioCompra();
        }
    return 0;
    }
}
