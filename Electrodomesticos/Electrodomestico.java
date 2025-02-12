package Electrodomesticos;

/**
 * The type Electrodomestico.
 */
public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    /**
     * Instantiates a new Electrodomestico.
     *
     * @param tipo     the tipo
     * @param marca    the marca
     * @param potencia the potencia
     */
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
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
     * Gets potencia.
     *
     * @return the potencia
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Sets potencia.
     *
     * @param potencia the potencia
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    /**
     * Get consumo double.
     *
     * @param horas the horas
     * @return the double
     */
    //Método que recibe horas de funcionamiento y devuelve el total de kW consumidos en ese tiempo.
    public double getConsumo(int horas){
        return potencia*horas;
    }

    /**
     * Get coste consumo double.
     *
     * @param horas     the horas
     * @param costeHora the coste hora
     * @return the double
     */
    //Método que recibe horas y precio del kW/h y devuelve el coste del consumo en ese tiempo.
    public double getCosteConsumo(int horas, double costeHora){
        return potencia*horas*costeHora;
    }
}
