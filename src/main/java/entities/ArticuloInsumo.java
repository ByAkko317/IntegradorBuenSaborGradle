package entities;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private Integer stockActual, stockMinimo;
    private Integer stockMaximo;
    private Boolean esParaElaborar;
}
