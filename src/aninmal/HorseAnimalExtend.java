package aninmal;

public class HorseAnimalExtend {
    String speed;
    public HorseAnimalExtend(){
    }

    public HorseAnimalExtend(int speed){
        this.speed = "12km";
    }

    public String getSpeed(){
    String str = "speed :" + this.speed;
    return str;
}
}
