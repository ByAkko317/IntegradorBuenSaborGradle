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
    // Agregar Promocion como atributo
    private Articulo articulo;
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    /* Borrado getCosto (chequear eso) */

    public double subtotal() {
        if(articulo != null) {
             return cantidad * articulo.precioVenta;
        }else{
            return 0;
        }
    }
}
