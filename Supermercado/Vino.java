package Supermercado;

import java.time.LocalDate;

/**
 * The type Vino.
 */
public class Vino implements ConDescuento, EsLiquido, EsAlimento{
    private String marca;
    private String tipo;
    private double grados;
    private double precio;
    private double descuento;
    private String tipoEnvase;
    private double volumen;
    private int calorias;
    private LocalDate caducidad;

    /**
     * Instantiates a new Vino.
     *
     * @param marca  the marca
     * @param tipo   the tipo
     * @param grados the grados
     * @param precio the precio
     */
    public Vino(String marca, String tipo, double grados, double precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.grados = grados;
        this.precio = precio;
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
     * Gets tipo.
     *
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets tipo.
     *
     * @param tipo the tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Gets grados.
     *
     * @return the grados
     */
    public double getGrados() {
        return grados;
    }

    /**
     * Sets grados.
     *
     * @param grados the grados
     */
    public void setGrados(double grados) {
        this.grados = grados;
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

    @Override
    public void setDescuento(double des){
        this.descuento = des;
    }
    @Override
    public double getDescuento() {
        return descuento;
    }
    @Override
    public double getPrecioDescuento() {
        return precio - (precio - descuento);
    }
    @Override
    public void setVolumen(double vol){
        this.volumen = vol;
    }
    @Override
    public double getVolumen(){
        return volumen;
    }
    @Override
    public void setTipoEnvase(String env){
        this.tipoEnvase = env;
    }
    @Override
    public String getTipoEnvase(){
        return tipoEnvase;
    }

    /**
     * Set calorias.
     */
    public void setCalorias(){
        double vinoCalorias=grados*10;
    }
    @Override
    public int getCalorias(){
        return calorias;
    }
    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }
    @Override
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    //Método toString con todas las propiedades de la clase.
    @Override
    public String toString() {
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", grados=" + grados +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", volumen=" + volumen +
                ", calorias=" + calorias +
                ", caducidad=" + caducidad +
                '}';
    }
}