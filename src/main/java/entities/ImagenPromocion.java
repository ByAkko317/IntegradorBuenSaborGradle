public class ImagenPromocion extends Base{
    private String denominacion,url;

    public ImagenPromocion(String denominacion, String url) {
        this.denominacion = denominacion;
        this.url = url;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
