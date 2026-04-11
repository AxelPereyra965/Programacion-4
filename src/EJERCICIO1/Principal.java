package EJERCICIO1;

import java.time.LocalDate;

public class Principal 
{
    public static void main(String[] args) 
    {
        Empleado e1 = new Empleado(); // empleados con el constructor vacío 
        Empleado e2 = new Empleado(); // empleados con el constructor vacío 
        Empleado e3 = new Empleado(
            "34567890", "Luis", "Martinez",
            LocalDate.of(1992, 3, 15),
            "Masculino", "Calle 789", "1199887766", "luis@gmail.com",
            "Tester"
        );

        Empleado e4 = new Empleado(
            "45678901", "Sofia", "Lopez",
            LocalDate.of(1995, 7, 25),
            "Femenino", "Calle 321", "1144556677", "sofia@gmail.com",
            "Diseñadora"
        );

        Empleado e5 = new Empleado(
            "56789012", "Carlos", "Ramirez",
            LocalDate.of(1988, 12, 5),
            "Masculino", "Calle 654", "1133221100", "carlos@gmail.com",
            "Gerente"
        );

        // Muestro los datos
        System.out.println("Lista de Empleados:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println("-------------------");

        // Próximo legajo
        System.out.println("El próximo legajo será el " + Empleado.devuelveProximoLegajo());

    }
}