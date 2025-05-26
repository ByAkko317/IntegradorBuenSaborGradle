package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura,horarioCierre;

    private Domicilio domicilio;
    private Set<Categoria> categorias;
    private Set<Promocion> promociones;


    public void addCategoria(Categoria categoria){
        if(this.categorias==null)this.categorias=new HashSet<>();
        if(categoria!=null) this.categorias.add(categoria);
    }
    public void removeCategoria(Categoria categoria){
        if(categoria!=null && this.categorias.contains(categoria)) this.categorias.remove(categoria);
    }

    public void addPromocion(Promocion promocion){
        if(this.promociones==null)this.promociones=new HashSet<>();
        if(promocion!=null)this.promociones.add(promocion);
    }
    public void removePromocion(Promocion promocion){
        if(promocion!=null && this.promociones.contains(promocion))this.promociones.remove(promocion);
    }

}
