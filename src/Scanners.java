import java.util.Scanner;
// nextLine이나 nextInt는 사용할때 class 밖에서 import와 Scanner를 선언해야 한다.
public class Scanners {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // System.out.println("Enter username");
    
        // String userName = myObj.nextLine();  // Read user input
        // System.out.println("Username is: " + userName);  // Output user input

        int first = 0;
        int second = 0;
        first = myObj.nextInt();
        second = myObj.nextInt();
        System.out.println(first +", " +second);
        // 프린트에 변수가 2개이상 들어갈수 없기 때문에+", "+를 사용하여 하나로 만들어 준다.
        // return 0;
    
}
