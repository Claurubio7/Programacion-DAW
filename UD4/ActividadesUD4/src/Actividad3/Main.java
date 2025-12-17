import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sucursal sucA = new Sucursal(10, "Mitre 1000", "Rosario");

        Cliente cl1 = new Cliente(1, "45678901", "María López",
                "Rosario", "1985-02-14", 5.5, sucA);

        Tarjeta tarjeta1 = new Tarjeta(3001, "Mastercard", "XZ9",
                "11/29", cl1);

        Empleado empA = new Empleado(501, "33445566", "Pedro Suárez",
                "Belgrano", "Rosario", 230,
                List.of(new Telefono("341-555123"), new Telefono("341-555999")));

        SucursalTrabajanEmpleados relacion =
                new SucursalTrabajanEmpleados(sucA, empA, "Martes", "09:00-17:00");

        Fabrica fabA = new Fabrica("20-44444444-7", "TecnoSur",
                "Argentina", "Damian Torres", 250);

        Producto prodA = new Producto(700, "Mouse Gamer", "Rojo", 4500, fabA);

        SucursalVendeProductos venta =
                new SucursalVendeProductos(sucA, prodA, 6500);

        System.out.println(cl1);
        System.out.println(tarjeta1);
        System.out.println(empA);
        System.out.println(relacion);
        System.out.println(fabA);
        System.out.println(prodA);
        System.out.println(venta);
    }
}

