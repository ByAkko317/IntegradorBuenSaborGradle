package entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class DetallePromocion extends Base {
    private Integer cantidad;
    private Double subtotal;

    private Articulo articulo;

    public double subtotal() {
        if(articulo != null) {
            return cantidad * articulo.precioVenta;
        }else{
            return 0;
        }
    }
}
