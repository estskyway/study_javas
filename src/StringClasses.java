// refer : java doc api
// https://docs.oracle.com/javase/8/docs/api/

public class StringClasses {
    public static void main(String[] args) {
        try {
            String name = "Sang hun oh";
            String name_second = new String("friend Jane !");
            name.equalsIgnoreCase("Sang hun Oh");   //true
            name.equalsIgnoreCase("Sang hun "); //false
            name_second.equals("friend Jane !");  //true
            name_second.length(); //13
            name_second = name_second.replaceAll("e", "a"); //"friand Jana !"
            String[] arrays = name_second.split(" ");   //String[3]@41
            String name_substring = name_second.substring(3,11);  //"and Jana"
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
