package principal;

import Clases.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== SISTEMA DE GESTION DE BECAS =====");

        System.out.println("\n--- ESTUDIANTE BECADO ---");
        System.out.print("Codigo: ");
        String codigo1 = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio1 = sc.nextDouble();

        System.out.print("Valor Matricula: ");
        double matricula1 = sc.nextDouble();

        System.out.print("Porcentaje Beca: ");
        double beca = sc.nextDouble();
        sc.nextLine();

        Estudiante e1 = new EstudianteBecado(codigo1, nombre1, promedio1, matricula1, beca);

        System.out.println("\n--- BECADO EXCELENCIA ---");
        System.out.print("Codigo: ");
        String codigo2 = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio2 = sc.nextDouble();

        System.out.print("Valor Matricula: ");
        double matricula2 = sc.nextDouble();

        System.out.print("Porcentaje Beca: ");
        double beca2 = sc.nextDouble();

        System.out.print("Bono Excelencia: ");
        double bono = sc.nextDouble();
        sc.nextLine();

        Estudiante e2 = new BecadoExcelensia(codigo2, nombre2, promedio2, matricula2, beca2, bono);

        System.out.println("\n--- ESTUDIANTE REGULAR ---");
        System.out.print("Codigo: ");
        String codigo3 = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre3 = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio3 = sc.nextDouble();

        System.out.print("Valor Matricula: ");
        double matricula3 = sc.nextDouble();

        System.out.print("Numero Materias: ");
        int materias = sc.nextInt();
        sc.nextLine();

        Estudiante e3 = new EstudianteRegular(codigo3, nombre3, promedio3, matricula3, materias);

        System.out.println("\n--- REGULAR CON RECARGO ---");
        System.out.print("Codigo: ");
        String codigo4 = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre4 = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio4 = sc.nextDouble();

        System.out.print("Valor Matricula: ");
        double matricula4 = sc.nextDouble();

        System.out.print("Numero Materias: ");
        int materias2 = sc.nextInt();

        System.out.print("Recargo Pendiente: ");
        double recargo = sc.nextDouble();

        Estudiante e4 = new RegularConRecargo(codigo4, nombre4, promedio4, matricula4, materias2, recargo);

        System.out.println("\n===== RESULTADOS =====");
        e1.mostrarDatos();
        e2.mostrarDatos();
        e3.mostrarDatos();
        e4.mostrarDatos();

    }
}
