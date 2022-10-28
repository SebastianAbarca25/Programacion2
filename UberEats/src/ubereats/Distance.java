package ubereats;

/*
 * @author Sebastián
 */

class Distance {
    int x1;
    int y1;
    int x2;
    int y2;
    int x;
    int y;
    double distance;
    enum Option {UP, DOWN}
    private Option op;
    
    public Distance(int x1, int y1, int x2, int y2) {
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
    }
    
    public Option getOp() {
        return op;
    }
    
    public double getDistanceCar() {
        //Ubicación del pasajero con coordenadas:
        x1 = 2;
        y1 = 2;
        //Ubicación del chofer con coordenadas;
        x2 = 16;
        y2 = 8;
        //Implementando el teorema de Pitágoras...
        x = x2 - x1;
        y = y2 - y1;
        //Distancia por el carro:
        distance = Math.sqrt(x*x + y*y) * 1;
        return distance;
    }
    
    public double getDistanceMoto() {
        //Ubicación del pasajero con coordenadas:
        x1 = 2;
        y1 = 2;
        //Ubicación del chofer con coordenadas;
        x2 = 16;
        y2 = 8;
        //Implementando el teorema de Pitágoras...
        x = x2 - x1;
        y = y2 - y1;
        //Distancia por la moto:
        distance = Math.sqrt(x*x + y*y) * 0.7;
        return distance;
    }
}
