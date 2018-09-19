import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EX1
{
    public static void main(String [] args)
    {

        ArrayList<String> list = new ArrayList<String>();//定义一个集合
        List list1;
        System.out.println("开始输入字符串，以回车作为每个单词的结束:");
        //可以按照自己的需求将初始化的个数和要查询的对象更改为自己键盘即时输入，这里是默认输入。
        list1=Input(3,list);//输入三个单词
        Location("hello",list1);//查询hello在什么位置
    }
    //输入函数
    private static List  Input(int n, List list)
    {
        Scanner sc = new Scanner(System.in);//扫描器读取控制台的输入
        for (int i = 0; i < n; i++) {//读n次
            String str = sc.nextLine();//利用扫描器, 从控制台读取一行字符串
            list.add(str);//加入到集合
        }
        System.out.println("输入的文本为:"+list.toString());//输出集合
        return list;
    }
    //定位某单词
    public static int Location(String str,List list)
    {
        int index = list.indexOf(str);
        if(index!=-1)
        {
            System.out.println("找到该单词:"+str+",位置为第："+(index+1)+"个。");
        }
        else {
            System.out.println("没有找到："+str+"这个单词！");
            index = 0;
        }
        return index;
    }
}
