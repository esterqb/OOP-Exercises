package Electrodomesticos;

/**
 * The type Lavadora.
 */
public class Lavadora extends Electrodomestico {
    private double precio;
    private boolean aguaCaliente;

    /**
     * Instantiates a new Lavadora.
     *
     * @param marca    the marca
     * @param potencia the potencia
     */
    //Constructor que recibe como parámetros la marca y la potencia e inicializa el funcionamiento a agua fría.
    public Lavadora (String marca, double potencia) {
       super("Lavadora", marca, potencia);
        this.aguaCaliente=aguaCaliente;
        aguaCaliente=false;
        //caliente true, fría false
    }

    /**
     * Instantiates a new Lavadora.
     *
     * @param marca        the marca
     * @param precio       the precio
     * @param potencia     the potencia
     * @param aguaCaliente the agua caliente
     */
    //Constructor que recibe como parámetros la marca, precio, potencia, modelo y modo de funcionamiento.
    public Lavadora (String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio=precio;
        this.aguaCaliente=aguaCaliente;
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
     * Is agua caliente boolean.
     *
     * @return the boolean
     */
    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    /**
     * Sets agua caliente.
     *
     * @param aguaCaliente the agua caliente
     */
    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    //Método toString que devuelve una cadena con todas las características de la lavadora.
    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    //Método reprogramado para ajustarlo al modo de funcionamiento (agua fría o caliente) - thus overridden.
    @Override
    public double getConsumo(int horas){
        if (isAguaCaliente()){
            return horas*(getPotencia()+getPotencia()*0.2);
        } else {
            return horas*getPotencia();
        }
    }
}
