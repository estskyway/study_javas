package aninmal;


public class ExtendAnimal {

    int speed;
    public ExtendAnimal(){

    }

    public ExtendAnimal(int speed){
        this.speed = speed;
    }
    
    public String getSpeed(){
        String str = "speed :" + this.speed;
        return str;
    }

}