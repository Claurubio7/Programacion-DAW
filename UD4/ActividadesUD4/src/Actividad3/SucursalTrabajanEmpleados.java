package Actividad3;
public class SucursalTrabajanEmpleados {
    private Sucursal sucursal;
    private Empleado empleado;
    private String diaTrabajo;
    private String franjaHoraria;

    public SucursalTrabajanEmpleados(Sucursal sucursal, Empleado empleado,
                                     String diaTrabajo, String franjaHoraria) {
        this.sucursal = sucursal;
        this.empleado = empleado;
        this.diaTrabajo = diaTrabajo;
        this.franjaHoraria = franjaHoraria;
    }

    @Override
    public String toString() {
        return "RegistroTrabajo{" +
                "sucursal=" + sucursal.getNroSucursal() +
                ", empleado=" + empleado.getLegajo() +
                ", dia='" + diaTrabajo + '\'' +
                ", horario='" + franjaHoraria + '\'' +
                '}';
    }
}
