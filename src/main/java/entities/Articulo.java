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

    private List<Imagen> imagenes;


    public void addImagen(Imagen imagen) {
        if (this.imagenes == null) this.imagenes = new ArrayList<>();
        if (imagenes != null) this.imagenes.add(imagen);
    }

    public void removeImagen(Imagen imagen) {
        if (imagen != null) {
            imagenes.remove(imagen);
        }
    }
}
