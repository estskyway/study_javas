public class SetAndGetVariable {
//     - 200, 30, 50, 10 각각 미리 변수 생성하고 활당
// 예제 ) third = 200
//           B = third
// - github 로 파일 공유
// - 디버깅 일지 1회 작성
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        A = 1;
        B = 3;
        C = 5;
        D = 7;
        if (B == 3) {
            A = 10;
        }
        else {
            C = 5;
        }
            System.out.println(A);
            System.out.println(C);
        
        if (D == 9) {
            B =5;
        }
        else {
            B = 200;
        }
        System.out.println(B);
        System.out.println(B);

        if (A == 10) {
            C = 50;
        }
        else {
            D = 30;
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}
