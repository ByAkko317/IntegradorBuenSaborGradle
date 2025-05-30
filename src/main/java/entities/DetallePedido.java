package entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class DetallePedido extends Base{
    private Integer cantidad;
    private Double subtotal;

    private Articulo articulo;
    private Promocion promocion;

    public double subtotal() {
        if(articulo != null) {
             return cantidad * articulo.precioVenta;
        }else{
            return 0;
        }
    }

    public double getCosto() {
        /*Determinar si estoy calculando una promoción o un Articulo*/
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
