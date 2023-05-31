import java.sql.Array;

public class Arrays {
    // String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
//         System.out.println(cars.length);
//         for (int first=0;first < cars.length;first = first+1) {
//             System.out.print(cars[first]+ ",");
//         }
    public String[] initialArrays(){
        String[] carTypes = {"Volvo", "BMW", "Ford", "Mazda", "Kia"};
        return carTypes ;
    }
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        System.out.println(cars.length);
        for (int first = 0; first < cars.length; first = first + 1) {
            // System.out.println(cars[first]);
            System.out.print(cars[first]+ ",");
        }
       System.out.println();
        // return 0;
    }
}

