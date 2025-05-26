public class ArticuloManufacturadoDetalle {
    private int cantidad;
    private ArticuloInsumo articuloInsumo;

    public ArticuloManufacturadoDetalle(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloInsumo getArticuloInsumo() {
        return articuloInsumo;
    }

    public void setArticuloInsumo(ArticuloInsumo articuloInsumo) {
        this.articuloInsumo = articuloInsumo;
    }

    public double costoTotal(){
        return articuloInsumo.getPrecioCompra()*cantidad;
    }
}
