package Figuras;

/**
 * The type Superheroe.
 */
public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    /**
     * Instantiates a new Superheroe.
     *
     * @param nombre      the nombre
     * @param descripcion the descripcion
     * @param capa        the capa
     */
    public Superheroe(String nombre, String descripcion, boolean capa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capa = capa;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets descripcion.
     *
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets descripcion.
     *
     * @param descripcion the descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Is capa boolean.
     *
     * @return the boolean
     */
    public boolean isCapa() {
        return capa;
    }

    /**
     * Sets capa.
     *
     * @param capa the capa
     */
    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    //Método toString que devuelve una cadena con las propiedades de Superhéroe.
    @Override
    public String toString() {
        return "Superheroe {" +
                "Nombre='" + nombre + '\'' +
                ", Descripcion='" + descripcion + '\'' +
                ", capa=" + capa +
                '}';
    }
}
