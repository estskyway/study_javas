package cases;

// * Quest
// --- 계산 시작 ---
// 장바구니엔 5가지만 넣을 수 있습니다.
// - 입력 중 0원이면 입력되었던 값 합산
// - 100원 이하로 입력 제한, 이상 시 0원 적용

// 1 번째 가격 : 40
// 2 번째 가격 : 140
// 100 초과 0원 적용
// 3 번째 가격 : 5
// 4 번째 가격 : 0

// --- 담은 총합 ---
// 합계 : 45

// --- 계산 종료 ---
import java.util.Scanner;
public class CasherFor {
    public static void main(String[] args) {
        try {
            //장바구니 5개 담기
            int bucket_1 = 0;
            int bucket_2 = 0;
            int bucket_3 = 0;
            int bucket_4 = 0;
            int bucket_5 = 0;
            System.out.println("---계산 시작---");
            Scanner myObj = new Scanner(System.in); 

            for (int first = 0; first < 5; ) {
                System.out.print(" 1번째 담기 : ");
                bucket_1 = myObj.nextInt();
                
                System.out.print(" 2번째 담기 : ");
                bucket_2 = myObj.nextInt();
                if(bucket_2 > 100) {
                    bucket_2 = 0;
                }
                
                System.out.print(" 3번째 담기 : ");
                bucket_3 = myObj.nextInt();
                
                System.out.print(" 4번째 담기 : ");
                bucket_4 = myObj.nextInt();
                break;
                
            }
            System.out.println(bucket_1);
            System.out.println(bucket_2);
            System.out.println(bucket_3);
            System.out.println(bucket_4);

            System.out.println("---담은 총합---");
            System.out.println(bucket_1+bucket_2+bucket_3+bucket_4+bucket_5);

            System.out.println("---계산 종료---");

        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {

        }
        // return 0;
    }
}
