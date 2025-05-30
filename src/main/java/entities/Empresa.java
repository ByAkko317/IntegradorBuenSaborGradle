package entities;

import java.util.HashSet;
import java.util.Set;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private Integer cuil;

    private Set<Sucursal> sucursales;

    public void addSucursal(Sucursal sucursal){
        if(this.sucursales==null) this.sucursales=new HashSet<>();
        if(sucursal != null) this.sucursales.add(sucursal);
    }

    public void removeSucursal(Sucursal sucursal){
        if(this.sucursales.contains(sucursal)) this.sucursales.remove(sucursal);
    }

}
