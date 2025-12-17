package Actividad3;

public class Trabajo {

    private Sucursal sucursal;
    private Empleado empleado;
    private String dia;
    private String horario;

    public Trabajo(Sucursal sucursal, Empleado empleado, String dia, String horario) {
        this.sucursal = sucursal;
        this.empleado = empleado;
        this.dia = dia;
        this.horario = horario;
    }

    public Sucursal getSucursal() { return sucursal; }
    public Empleado getEmpleado() { return empleado; }
    public String getDia() { return dia; }
    public String getHorario() { return horario; }

    @Override
    public String toString() {
        return empleado + " trabaja en " + sucursal +
               " el " + dia + " en horario " + horario;
    }
}
