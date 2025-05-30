package entities;
import java.time.LocalDate;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Factura extends Base{
    private String mpPreferenceId, mpPaymentType;
    private Integer mpPaymentId, mpMerchantOrderId;
    private FormaPago formaPago;
    private Double totalVenta;
    private LocalDate fechaFacturacion;

}
