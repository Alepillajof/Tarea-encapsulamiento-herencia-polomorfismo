package modelo;

public class Docente extends PersonaAcademica {
    protected int horasClase;
    protected double valorHora;

    public Docente(String codigo, String nombre, int edad, int horasClase, double valorHora) {
        super(codigo, nombre, edad);
        setHorasClase(horasClase);
        this.valorHora = valorHora > 0 ? valorHora : 1;
    }

    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        } else {
            this.horasClase = 1;
        }
    }

    public int getHorasClase() {
        return horasClase;
    }

    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
    }
}
