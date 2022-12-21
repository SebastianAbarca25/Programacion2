package multiplayer;

/*
 * @author Sebastián
 */

class Bullet{
    private double angle;
    private double speed;
    private int damage;
    private Point p;
    private double Ax;
    private double Ay;
    private char color;
    private boolean enable;

    public Bullet(double angle, Point p, char color){
        this.angle = angle; this.p = p; this.color = color;
        damage = 10;
        speed = Config.SPEED_BULLET;
        enable = true;
        Ax = speed * Math.cos(angle);
        Ay = speed * Math.sin(angle);
    }
    public void move(double angle){
        if((angle>=0)&&(angle<90)){
            if(angle==0){
                Ax++;
            }else{
                Ax++;
                Ay--;
            }
        }
        else if((angle>=90)&&(angle<180)){
            if(angle==90){
                Ay--;
            }else{
                Ax--;
                Ay--;
            }
        }
        else if((angle>=180)&&(angle<270)){
            if(angle==180){
                Ax--;
            }else{
                Ax--;
                Ay++;
            }
        }
        else if((angle>=270)&&(angle<=360)){
            if(angle==270){
                Ay++;
            }else{
                Ax++;
                Ay++;
            }
            if(angle>=360){
                angle = 0;
            }
        }
    }

    public void updateLocation() {
        p.setX(p.getX() + Ax);
        p.setY(p.getY() + Ay);
        
        if(p.getX() < 0 || p.getX() > Config.SIZE_WIN_W || p.getY() < 0 || p.getY() > Config.SIZE_WIN_H) {
            enable = false;
        }
    }
    
    public double getAngle() {
        return angle;
    }
    
    public boolean getEnable() {
        return enable;
    }
    
    public char getColor() {
        return color;
    }
    
    public int getDamage() {
        return damage;
    }
    /*
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }*/
    
    public double getSpeed() {
        return speed;
    }
    
    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    public void setColor(char color) {
        this.color = color;
    }
    
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public void setX(double Ax) {
        this.Ax = Ax;
    }
    
    public void setY(double Ay) {
        this.Ay = Ay;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }

}