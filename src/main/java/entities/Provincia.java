public class Provincia extends Base{
    private String nombre;

    private Pais pais;

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + pais +
                '}';
    }
}
