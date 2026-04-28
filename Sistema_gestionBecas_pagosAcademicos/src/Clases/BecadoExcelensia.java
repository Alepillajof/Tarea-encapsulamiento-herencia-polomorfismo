package Clases;

public class BecadoExcelensia extends  EstudianteBecado{
    private double bonoExcelencia;

    public BecadoExcelensia(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBeca, double bonoExcelencia){
        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        setBonoExcelencia(bonoExcelencia);
    }

    public void setBonoExcelencia(double bonoExcelencia) {
        if(bonoExcelencia>0){
            this.bonoExcelencia = bonoExcelencia;
        } else{
            System.out.println("Bono invalido");
        }
    }

    @Override
    public double calcularPagoFinal() {
        return super.calcularPagoFinal() - bonoExcelencia;
    }
}
