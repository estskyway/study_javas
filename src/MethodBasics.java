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
    int result = y + 1;
    return result;
    }

    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            int z = 1;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);
            z = y + 1; // 변수에 + 1
            z = methodBasics.F(y);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
