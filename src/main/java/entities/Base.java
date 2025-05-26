package entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Base {
    @Builder.Default
    private boolean eliminado=false;


}
