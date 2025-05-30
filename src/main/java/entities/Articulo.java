package entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public abstract class Articulo extends Base{

    protected String denominacion,codigo;
    protected Double precioVenta;
    protected boolean habilitado;

    private List<ImagenArticulo> imagenes;
    private UnidadMedida unidadMedida;

    public void addImagen(ImagenArticulo imagen) {
        if (this.imagenes == null) this.imagenes = new ArrayList<>();
        if (imagen != null) this.imagenes.add(imagen);
    }

    public void removeImagen(ImagenArticulo imagen) {
        if (imagen != null) {
            imagenes.remove(imagen);
        }
    }
}
