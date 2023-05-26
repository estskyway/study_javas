
import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            boolean a = true;
           
            System.out.println("안내입니다.");
            System.out.println("E: 종료, P: 설문시작, S: 설문통계");
            while (a) {
                System.out.print("입력하세요. : ");
                String answer = myObj.nextLine();
                if (answer.equals("P")) {
                    System.out.println("설문시작");
                } 
                else if (answer.equals("S") || answer.equals("Statistic")) {
                    System.out.println("설문통계"));
                }
                else (|| answer.equals("E")|| answer.equals("Exit")) {
                    System.out.println("설문종료");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println();
        }
        finally {
           System.out.println();
        }
        System.out.println();
        // return 0;
    }
    
}
