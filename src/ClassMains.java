import cases.ClassSeconds;
public class ClassMains {
    public static void main(String[] args) {
        try {
            ClassFirsts classfirsts = new ClassFirsts();    //no parameta
            ClassFirsts classfirstswithvar = new ClassFirsts(5);
            int second = classfirstswithvar.getsecond();
            ClassSeconds classSeconds = new ClassSeconds(6);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }

    private static void ClassSeconds(int i) {
    }
}
