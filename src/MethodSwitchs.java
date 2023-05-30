public class MethodSwitchs {
        // <access_modifier> <return_data_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public String today(int day){
        try {
            String str = "";
            switch (day) {
                case 1:
                    str = "Monday";
                    break;
                case 2:
                    str = "Tuesday";
                    break;
                case 3:
                    str = "Wednesday";
                    break;
                case 4:
                    str = "Thursday";
                    // break;
            }
        

        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;
    }
    public static void main(String[] args) {
        try {
            int day = 4;
            String str = "";

            MethodSwitchs methodSwitchs = new MethodSwitchs();
            String returnresult = methodSwitchs.today(day);
            System.out.println(returnresult);

        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
