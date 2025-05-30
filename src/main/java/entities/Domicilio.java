package entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Domicilio extends Base{
    private String calle;
    private Integer numero, cp;
    private Localidad localidad;

}
