public class TestArraychar
{
    public static void main(String [] args)
    {
        int [] x={4,5,6,7,8 ,9,100};
        String str=getStr(x,"___acx___");
        System.out.println(str);
    }
    public static String getStr(int [] x,String flag)
    {
        String str="";
        for(int i=0;i<x.length;i++)
        {
            str+=x[i]+flag;
        }
        return str;
    }
}
