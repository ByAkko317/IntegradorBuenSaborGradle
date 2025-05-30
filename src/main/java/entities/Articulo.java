package entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public abstract class Articulo extends Base{

    protected String denominacion,codigo;
    protected Double precioVenta;


    private Set<ImagenArticulo> imagenes;
    private UnidadMedida unidadMedida;

    public void addImagen(ImagenArticulo imagen) {
        if (this.imagenes == null) this.imagenes = new HashSet<>();
        if (imagen != null) this.imagenes.add(imagen);
    }

    public void removeImagen(ImagenArticulo imagen) {
        if (imagen != null) {
            imagenes.remove(imagen);
        }
    }
}
