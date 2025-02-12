package Figuras;

public class Main {
    public static void main(String[] args) {
        Superheroe s1= new Superheroe("Spiderman", "Hombre araña", false);
        System.out.println(s1.toString());
        Dimension d1=new Dimension(1.90,50,38.4);
        System.out.println(d1.toString());
        Figura f1=new Figura("f1001",19.95,d1,s1);
        f1.subirPrecio(5.10);
        System.out.println("Precio de la figura " + f1.getSuperheroe().getNombre() + " con código " + f1.getCodigo() + " = " + f1.getPrecio() + "€.");
        System.out.println(f1.toString());
        Coleccion c1= new Coleccion("Marvel");
        c1.addFigura(f1);
        System.out.println("Colección " +c1.getNombreColeccion() +". Datos: " + c1.toString());
        System.out.println("Colección " +c1.getNombreColeccion()+ ". Volumen: " + c1.getVolumenColeccion() +"cm2.");
        System.out.println("Colección " +c1.getNombreColeccion()+ ". Valor: " + c1.getValorColeccion()+"€.");
    }
}