package vehicles;

abstract class AbstractVehicle {
    int speed = 0;
    int increment = 5;
    public int speedUp(int val);
    public int speedDwon(int val){
        this.speed = this.speed - this.increment;
        return this.speed;
    }
}
