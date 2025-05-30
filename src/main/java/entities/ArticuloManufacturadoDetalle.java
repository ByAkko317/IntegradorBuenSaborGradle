package entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class ArticuloManufacturadoDetalle extends Base {
    private int cantidad;
    private ArticuloInsumo articuloInsumo;

    public double costoTotal(){
        return articuloInsumo.getPrecioCompra()*cantidad;
    }
}
