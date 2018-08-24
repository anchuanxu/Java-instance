package learn_44;
import java.util.Scanner;
//流程语句
public class Test3  
{ 
	public static void main(String[] args)
	{
		//int month=2;
		System.out.println("请输入一个月份");
		
		Scanner scan = new Scanner(System.in);//System.in 对应着键盘，可以通过scan从键盘上接收数据
		
		int month = scan.nextInt();//从键盘接收一个int型的值
		
		
		if(month>=1&&month<=3)
		{
			System.out.println("第一季度");
		}
		else if(month>=4&&month<=6)
		{
			System.out.println("第二季度");
		}
		else if(month>=7&&month<=9)
		{
			System.out.println("第三季度");
		}
		else if(month>=10&&month<=12)
		{
			System.out.println("第四季度");
		}
		else 
		{
			System.out.println("输入的月份不合法！");
		}
	}
}
