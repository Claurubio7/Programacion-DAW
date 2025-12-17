package Actividad4;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Gestion de coches ***");

        // MARCA, MODELO Y VERSION
        Marca ford = new Marca(1, "Ford");
        Modelo focus = new Modelo(2, ford, "Focus");
        Version titanium = new Version(3, focus, "Titanium", 150, 25000, "Diésel");

        System.out.println("\nDatos creados:");
        System.out.println(" Marca: " + ford);
        System.out.println(" Modelo: " + focus);
        System.out.println(" Versión: " + titanium);


        // EXTRAS
        Extra techoSolar = new Extra(10, "Techo solar", "Apertura eléctrica");
        Extra sonidoPremium = new Extra(11, "Audio Premium", "Alta fidelidad Bose");

        VersionExtra vEx1 = new VersionExtra(titanium, techoSolar, 900);
        VersionExtra vEx2 = new VersionExtra(titanium, sonidoPremium, 500);

        System.out.println("\nExtras disponibles para esta versión:");
        System.out.println(" * " + techoSolar);
        System.out.println(" * " + sonidoPremium);


        // CLIENTE Y VENDEDOR
        Cliente comprador = new Cliente(101, "Carlos", "Martínez", "López",
                "Av. Verde 12", "611552233");

        Vendedor asesor = new Vendedor(501, "Elena", "Soria", "Gómez",
                "699112233", "C/ Luna 7");

        System.out.println("\nCliente registrado: " + comprador);
        System.out.println("Atendido por la vendedora: " + asesor);


        // COMPRA DE COCHE NUEVO
        CocheNuevo cochePedido = new CocheNuevo(
                2001, titanium, comprador, asesor, "5678-DFR", "07/12/2025"
        );

        cochePedido.addExtra(techoSolar);
        cochePedido.addExtra(sonidoPremium);

        System.out.println("\n=== RESUMEN DE COMPRA ===");
        System.out.println("Coche adquirido: " + cochePedido);
        System.out.println("Versión del vehículo: " + titanium);
        System.out.println("Cliente comprador: " + comprador);
        System.out.println("Vendedor responsable: " + asesor);
        System.out.println("Extras instalados:");
        System.out.println(" - " + techoSolar.getNombre());
        System.out.println(" - " + sonidoPremium.getNombre());


        // ENTREGA DE COCHE USADO
        CocheUsado vehiculoAntiguo = new CocheUsado(
                300, comprador, focus, "Ford Fiesta",
                "1111-AAA", 2500, "07/12/2025"
        );

        System.out.println("\n=== ENTREGA VEHÍCULO USADO ===");
        System.out.println("Coche entregado por el cliente: " + vehiculoAntiguo);


        // RESUMEN GENERAL
        System.out.println("\n=== INFORME FINAL DE RELACIONES ===");
        System.out.println("El cliente " + comprador + " compra el coche " + cochePedido);
        System.out.println("El vendedor asignado fue " + asesor);
        System.out.println("El cliente entrega como usado: " + vehiculoAntiguo);
        System.out.println("Este modelo pertenece a la marca " + ford + " y al modelo " + focus);
        System.out.println("La versión adquirida incluye los extras disponibles:");
        System.out.println(" - " + techoSolar);
        System.out.println(" - " + sonidoPremium);
        System.out.println("Y el coche nuevo lleva instalados:");
        System.out.println(" - " + techoSolar);
        System.out.println(" - " + sonidoPremium);
    }
}
