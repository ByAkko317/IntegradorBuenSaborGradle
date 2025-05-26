import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

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

    public Promocion(){
        this.imagenes = new HashSet<ImagenPromocion>();
        this.articulos = new HashSet<Articulo>();
        this.detallePedidos = new HashSet<DetallePedido>();
    }

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.HoraDesde = horaDesde;
        this.HoraHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.imagenes = new HashSet<ImagenPromocion>();
        this.articulos = new HashSet<Articulo>();
        this.detallePedidos = new HashSet<DetallePedido>();
    }

    public String getDenominacion() {return denominacion;}

    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public LocalDate getFechaDesde() {return fechaDesde;}

    public void setFechaDesde(LocalDate fechaDesde) {this.fechaDesde = fechaDesde;}

    public LocalDate getFechaHasta() {return fechaHasta;}

    public void setFechaHasta(LocalDate fechaHasta) {this.fechaHasta = fechaHasta;}

    public LocalTime getHoraDesde() {return HoraDesde;}

    public void setHoraDesde(LocalTime horaDesde) {HoraDesde = horaDesde;}

    public LocalTime getHoraHasta() {return HoraHasta;}

    public void setHoraHasta(LocalTime horaHasta) {HoraHasta = horaHasta;}

    public String getDescripcionDescuento() {return descripcionDescuento;}

    public void setDescripcionDescuento(String descripcionDescuento) {this.descripcionDescuento = descripcionDescuento;}

    public Double getPrecioPromocional() {return precioPromocional;}

    public void setPrecioPromocional(Double precioPromocional) {this.precioPromocional = precioPromocional;}

    public TipoPromocion getTipoPromocion() {return tipoPromocion;}

    public void setTipoPromocion(TipoPromocion tipoPromocion) {this.tipoPromocion = tipoPromocion;}

    public Set<ImagenPromocion> getImagenes() {return imagenes;}

    public void setImagenes(HashSet<ImagenPromocion> imagenes) {this.imagenes = imagenes;}

    public Set<Articulo> getArticulos() {return articulos;}

    public void setArticulos(HashSet<Articulo> articulos) {this.articulos = articulos;}

    public void addImagen(ImagenPromocion imagen){
        this.imagenes.add(imagen);
    }
    public void removeImagen(ImagenPromocion imagen){
        if(this.imagenes!=null && this.imagenes.contains(imagen))this.imagenes.remove(imagen);
    }
    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
    public void removeArticulo(Articulo articulo){
        if(this.articulos!=null && this.articulos.contains(articulo))this.articulos.remove(articulo);
    }
    public void addDetallePedido(DetallePedido detallePedido){
        this.detallePedidos.add(detallePedido);
    }
    public void removeDetallePedido(DetallePedido detallePedido){
        if(this.detallePedidos!=null && this.detallePedidos.contains(detallePedido))this.detallePedidos.remove(detallePedido);
    }
}
