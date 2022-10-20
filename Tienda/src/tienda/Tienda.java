package tienda;

/*
 * @author Sebastián
 */
public class Tienda {

    public static void main(String[] args) {
        System.out.println("Bienvenido a Liverpool\n");

        Cliente cliente1 = new Cliente("Sebastián Abarca", 19, 10000, "AAHJ021025XXX", 1);
        System.out.println("Cliente");
        System.out.println("Nombre del Cliente: "); 
        System.out.println(cliente1.getNombre());
        System.out.println("Edad: ");
        System.out.println(cliente1.getEdad());
        System.out.println("Cantidad de Dinero: ");
        System.out.println(cliente1.getDinero());
        System.out.println("RFC: ");
        System.out.println(cliente1.getRfc());
        System.out.println("Número de Cliente: ");
        System.out.println(cliente1.getNumcliente());
        
        System.out.println("");
        
        Asesor asesor1 = new Asesor("Jair Castellón", 32, 23, 5000, 4);
        System.out.println("Asesor");
        System.out.println("Nombre del Asesor: ");
        System.out.println(asesor1.getNombre());
        System.out.println("Edad: ");
        System.out.println(asesor1.getEdad());
        System.out.println("Número de Trabajador: ");
        System.out.println(asesor1.getNumtrabajador());
        System.out.println("Sueldo: ");
        System.out.println(asesor1.getSueldo());
        System.out.println("Área: ");
        System.out.println(asesor1.getArea());
        
        System.out.println("");
        
        Gerente gerente1 = new Gerente("Juan Trenado", 25, 10, "Liverpool", 10000);
        System.out.println("Gerente");
        System.out.println("Nombre del Gerente: ");
        System.out.println(gerente1.getNombre());
        System.out.println("Edad: ");
        System.out.println(gerente1.getEdad());
        System.out.println("Número de Subalternos: ");
        System.out.println(gerente1.getNumsubalternos());
        System.out.println("Sucursal: ");
        System.out.println(gerente1.getSucursal());
        System.out.println("Sueldo: ");
        System.out.println(gerente1.getsSueldo());
        
        System.out.println("");
    }

}

//Clase que funcionará como mi herencia
class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre; this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}

class Cliente extends Persona {
    float dinero;
    String rfc;
    int numCliente;

    public Cliente(String nombre, int edad, float dinero, String rfc, int numCliente) {
        super(nombre, edad);
        this.nombre = nombre; this.edad = edad; this.dinero = dinero; this.rfc = rfc; this.numCliente = numCliente;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public int getEdad() {
        return edad;
    }
    public float getDinero() {
        return dinero;
    }
    public String getRfc() {
        return rfc;
    }
    public int getNumcliente() {
        return numCliente;
    }
}

class Asesor extends Persona {
    int numTrabajador;
    float sueldo;
    int area;

    public Asesor(String nombre, int edad, int numTrabajador, float sueldo, int area) {
        super(nombre, edad);
        this.nombre = nombre; this.edad = edad; this.numTrabajador = numTrabajador; this.sueldo = sueldo; this.area = area;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public int getEdad() {
        return edad;
    }
    public int getNumtrabajador() {
        return numTrabajador;
    }
    public float getSueldo() {
        return sueldo;
    }
    public int getArea() {
        return area;
    }
}

class Gerente extends Persona {
    int numSubalternos;
    String sucursal;
    float sueldo;

    public Gerente(String nombre, int edad, int numSubalternos, String sucursal, float sueldo) {
        super(nombre, edad);
        this.nombre = nombre; this.edad = edad; this.numSubalternos = numSubalternos; this.sucursal = sucursal; this.sueldo = sueldo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public int getEdad() {
        return edad;
    }
    public int getNumsubalternos() {
        return numSubalternos;
    }
    public String getSucursal() {
        return sucursal;
    }
    public float getsSueldo() {
        return sueldo;
    }
}