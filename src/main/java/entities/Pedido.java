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


public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;

    private Set<DetallePedido> detallesPedido;


    public void addDetallePedido(DetallePedido detallePedido) {
        if (this.detallesPedido == null) this.detallesPedido = new HashSet<>();
        this.detallesPedido.add(detallePedido);
    }

    public void removeDetallePedido(DetallePedido detallePedido) {
        if (this.detallesPedido.contains(detallePedido)) this.detallesPedido.remove(detallePedido);
    }

    public double totalCosto() {
        double totalCosto = 0;
        for (DetallePedido detalle : detallesPedido) {
            totalCosto += detalle.getCosto();
        }
        return totalCosto;
    }
}
