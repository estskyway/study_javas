import inheritances.ObjectInheritances;
import vehicles.Bicycle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            Bicycle bicycle = new Bicycle(5500, "blue");
            System.out.println(bicycle.toString()); 
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}