public class Ifs {
    public static void main(String[] args) {
        // if (condition) {
            // block of code to be executed if the condition is true
        //   } else{
            // 
        // }
        // int first = 20;
        // int second = 18;
        // if ( first > second ) {
        //    System.out.println(first) ; 
        // }

        // 12시 이전은 오전, 18시 이전 오후,24시까지 밤
        int time = 15;
        if (time < 12) {
            System.out.println("오전입니다.");
        }

        if (time < 18) {
            System.out.println("오후입니다.");
        }

        if (time < 24) {
            System.out.println("밤입니다.");
        }

         time = 15;
        if (time < 12) {
            System.out.println("오전입니다.");
        }

            else if (time < 18) {
            System.out.println("오후입니다.");
        }

            else  {
            System.out.println("밤입니다.");
        }

        System.out.println();
    }
}


// return 0;