public class MethodBasics {
    // <access_modifier> <return_data_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x에 +1
    public int F(int x)
    // return_data_type 과 result는 type이 무조건 맞아야한다.
{
    int result = x + 1;
    return result;
}
 public int D(int y)
    {
    int result = y + 2;
    return result; //2
    }

    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            int z = 1;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            //타입을 설정 - 변수이름을 만든다. - new 라는 인스턴트를 만든다 
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);
            // z = y + 1; // 변수에 + 1
            // z = methodBasics.F(y);
            y = y + 1; // 변수에 + 1
            MethodBasics methodBasics_first = new MethodBasics();
            y = methodBasics_first.F(z); //f(0)
            // System.out.println(y);
            y = methodBasics_first.D(x); //2 4
            // System.out.println(y);

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
