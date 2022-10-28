package ubereats;

/*
 * @author Sebastián
 */

class Driver extends Person {
    float costoViaje;
    String ubication;
    String vehicle;
    
    public Driver(String name, int age, float costoViaje, String ubication, String vehicle) {
        super(name, age);
        this.costoViaje = costoViaje; this.ubication = ubication; this.vehicle = vehicle;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public float getCostoViaje() {
        return costoViaje;
    }
    
    public String getUbication() {
        return ubication;
    }
    
    public String getVehicle() {
        return vehicle;
    }
}