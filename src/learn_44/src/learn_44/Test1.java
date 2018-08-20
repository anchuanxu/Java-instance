package learn_44;

import java.util.Scanner;

public class Test1 {
	private static Scanner scan;

	public static void main(String[] args)
	{
		//输入两个数字和一个标志
		System.out.println("请输入两个数字：");
		scan = new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("请输入计算符号");
		
		String flag=scan.next();
		switch (flag) {
		case "+":
			System.out.println("加法的结果是num1+num2=" +(num1+num2));
			break;
		case "-":
			System.out.println("减法的结果是num1-num2=" +(num1-num2));
			break;
		case "*":
			System.out.println("乘法的结果是num1*num2=" +(num1*num2));
			break;
		case "/":
			if(num2==0)
			{
				System.out.println("除数不能为0，计算失败！");
			}
			else
			{
			System.out.println("除法的结果是num1、num2=" +(num1/num2));
			}
			break;
		default:
			System.out.println("输入不合法！10");
			break;
		}
		
		
		
	}
}
