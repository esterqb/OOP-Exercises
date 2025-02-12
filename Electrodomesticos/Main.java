package Electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomestico e1=new Electrodomestico("Lavadora", "Balay", 1.1);
        System.out.println("El consumo del electrodoméstico " + e1.getTipo() + " marca " + e1.getMarca() + " es de " + e1.getConsumo(9) + "kW/h");
        System.out.println("El coste del consumo del electrodoméstico " + e1.getTipo() + " marca " + e1.getMarca() + " es de " +e1.getCosteConsumo(8,0.3) + "€.");
    }
}
