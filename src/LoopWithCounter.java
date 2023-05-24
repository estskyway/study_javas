public class LoopWithCounter {
    public static void main(String[] args) {
        int bob = 5;
        int lunch = 1;
        int spoon = 1;
        while (lunch < bob) {
            System.out.println(lunch);
            lunch = lunch + spoon;
        }
        System.out.println(lunch);
        // return 0;
    }
}
