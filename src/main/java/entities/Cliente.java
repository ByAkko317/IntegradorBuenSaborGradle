import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ImagenCliente getImagen() {
        return imagen;
    }

    public void setImagen(ImagenCliente imagen) {
        this.imagen = imagen;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //getter setter pedidos, add y remove
    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void addPedido(Pedido pedido){
        if(this.pedidos==null) this.pedidos=new HashSet<>();
        this.pedidos.add(pedido);
    }

    public void removePedido(Pedido pedido){
        if(this.pedidos.contains(pedido))this.pedidos.remove(pedido);
    }

    //getter setter domicilios, add y remove
    public Set<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(Set<Domicilio> domicilios) {this.domicilios = domicilios;}

    public void addDomicilio(Domicilio domicilio){
        if(this.domicilios==null) {this.domicilios=new HashSet<>();}
        this.domicilios.add(domicilio);
    }

    public void removeDomicilio(Domicilio domicilio){
        if(this.domicilios.contains(domicilio))this.domicilios.remove(domicilio);
    }
}
