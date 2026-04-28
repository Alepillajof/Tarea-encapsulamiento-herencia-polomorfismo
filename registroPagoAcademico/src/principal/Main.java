package principal;

import java.util.Scanner;
import modelo.PersonaAcademica;
import modelo.DocenteInvestigador;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese código: ");
        String codigo = sc.nextLine();

        while (codigo.isEmpty()) {
            System.out.print("Código inválido. Ingrese nuevamente: ");
            codigo = sc.nextLine();
        }

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        while (nombre.isEmpty()) {
            System.out.print("Nombre inválido. Ingrese nuevamente: ");
            nombre = sc.nextLine();
        }

        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese horas de clase: ");
        int horas = sc.nextInt();

        System.out.print("Ingrese valor por hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Ingrese publicaciones: ");
        int publicaciones = sc.nextInt();

        PersonaAcademica persona = new DocenteInvestigador(
                codigo, nombre, edad, horas, valorHora, publicaciones
        );

        persona.mostrarDatos();
        persona.describirRol();

        double pago = persona.calcularPago();
        System.out.println("Pago final: $" + pago);

        double pagoExtra = ((DocenteInvestigador) persona).calcularPago(50);
        System.out.println("Pago con bono extra: $" + pagoExtra);

        sc.close();
    }
}