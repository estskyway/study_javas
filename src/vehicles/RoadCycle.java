package vehicles;

public class RoadCycle extends Bicycle{
        String productName;
        public RoadCycle(){

        }

        public RoadCycle(String productName, String color, int price){
        this.productName = productName;
        super.color = color;
        super.price = price;
        }
        public String toString(){
        String str = "productName : " + this.productName + ", color : "+ super.color 
                   + ", price : " +super.price ;
        return str; 
    }
}
