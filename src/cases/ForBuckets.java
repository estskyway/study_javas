package cases;

import java.util.Scanner;
// * Quest
// --- 장보기 시작 ---
// 장바구니엔 3가지만 넣을 수 있습니다.

// 1 번째 담기 : 닭고기
// 2 번째 담기 : 대추
// 3 번째 담기 : 찹쌀

// --- 담은 내용물 ---
// 닭고기, 대추, 찹쌀

// --- 장보기 종료 ---
public class ForBuckets {
    public static void main(String[] args) {
        try {
            // 장바구니 3가지만 담게 선언
            String bucket_1 = "";
            String bucket_2 = "";
            String bucket_3 = "";
            String[] bucket = {"","",""};
            Scanner myObj = new Scanner(System.in); 
            for (int first = 0; first < bucket.length; first = first + 1) {
                System.out.print((first+1) +" 번째 담기 : ");
                bucket[first] = myObj.nextLine();
            }


            System.out.println("--- 담은 내용물 ---");
            System.out.print(bucket[0]+",");
            System.out.print(bucket[1]+",");
            System.out.print(bucket[2]+",");


        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            
        }
        System.out.println();
        // return 0;
    }
}
