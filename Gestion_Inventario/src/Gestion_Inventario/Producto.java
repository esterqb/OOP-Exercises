package Gestion_Inventario;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(int codigo, String nombre, double precio, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    //Método para mostrar la información del producto.
    public String mostrarProducto() {
        return "Producto: \n" +
                "\t - Código=" + codigo +
                "\n\t - Nombre='" + nombre +
                "\n\t - Precio=" + precio +
                "\n\t - Cantidad de stock=" + cantidadStock;
    }

    //Método para reducir el stock.
    public boolean reducirStock (int cantidad){
        if (cantidad > cantidadStock){
            System.out.println("Stock insuficiente");
            return false;
        } else {
            cantidadStock -= cantidad;
            return true;
        }
    }

    //Método para aumentar el stock.
    public void aumentarStock (int cantidad){
        cantidadStock += cantidad;
    }
}
