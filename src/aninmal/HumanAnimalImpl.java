package aninmal;

public class HumanAnimalImpl implements InterfaceAnimal{
    int legs = 2;
    int arms = 2;
    String speech = "yes";

    @Override
    public int setLegs(int legs) {
        this.legs = legs;
        return this.legs;
    }
    @Override
    public int setArms(int arms) {
        this.arms = arms;
        return this.arms;
    }
    @Override
    public String setEnableSpeech(String speech) {
        this.speech = speech;
        return this.speech;
    }
    
        public String toString(){
            String str = "legs :" + this.legs + ", arms :" + this.arms + ", speech :" + this.speech;
            return str;
        }

}
