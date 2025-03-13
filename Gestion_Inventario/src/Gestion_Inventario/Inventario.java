package Gestion_Inventario;

import java.util.ArrayList;

public class Inventario{
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = new ArrayList<>();
    }

    //Método para agregar productos al inventario.
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    //Método para buscar productos en el inventario.
    public Producto buscarProducto(int codigo){
        for (Producto producto : productos){
            if (producto.getCodigo() == codigo){
                return producto;
            }
        } return null;
    }

    //Método para mostrar el inventario.
    public void mostrarInventario(){
        for (Producto pr : productos){
            System.out.println("Producto: " + pr.getNombre());
        }
    }

    //Método para disminuir el stock de un producto al realizar una venta.
    public void venderProducto(Producto producto){
        if (this.productos.contains(producto)){
            this.productos.remove(producto);
        }else{
            if (producto.getCantidadStock()==0);
            {
                System.out.println("El producto " + producto.getNombre() + " no tiene stock.");
            }
        }
    }
}
