import java.util.HashMap;
public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1);    //null
            hashMap.put("second", 2);   //null
            hashMap.put("third", 3);    //null
            hashMap.get("third");   //Integer@34 "3"
            hashMap.size(); //3
            hashMap.put("second", 5);   //Integer@32 "2"
            hashMap.remove("second");   //Integer@56 "5"
            hashMap.keySet();   //HashMap$KeySet@67 size=2
                                //0:
                                //"third"
                                //1:
                                //"first"
            hashMap.values();   //HashMap$Values@74 size=2
            hashMap.clear();    //(void)
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
