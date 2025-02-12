package Figuras;

/**
 * The type Dimension.
 */
public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    /**
     * Instantiates a new Dimension.
     */
//Constructor sin parámetros que inicializa todas las propiedades a 0.
    public Dimension(){
        alto=0;
        ancho=0;
        profundidad=0;
    }

    /**
     * Gets alto.
     *
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Sets alto.
     *
     * @param alto the alto
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * Gets ancho.
     *
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Sets ancho.
     *
     * @param ancho the ancho
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * Gets profundidad.
     *
     * @return the profundidad
     */
    public double getProfundidad() {
        return profundidad;
    }

    /**
     * Sets profundidad.
     *
     * @param profundidad the profundidad
     */
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * Instantiates a new Dimension.
     *
     * @param alto        the alto
     * @param ancho       the ancho
     * @param profundidad the profundidad
     */
    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    //Método que devuelve el volumen máximo que ocuparía el objeto.
     public double getVolumen(){
        return alto*ancho*profundidad;
     }

    //Método toString que devuelve el alto, ancho, profundidad y volumen máximo del objeto.
    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                ", volumen=" + getVolumen() +
                '}';
    }
}
