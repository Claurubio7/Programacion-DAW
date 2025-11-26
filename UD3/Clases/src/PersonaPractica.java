public class PersonaPractica {
    String nombre;
    byte edad;
    double estatura;

    public PersonaPractica(String nombre, byte edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public PersonaPractica(PersonaPractica p) {
        this.nombre = p.getNombre();
        this.edad = p.getEdad();
        this.estatura = p.getEstatura();
    }   


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(byte anyos) {
        this.edad = anyos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getEstatura() {
        return estatura;
    }

    public void saudar() {
        System.out.println("Hola a todos, soy " + nombre);
    }

    public void imprimirDatos() {
        System.out.println("Te llamas " + nombre+", tienes " + edad + " años y mides " + estatura + " metros.");
    }

    public static void main(String[] args) {
        PersonaPractica p1 = new PersonaPractica("Pepa", (byte)18, 1.87);
        p1.saudar();
        PersonaPractica p2 = new PersonaPractica("Paco", (byte)51, 1.68);
        p2.saudar();
        PersonaPractica p3 = new PersonaPractica("Miguel", (byte)27, 1.79);
        p3.saudar();

        p3.setNombre("Jonathan");
        //Imprimir datos de cada objeto
        p1.imprimirDatos();
        p2.imprimirDatos();     
        p3.imprimirDatos();
        
        
    }
}
