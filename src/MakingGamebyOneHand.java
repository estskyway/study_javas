public class MakingGamebyOneHand {
    public static void main(String[] args) {
        int card1 = 1;
        int card2 = 2;

        int A = card1;
        int B = 0;
        int C = card2;
        System.out.println(A);
        System.out.println(C);

        B=A;
        A=C;
        C=B;
        System.out.println(A);
        System.out.println(C);

    }
}
