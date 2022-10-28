package ubereats;

/*
 * @author Sebastián
 */

public class UberEats {

    public static void main(String[] args) {
        System.out.println("Welcome to Uber.\n");
        
        Client client1 = new Client("Sebastián Abarca", 20, "Coordinates (2,2)", "Coordinates (6,11)");
        System.out.println("Client");
        System.out.println("Client´s Name: "); 
        System.out.println(client1.getName());
        System.out.println("Age: ");
        System.out.println(client1.getAge());
        System.out.println("Ubication: ");
        System.out.println("Calle Capitán Carlos Rovirosa.");
        System.out.println(client1.getUbication());
        System.out.println("Destiny: ");
        System.out.println("Ciudad Universitaria.");
        System.out.println(client1.getDestiny());
        
        System.out.println("");
        
        Driver driver1 = new Driver("Juan Trenado", 22, 50, "Coordinates (16,8)", "Car");
        System.out.println("Driver");
        System.out.println("Driver´s Name: "); 
        System.out.println(driver1.getName());
        System.out.println("Age: ");
        System.out.println(driver1.getAge());
        System.out.println("Cost of the trip: ");
        System.out.println(driver1.getCostoViaje());
        System.out.println("Ubication: ");
        System.out.println("Centro Histórico.");
        System.out.println(driver1.getUbication());
        System.out.println("Vehicle: ");
        System.out.println(driver1.getVehicle());

        System.out.println("");
        
        Distance distance = new Distance(2, 2, 16, 8);      
        System.out.println("Distance: ");
        System.out.println("Distance in a Car: ");
        System.out.println(distance.getDistanceCar());
        System.out.println("Distance in a Motorcycle: ");
        System.out.println(distance.getDistanceMoto());
        
        System.out.println("");
        
    }
    
}