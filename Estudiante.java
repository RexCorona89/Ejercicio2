public class Estudiante {
    // Atributos de la clase
    private String nombre;
    private int[] calificaciones;

    // Constructor
    public Estudiante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio de las calificaciones
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / (double) calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método para imprimir los resultados en pantalla
    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        int[] calificaciones = {56, 78, 95, 78, 69}; // Ejemplo de calificaciones
        Estudiante estudiante = new Estudiante("Juan Pérez", calificaciones);
        estudiante.imprimirResultados();
    }
}
