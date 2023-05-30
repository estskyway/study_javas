public class MethodIfs {
    // 이거 function으로 만들기
    // if (time < 12) {
    // System.out.println("오전입니다.");
    // }

    // else if (time < 18) {
    // System.out.println("오후입니다.");
    // }

    // else {
    // System.out.println("밤입니다.");
    // }
    public String iftime(int time) {
        String str = "";
        if (time < 12) {
        str = "오전입니다.";
    }

        else if (time < 18) {
        str = "오후입니다.";
    }

        else  {
        str = "밤입니다.";
    }
    return str;
    }


    public static void main(String[] args) {
        try {
            int time = 15;
            String str = "";
            MethodIfs methodifs = new MethodIfs();
            String result = methodifs.iftime(time);
            System.out.println(result);
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
