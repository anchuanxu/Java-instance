package learn_44;
import java.util.Scanner;

public class SwitchCase
{
	private static Scanner scan;

	public static void main(String[] args)
	{
		//int money = 0;
		System.out.println("出门吃饭带了多少钱?");
		
		scan = new Scanner(System.in);
		
		int money = scan.nextInt();
		
		switch (money)
		{
			case 100:
				System.out.println("吃鱼");
				break;
				
			case 200:
				System.out.println("吃海鲜");
				
				break;
			case 500:
				System.out.println("吃满汉全席");
				break;
			default:
				System.out.println("啥也吃不到");	
				break;
		}
	}
}
