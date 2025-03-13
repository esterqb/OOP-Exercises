package Gestion_Inventario;

public class Main {
    public static void main(String[] args) {
        Producto p1=new Producto(981,"Estuche", 4.90, 3);
        Producto p2=new Producto(982,"Carpeta anillas", 5.90, 4);
        p1.aumentarStock(2);
        System.out.println(p1.mostrarProducto());
        Inventario inventario=new Inventario();
        inventario.agregarProducto(p1);
        inventario.mostrarInventario();

    }
}