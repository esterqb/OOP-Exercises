package Supermercado;

import java.lang.annotation.Inherited;

public class Detergente implements ConDescuento, EsLiquido{
    private String marca;
    private double precio;
    private double descuento;
    private String tipoEnvase;
    private double volumen;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public void setDescuento(double des){
        this.descuento = des;
    }
    @Override
    public double getDescuento() {
        return descuento;
    }
    @Override
    public double getPrecioDescuento() {
        return precio - descuento;
    }
    @Override
    public void setVolumen(double vol){
        this.volumen = vol;
    }
    @Override
    public double getVolumen(){
        return volumen;
    }
    @Override
    public void setTipoEnvase(String env){
        this.tipoEnvase = env;
    }
    @Override
    public String getTipoEnvase(){
        return tipoEnvase;
    }

    //Método toString con todas las características del producto.
    @Override
    public String toString(){
        return "Detergente [ marca = " + marca + ", precio = " + precio + ", descuento = " + descuento + ", tipoEnvase = " + tipoEnvase + ", volumen = " + volumen + " ]";
    }

}
