package EJERCICIO1;

import java.time.LocalDate;

public class Principal 
{
    public static void main(String[] args) 
    {

        Empleado e1 = new Empleado(
            "12345678", "Juan", "Perez",
            LocalDate.of(1990, 5, 10),
            "Masculino", "Calle 123", "1122334455", "juan@gmail.com",
            "Programador"
        );

        Empleado e2 = new Empleado(
            "23456789", "Ana", "Gomez",
            LocalDate.of(1985, 8, 20),
            "Femenino", "Calle 456", "1166778899", "ana@gmail.com",
            "Analista"
        );

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

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

    }
}