package Clases;

public class EstudianteRegular extends Estudiante{
    private int numeroMaterias;

    public EstudianteRegular(String codigo, String nombre, double promedio, double valorMatricula, int numeroMaterias){
        super(codigo,nombre,promedio,valorMatricula);
        setNumeroMaterias(numeroMaterias);
    }

    public void setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias>0){
            this.numeroMaterias = numeroMaterias;
        } else{
            System.out.println("Numero de materias invalida");
        }
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (numeroMaterias * 10);
    }
}
