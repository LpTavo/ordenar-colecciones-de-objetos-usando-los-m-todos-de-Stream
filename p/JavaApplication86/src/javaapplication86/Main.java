import java.util.*;
import java.util.stream.Collectors;

class Alumno {
    private int codigo;
    private String nombre;
    private String apellido;
    private String genero;
    private int semestre;

    public Alumno(int codigo, String nombre, String apellido, String genero, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.semestre = semestre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una lista de alumnos
        List<Alumno> alumnos = Arrays.asList(
                new Alumno(1, "John", "Doe", "M", 3),
                new Alumno(2, "Alice", "Smith", "F", 2),
                new Alumno(3, "Bob", "Johnson", "M", 4)
        );

        // Ordenar la lista de alumnos por apellido utilizando los métodos de Stream
        List<Alumno> alumnosOrdenados = alumnos.stream()
                .sorted(Comparator.comparing(Alumno::getApellido))
                .collect(Collectors.toList());

        // Imprimir la lista ordenada de alumnos por apellido
        alumnosOrdenados.forEach(System.out::println);
    }
}
