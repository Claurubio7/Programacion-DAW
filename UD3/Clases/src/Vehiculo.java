public class Vehiculo {
    // Datos miembros de la clase
    boolean usedFlags;
    String model;
    int numTires;

    // Constructor de la clase
    public Vehiculo(boolean usedFlags, String model, int numTires) {
        this.usedFlags = usedFlags;
        this.model = model;
        this.numTires = numTires;
    }

    
    // Metodos de la clase
    public void start() {
        System.out.println("Empezar");
    }
    public void turnleft() {
        System.out.println("Girar a la izquierda");
    }
    public void turnright() {
        System.out.println("Girar a la derecha");
    }
    public void stop() {
        System.out.println("Pararse");
    }

    public void forward(int speed) {
        System.out.println("Moverse hacia delante a una velocidad de " + speed);
    }

    public static void imprimirDatosVehiculo(Vehiculo v) {
        System.out.println("Modelo: " + v.model);
        System.out.println("Número de llantas: " + v.numTires);
        System.out.println("Usado: " + v.usedFlags);
    }

    public static void main(String[] args) {
        System.out.println("CREACION DE CLASE VEHICULO Y OBJETOS");
        
        Vehiculo moto = new Vehiculo(false, "Honda", 2);
        Vehiculo coche = new Vehiculo(false, "Toyota", 4);
    
        //Usando los objetos 
        moto.start();
        moto.turnleft();
        moto.forward(50);
        System.out.println(moto.model);
        System.out.println(moto.toString()); // Imprime la referencia del objeto moto

        Vehiculo.imprimirDatosVehiculo(coche);
    }
}