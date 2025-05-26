public class DetallePromocion extends Base {
    private Integer cantidad;
    private Double subtotal;

    private Articulo articulo;

    public DetallePromocion() {
    }

    public DetallePromocion(Integer cantidad, Double subtotal) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
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
}
