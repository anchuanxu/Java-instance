import java.util.Random;
public class TestArrayFindMaxNum
{
    public static void main(String [] args)
    {
        //产生随机数
        //Math.random();//产生0-1的随机数double ,包含0不含1；
        //产生1-10的int型随机数
       // System.out.println((int)(Math.random()*10));
        /*Random r=new Random();
        int n = r.nextInt(100);//使用random类产生从0-99的int型随机数
        System.out.println(n);*/
        int [] array = new int[10];
        initArray(array);

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("数组中所有元素的和是："+getSum(array));
        System.out.println("数组中所有元素最大的是："+getMax(array));
    }
    //用0-10之间的随机数，初始化数组
    public static void initArray(int []array )
    {
        for (int i=0;i<array.length;i++)
        {
            array[i] = new  Random().nextInt(11);
        }
    }
    //求数组的和
    public static int getSum(int []array)
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        return sum;
    }
    //求数组中的最大的数
    public static  int  getMax(int []array)
    {
        int max=0;
        for(int i=0;i<array.length;i++)
        {
            if (array[i]>max)
            max=array[i];
        }
        return max;
    }
}