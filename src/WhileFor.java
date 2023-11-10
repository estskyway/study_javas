public class WhileFor {
        public static void main(String[] args) {
        try {
            int count = 0;
            while(count<4 ){
                count = count + 1;
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // return 0;
    }
}
