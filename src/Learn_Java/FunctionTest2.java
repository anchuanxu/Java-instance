package learn_44;

import java.util.Scanner;

public class FunctionTest2 {

	public static void main(String[] args)
	{
		System.out.println("请输入你想要铺的行列和地板样式:");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int col = input.nextInt();
		String style = input.nextLine();
		System.out.print("当前市场上铺地板每平方的价钱为：");
		float money = (float) (Math.random()*10);
		System.out.printf("%.1f",money);
		System.out.println("元");
		float sumMoney;
		input.close();
		System.out.println("\n地板铺成预览如下：");
		sumMoney=PuDiBan(row, col, style,money);
		System.out.print("总计需要铺地板预算");
		System.out.printf("%.2f",sumMoney);
		System.out.println("元");
	}
//写一个铺地板的函数
	static float PuDiBan(int row,int col,String style,float money)
	{
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(style);
			}
			System.out.println();
		}
		return row*col*money;
	}
}
