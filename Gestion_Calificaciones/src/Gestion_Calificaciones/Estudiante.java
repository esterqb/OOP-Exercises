package Gestion_Calificaciones;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private double[][] calificaciones;

    public Estudiante(String nombre, int materia, int evaluacion) {
        this.nombre = nombre;
        this.calificaciones = new double[materia][evaluacion];
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[][] getCalificaciones() {
        return this.calificaciones;
    }

    public void setCalificaciones(double[][] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double[] calcularPromedioMaterias() {
        double[] promedios = new double[this.calificaciones.length];

        for(int i = 0; i < this.calificaciones.length; ++i) {
            double suma = 0.0;
            double[] var5 = this.calificaciones[i];
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                double nota = var5[var7];
                suma += nota;
            }

            promedios[i] = suma / (double)this.calificaciones[i].length;
        }

        return promedios;
    }

    public double calcularPromedioGeneral() {
        double[] promedios = this.calcularPromedioMaterias();
        double sumaTotal = 0.0;
        double[] var4 = promedios;
        int var5 = promedios.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            double promedio = var4[var6];
            sumaTotal += promedio;
        }

        return sumaTotal / (double)promedios.length;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones " + this.nombre + ": ");

        for(int i = 0; i < this.calificaciones.length; ++i) {
            System.out.print("Asignatura: " + (i + 1) + ": " + Arrays.toString(this.calificaciones[i]));
        }

    }
}
