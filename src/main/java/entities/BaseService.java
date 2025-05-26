import java.io.Serializable;

public interface BaseService<E extends Base, ID extends Serializable>  {

    void guardar (E e);
    E findById(ID id);
}
