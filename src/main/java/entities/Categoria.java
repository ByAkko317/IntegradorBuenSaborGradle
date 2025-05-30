package entities;
import entities.Base;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Categoria extends Base {
    private String denominacion;

    private Set<Categoria> subCategorias;
    private Categoria categoriaPadre;
    private Set<Articulo> articulos;
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
