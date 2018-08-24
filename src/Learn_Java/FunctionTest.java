package learn_44;
 
import java.util.Scanner;
public class FunctionTest {

	public static void main(String[] args)
	{
		System.out.println("请输入年份和月份");
		
		Scanner input =new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		input.close();
		int result=getDaysOfYear(year, month);
		System.out.println(year+"年"+month+"月有"+result+"天。");
	}
	//对于声明了有返回值的函数，必须要有一个返回值，声明是什么类型，返回的就是什么类型
	static int getDaysOfYear(int year,int month)//计算某一年某一月有多少天的函数
	{
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
			
		case 2:
			if (year%4==0&&year%100!=0||year%400==0)
			{
				return 29;
			}
			else 
				return 28;
		default:
			return -1;
		}
	}

}
