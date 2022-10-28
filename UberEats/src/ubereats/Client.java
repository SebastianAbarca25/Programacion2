package ubereats;

/*
 * @author Sebastián
 */

class Client extends Person {
    String ubication;
    String destiny;
    
    public Client(String name, int age, String ubication, String destiny) {
        super(name, age);
        this.ubication = ubication; this.destiny = destiny;
    } 
    
    @Override
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getUbication() {
        return ubication;
    }
    
    public String getDestiny() {
        return destiny;
    }
}
