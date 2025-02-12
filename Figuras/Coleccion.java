package Figuras;

import java.util.ArrayList;

/**
 * The type Coleccion.
 */
public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    /**
     * Instantiates a new Coleccion.
     *
     * @param nombreColeccion the nombre coleccion
     */
    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    /**
     * Gets nombre coleccion.
     *
     * @return the nombre coleccion
     */
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    /**
     * Sets nombre coleccion.
     *
     * @param nombreColeccion the nombre coleccion
     */
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    /**
     * Add figura.
     *
     * @param figura the figura
     */
    //Método para añadir la figura del parámetro a la lista de figuras de la colección.
    public void addFigura(Figura figura) {
        listaFiguras.add(figura);
    }

    /**
     * Subir precio.
     *
     * @param cantidad the cantidad
     * @param id       the id
     */
    //Método para subir el precio de una figura con la cantidad del parámetro.
    public void subirPrecio (double cantidad,String id){
        for (Figura figura : listaFiguras) {
            if (figura.getCodigo().equals(id)) {
                figura.subirPrecio(cantidad);
                break;
            }
        }
    }

    //Método toString que devuelve las figuras con sus características.
    @Override
    public String toString() {
        return "Coleccion{" +
                "Nombre de la coleccion='" + nombreColeccion + '\'' +
                ", Figuras=" + listaFiguras +
                '}';
    }

    /**
     * Con capa string.
     *
     * @return the string
     */
    //Método que devuelve cadena con figuras de la colección con capa.
    public String conCapa() {
        StringBuilder tieneCapa = new StringBuilder("Estas figuras tienen capa: \n");
        for (Figura figura: listaFiguras){
            if (figura.getSuperheroe().isCapa()){
                tieneCapa.append(figura.toString()).append("\n");
            }
        }
        return tieneCapa.toString();
    }

    /**
     * Mas valioso figura.
     *
     * @param precio the precio
     * @return the figura
     */
    //Método que devuelva la figura que tenga el mayor precio de la colección.
    public Figura masValioso(double precio){
        Figura masPrecio = listaFiguras.get(0);
        for (Figura fig : listaFiguras) {
            if (fig.getPrecio() > masPrecio.getPrecio()){
                masPrecio=fig;
            }
        }
        return masPrecio;
    }


    /**
     * Get valor coleccion double.
     *
     * @return the double
     */
    //Método que devuelve un double con el precio total de la colección.
    public double getValorColeccion(){
        double valorTotal=0;
        for (Figura figura : listaFiguras) {
            valorTotal+=figura.getPrecio();
        }
        return valorTotal;
    }

    /**
     * Get volumen coleccion double.
     *
     * @return the double
     */
    //Método que devuelve el volumen aproximado que ocuparía toda la colección de figuras, sumando los volúmenes de cada figura y añadiendo 200.
    public double getVolumenColeccion(){
        double volumenTotal=0;
        for (Figura figura : listaFiguras) {
            volumenTotal+=figura.getPrecio();
        }
        return volumenTotal+200;
    }
}
