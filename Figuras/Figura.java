package Figuras;

/**
 * The type Figura.
 * Contiene un objeto de la clase Dimension y otro de la clase Superheroe.
 */
public class Figura{
    private String codigo;
    private double precio;
    private Dimension dimensiones;
    private Superheroe superheroe;

    /**
     * Gets codigo.
     *
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets codigo.
     *
     * @param codigo the codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Gets superheroe.
     *
     * @return the superheroe
     */
    public Superheroe getSuperheroe() {
        return superheroe;
    }

    /**
     * Sets superheroe.
     *
     * @param superheroe the superheroe
     */
    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    /**
     * Gets precio.
     *
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Sets precio.
     *
     * @param precio the precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Gets dimensiones.
     *
     * @return the dimensiones
     */
    public Dimension getDimensiones() {
        return dimensiones;
    }

    /**
     * Sets dimensiones.
     *
     * @param dimensiones the dimensiones
     */
    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    /**
     * Instantiates a new Figura.
     *
     * @param codigo      the codigo
     * @param precio      the precio
     * @param dimensiones the dimensiones
     * @param superheroe  the superheroe
     */
    public Figura(String codigo, double precio, Dimension dimensiones, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;
    }

    //Método toString para devolver una cadena con todas las características de la figura.
    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", dimensiones=" + dimensiones +
                ", superheroe=" + superheroe +
                '}';
    }

    /**
     * Subir precio.
     *
     * @param cantidad the cantidad
     */
    //Método que recibe una cantidad de dinero por parámetro para subir el precio de la figura.
    public void subirPrecio(double cantidad){
        this.precio += cantidad;
        this.precio = Math.round(this.precio * 100.0) / 100.0;
    }
}
