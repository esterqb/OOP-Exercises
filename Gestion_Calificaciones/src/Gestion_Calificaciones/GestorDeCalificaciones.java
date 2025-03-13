package Gestion_Calificaciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestorDeCalificaciones {
    private ArrayList<Estudiante> estudiantes = new ArrayList();
    private Estudiante estudiante;

    public GestorDeCalificaciones() {
        this.estudiante = this.estudiante;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del estudiante. ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el número de materias: ");
        int materias = sc.nextInt();
        System.out.println("Ingresa el número de evaluaciones por materia: ");
        int evaluaciones = sc.nextInt();
        Estudiante estudiante = new Estudiante(nombre, materias, evaluaciones);

        for(int i = 0; i < materias; ++i) {
            for(int j = 0; j < evaluaciones; ++j) {
                System.out.println("Ingresa la calificación para la materia " + (i + 1) + ", evaluación " + (j + 1) + ": ");
                estudiante.getCalificaciones()[i][j] = sc.nextDouble();
            }
        }

        this.estudiantes.add(estudiante);
        System.out.println("Estudiante " + nombre + " agregado correctamente.");
    }

    public void promedioMensaje(Estudiante estudiante) {
        if (estudiante.calcularPromedioGeneral() < 5.0) {
            System.out.println("Boletín del trimestre suspenso: debe recuperar.");
        } else {
            System.out.println("El estudiante " + estudiante.getNombre() + " ha aprobado el trimestre. ¡Enhorabuena!");
        }

    }

    public void mejorPromedio(ArrayList<Estudiante> estudiantes) {
        Iterator var2 = estudiantes.iterator();

        while(var2.hasNext()) {
            Estudiante estudiante = (Estudiante)var2.next();
            if (estudiante.calcularPromedioGeneral() > estudiante.calcularPromedioGeneral()) {
                System.out.println("El estudiante " + estudiante.getNombre() + " tiene el mejor promedio.");
            }
        }

    }

    public String mostrarEstudiantes() {
        Estudiante var2;
        for(Iterator var1 = this.estudiantes.iterator(); var1.hasNext(); var2 = (Estudiante)var1.next()) {
        }

        return this.estudiantes.toString();
    }

    public static void main(String[] args) {
        GestorDeCalificaciones gestor = new GestorDeCalificaciones();
        Scanner sc = new Scanner(System.in);

        int opcion;
        label25:
        do {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar alertas");
            System.out.println("3. Encontrar mejor estudiante");
            System.out.println("4. Mostrar todos los estudiantes");
            System.out.println("5. Salir");
            System.out.println("Ingresa una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    gestor.agregarEstudiante();
                    break;
                case 2:
                    Iterator var4 = gestor.estudiantes.iterator();

                    while(true) {
                        if (!var4.hasNext()) {
                            continue label25;
                        }

                        Estudiante estudiante = (Estudiante)var4.next();
                        gestor.promedioMensaje(estudiante);
                    }
                case 3:
                    gestor.mejorPromedio(gestor.estudiantes);
                    break;
                case 4:
                    gestor.mostrarEstudiantes();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while(opcion != 4);

    }
}
