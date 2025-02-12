package Supermercado;

import java.time.LocalDate;

/**
 * The type Cereales.
 */
public class Cereales implements EsAlimento{
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;
    private int calorias;

    /**
     * Instantiates a new Cereales.
     *
     * @param marca      the marca
     * @param precio     the precio
     * @param tipoCereal the tipo cereal
     */
    public Cereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    /**
     * Gets marca.
     *
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets marca.
     *
     * @param marca the marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
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
     * Gets tipo cereal.
     *
     * @return the tipo cereal
     */
    public String getTipoCereal() {
        return tipoCereal;
    }

    /**
     * Sets tipo cereal.
     *
     * @param tipoCereal the tipo cereal
     */
    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    /**
     * Set calorias int.
     *
     * @return the int
     */
    public int setCalorias(){
        if(tipoCereal.equalsIgnoreCase("espelta")){
            return 5;
        }else if (tipoCereal.equalsIgnoreCase("maiz")){
            return 8;
        }else if (tipoCereal.equalsIgnoreCase("trigo")){
            return 12;
        }else return 15;
    }
    public int getCalorias(){
        return calorias;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    //Método toString para devolver una cadena con todas las características del producto.

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", caducidad=" + caducidad +
                ", calorias=" + calorias +
                '}';
    }
}
