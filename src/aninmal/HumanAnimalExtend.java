package aninmal;

public class HumanAnimalExtend extends ExtendAnimal{
    String speed;
    public HumanAnimalExtend(){
    }

    public HumanAnimalExtend(int speed){
        this.speed = "3km";
    }

    public String getSpeed(){
    String str = "speed :" + this.speed;
    return str;
}
}