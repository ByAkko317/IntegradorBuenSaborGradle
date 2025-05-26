/*@SuperBuilder
 * @Getter
 * @Setter
 */
public class Base {
    private Long id;
    private boolean eliminado=false;

    public Base() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
}
