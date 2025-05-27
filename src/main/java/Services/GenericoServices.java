package Services;

import entities.Cliente;

public abstract interface GenericoServices<T> {

    void guardar(T  entity) throws Exception;


    void actualizar(T entity) throws Exception;

}
