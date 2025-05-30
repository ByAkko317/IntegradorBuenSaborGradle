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
        if(detalle == null) this.detalles = new HashSet<>();
            this.detalles.add(detalle);
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
