import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;
import vehicles.RoadCycle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            // Object 확인
            // ObjectInheritances objectInheritances = new ObjectInheritances();

            // 상속할 class 생성
            // Bicycle bicycle = new Bicycle(5500, "blue");
            // System.out.println(bicycle.toString()); 

            // 상속해 활용
            // MountainBike mountainBike = new MountainBike();
            // MountainBike mountainBike = new MountainBike(6200, "yellow", 5);

            // 상속활용 2
            RoadCycle roadCycle = new RoadCycle("bike1", "blue", 5000);
            System.out.println(roadCycle.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}