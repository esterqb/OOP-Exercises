package Supermercado;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Detergente d1=new Detergente("Lenor", 3.5);
        d1.setDescuento(0.75);
        d1.setTipoEnvase("plástico");
        d1.setVolumen(3.85);
        System.out.println("El detergente marca "+ d1.getMarca()+ " cuesta " + d1.getPrecioDescuento() + "€ tras aplicar el descuento de " + d1.getDescuento() + "€.");
        System.out.println(d1.toString());

        Cereales c1 = new Cereales("Hacendado", 2.80, "trigo");
        c1.setCaducidad(LocalDate.of(2025,12,23));
        System.out.println(c1.toString());
        System.out.println("La fecha de caducidad de los cereales marca " + c1.getMarca() + " de " + c1.getTipoCereal() + " es: " + c1.getCaducidad());

        Vino v1 = new Vino("Chardonnay","blanco", 4.4, 23.40);
        v1.setCaducidad(LocalDate.of(2027,3,15));
        v1.setTipoEnvase("Botella de vidrio");
        v1.setVolumen(2);
        System.out.println(v1.toString());
    }
}
