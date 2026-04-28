package Clases;

public class EstudianteBecado extends  Estudiante{
    private double porcentajeBeca;

    public EstudianteBecado(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBeca){
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if(porcentajeBeca>0 || porcentajeBeca<=100){
            this.porcentajeBeca = porcentajeBeca;
        } else{
            System.out.println("Porcentaje no valido");
        }
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() - (getValorMatricula() * porcentajeBeca);
    }
}
