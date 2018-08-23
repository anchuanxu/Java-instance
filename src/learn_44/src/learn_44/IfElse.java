package learn_44;
import java.util.Scanner;

public class IfElse {

	private static Scanner scan;

	public static void main(String[] args) 
	{
		System.out.println("请出入月份：");
		scan = new Scanner(System.in);
		
		int month=scan.nextInt();
		System.out.println("您输入的是"+month+"月份。");
		switch (month)
		{
			case 1:
			case 2:
			case 3:
				System.out.println("第一季度");
				break;	
			case 4:
			case 5:
			case 6:
				System.out.println("第二季度");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("第三季度");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("第四季度");
				break;
			default:
				System.out.println("输入错误！");	
				break;
		}

	}

}
