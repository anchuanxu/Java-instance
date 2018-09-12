public class TestArray
{
    //所有的数组元素求和
    public static void main(String [] args)
    {
        float s;//定义一个变量来接函数的返回值
        float [] x=new float [] {3.14f ,4.5f,90,100,2};
        s=sumArray(x);
        System.out.println("和是"+s);

    }
    static float sumArray(float [] array)
    {
        float sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        return sum;//return 写到最后
    }
}
