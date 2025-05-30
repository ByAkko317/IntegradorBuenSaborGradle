package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder


public class Promocion extends Base{

    private String denominacion;
    private LocalDate fechaDesde,fechaHasta;
    private LocalTime HoraDesde,HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    private Set<ImagenPromocion> imagenes ;
    private Set<Articulo> articulos;
    private Set<DetallePedido> detallePedidos;

    public void addImagen(ImagenPromocion imagen){
        if(this.imagenes==null) this.imagenes= new HashSet<>();
        if(imagen != null) this.imagenes.add(imagen);
    }
    public void removeImagen(ImagenPromocion imagen){
        if(this.imagenes!=null && this.imagenes.contains(imagen))this.imagenes.remove(imagen);
    }
    public void addArticulo(Articulo articulo){
        if(this.articulos==null) this.articulos= new HashSet<>();
        if(articulo!= null) this.articulos.add(articulo);
    }
    public void removeArticulo(Articulo articulo){
        if(this.articulos!=null && this.articulos.contains(articulo))this.articulos.remove(articulo);
    }
    public void addDetallePedido(DetallePedido detallePedido){
        if(this.detallePedidos==null) this.detallePedidos= new HashSet<>();
        if(detallePedido!=null) detallePedidos.add(detallePedido);
    }
    public void removeDetallePedido(DetallePedido detallePedido){
        if(this.detallePedidos!=null && this.detallePedidos.contains(detallePedido))this.detallePedidos.remove(detallePedido);
    }
}
