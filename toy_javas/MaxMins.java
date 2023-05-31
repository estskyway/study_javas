
import java.util.Scanner;
public class MaxMins {
        // <access_modifier> <return_data_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }

    // 개발자 A : 입력되는 두 변수중에 max값을 출력해주는 것을 목표
    
    public int max(int first, int second) { //변수에 first 와 second 를 만듬
        int result = 0; 
        try {
            if(first>second) {
                result = first;
            }
            else{
                result = second;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);

            int first = 0;
            int second = 0;
            int result = 0;
            first = myObj.nextInt();
            second = myObj.nextInt();
            MaxMins_backup mexMins = new MaxMins_backup();
            result = mexMins.max(first, second);
            System.out.println(result);

        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
        System.out.println();
    }
}
