// - animals/InterfaceAnimal.java
// + setLegs(?);
// + setArms(?);
// + setEnableSpeech(?);
// - animals/HumanAnimalImpl.java
// + toString() -> legs : 2, arms : 2, speech : Yes
// - animals/HorseAnimalImpl.java
// + toString() -> legs : 4, arms : 0, speech : No
// - animals/HumanAnimalExtend.java
// + Speed() -> speed : 3km
// - animals/HorseAnimalExtend.java
// + Speed() -> speed : 12km

import aninmal.ExtendAnimal;
import aninmal.HorseAnimalExtend;
import aninmal.HorseAnimalImpl;
import aninmal.HumanAnimalExtend;
import aninmal.HumanAnimalImpl;
import aninmal.InterfaceAnimal;

public class AnimalMain {
    public static void main(String[] args) {
        try {
            // 사람
            HumanAnimalImpl humanAnimalImpl = new HumanAnimalImpl();
            System.out.println(humanAnimalImpl.toString());

            // 말
            HorseAnimalImpl horseAnimalImpl = new HorseAnimalImpl();
            System.out.println(horseAnimalImpl.toString());

            HumanAnimalExtend humanAnimalExtend = new HumanAnimalExtend(0);
            System.out.println(humanAnimalExtend.getSpeed());

            HorseAnimalExtend horseAnimalExtend = new HorseAnimalExtend(0);
            System.out.println(horseAnimalExtend.getSpeed());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
