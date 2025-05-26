import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class Categoria extends Base{
    private String denominacion;

    private Set<Categoria> subCategorias;//=new ArrayList<>();
    private Categoria categoriaPadre;
    private Set<Articulo> articulos;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Set<Categoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(Set<Categoria> subCategorias) {
        this.subCategorias = subCategorias;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void addCategoria(Categoria categoria){
        if (this.subCategorias==null)this.subCategorias=new HashSet<>();
        if (categoria!=null)this.subCategorias.add(categoria);
        categoria.setCategoriaPadre(this);
    }

    public void removeSubCategoria(Categoria subCategoria){
        if(this.subCategorias.contains(subCategoria))this.subCategorias.remove(subCategoria);
        subCategoria.setCategoriaPadre(null);
    }

    public void addArticulo(Articulo articulo){
        if(this.articulos==null) this.articulos=new HashSet<>();
        if(articulo!=null) this.articulos.add(articulo);
    }
    public void removeArticulo(Articulo articulo){
        if(this.articulos.contains(articulo))this.articulos.remove(articulo);
    }

}
