package entities;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    private ImagenCliente imagen;
    private Usuario usuario;

    private Set <Pedido> pedidos;
    private Set <Domicilio> domicilios;


    public void addPedido(Pedido pedido){
        if(this.pedidos==null) this.pedidos=new HashSet<>();
        this.pedidos.add(pedido);
    }

    public void removePedido(Pedido pedido){
        if(this.pedidos.contains(pedido))this.pedidos.remove(pedido);
    }
    public void addDomicilio(Domicilio domicilio){
        if(this.domicilios==null) {this.domicilios=new HashSet<>();}
        this.domicilios.add(domicilio);
    }

    public void removeDomicilio(Domicilio domicilio){
        if(this.domicilios.contains(domicilio))this.domicilios.remove(domicilio);
    }
}
