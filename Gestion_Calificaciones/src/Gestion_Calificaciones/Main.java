package Gestion_Calificaciones;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Lola Lolita", 5, 5);
        new Estudiante("Paco Paquito", 5, 5);
        e1.calcularPromedioMaterias();
        e1.calcularPromedioGeneral();
    }
}