package entities;

import java.util.HashSet;
import java.util.Set;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;

    private Set<ArticuloManufacturadoDetalle> detalles;

    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
        if(detalle != null) detalles.add(detalle);
    }

    public void removeDetalle(ArticuloManufacturadoDetalle detalle) {
        if(this.detalles.contains(detalle))this.detalles.remove(detalle);
    }


}
