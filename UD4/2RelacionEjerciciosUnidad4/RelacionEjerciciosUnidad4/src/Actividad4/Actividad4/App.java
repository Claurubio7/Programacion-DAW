package Actividad4;

public class App {
    public static void main(String[] args) {

        System.out.println("=== CREACIÓN DE DATOS ===");

        //MARCA, MODELO Y VERSIÓN
        Marca toyota = new Marca(1, "Toyota");
        Modelo corolla = new Modelo(10, toyota, "Corolla");
        Version sport = new Version(100, corolla, "Sport", 140, 22000, "Gasolina");

        System.out.println("\nMarca creada: " + toyota);
        System.out.println("Modelo creado: " + corolla);
        System.out.println("Versión creada: " + sport);


        //EXTRAS DE LA VERSIÓN 
        Extra gps = new Extra(1, "GPS", "Navegación");
        Extra cuero = new Extra(2, "Asientos de cuero", "Premium");

        VersionExtra ve1 = new VersionExtra(sport, gps, 600);
        VersionExtra ve2 = new VersionExtra(sport, cuero, 1200);

        System.out.println("\nExtras disponibles para esta versión:");
        System.out.println(" - " + gps);
        System.out.println(" - " + cuero);


        //CLIENTE Y VENDEDOR 
        Cliente cliente = new Cliente(1, "Luis", "García", "Santos",
                "C/ Mayor 22", "600111222");

        Vendedor vendedor = new Vendedor(1, "Ana", "López", "Ruiz",
                "699888777", "Av. Sol 8");

        System.out.println("\nCliente: " + cliente);
        System.out.println("Vendedor: " + vendedor);


        // COMPRA DE COCHE NUEVO 
        CocheNuevo nuevo = new CocheNuevo(
                1, sport, cliente, vendedor, "1234-ABC", "07/12/2025"
        );
        nuevo.addExtra(gps);
        nuevo.addExtra(cuero);

        System.out.println("\n=== RESUMEN DEL COCHE NUEVO COMPRADO ===");
        System.out.println("Matricula: " + "1234-ABC");
        System.out.println("Modelo: " + sport);
        System.out.println("Cliente comprador: " + cliente);
        System.out.println("Vendido por: " + vendedor);
        System.out.println("Extras instalados:");
        System.out.println(" - GPS");
        System.out.println(" - Asientos de cuero");


        // ENTREGA DE COCHE USADO
        CocheUsado usado = new CocheUsado(
                50, cliente, corolla, "Toyota Yaris",
                "9999-ZZZ", 3000, "07/12/2025"
        );

        System.out.println("ENTREGA DEL COCHE USADO");
        System.out.println("Cliente entrega su coche: " + usado);


        System.out.println("\nRELACIONES GENERALES");

        System.out.println("El cliente " + cliente +
                " compra un coche nuevo modelo " + sport +
                " con matrícula " + nuevo.toString());

        System.out.println("El vendedor que realizó la venta fue " + vendedor);

        System.out.println("El cliente entregó como coche usado: " + usado);

        System.out.println("\nEl coche nuevo pertenece a la marca " + toyota +
                " y al modelo " + corolla);

        System.out.println("La versión del coche nuevo es: " + sport);

        System.out.println("La versión incluye los extras (de versión):");
        System.out.println(" - " + gps);
        System.out.println(" - " + cuero);

        System.out.println("Y el coche nuevo concretamente lleva los extras instalados:");
        System.out.println(" - " + gps);
        System.out.println(" - " + cuero);

    }
}
