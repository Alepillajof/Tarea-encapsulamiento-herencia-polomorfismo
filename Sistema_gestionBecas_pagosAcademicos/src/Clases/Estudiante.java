package Clases;

public abstract class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula){
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    public void mostrarDatos(){
        System.out.println("---DATOS ESTUDIANTE---");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Estudiante: " + getNombre());
        System.out.println("Promedio: " + getPromedio());
        System.out.println("Matricula" + getValorMatricula() + "$");
        System.out.println("Pago final: " + calcularPagoFinal());
        System.out.println("------------------------------------");
    }

    public boolean validarPromedio(){
        if (getPromedio() < 0 || getPromedio() >10){
            return true;
        } else {
            return false;
        }
    }

    public abstract double calcularPagoFinal();

    public double calcularPagoFinal(double descuentoExtra){
        return calcularPagoFinal() * descuentoExtra;
    }

    public void setCodigo(String codigo) {
        if(codigo.isEmpty()){
            System.out.println("El codigo no puede ir vacio");
        } else {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty()){
            System.out.println("El nombre no puede ir vacio");
        } else{
            this.nombre = nombre;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio<0 || promedio>10){
            System.out.println("Promedio invalido");
        } else{
            this.promedio = promedio;
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula>0){
            this.valorMatricula = valorMatricula;
        } else{
            System.out.println("Valor de matricula invalido");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }
}
