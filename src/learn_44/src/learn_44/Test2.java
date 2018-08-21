package learn_44;

public class Test2 
{
	public static void main(String[] args)
	{
		int a=128;
		/*byte b=9;
		
		a=b; //自动类型转换*/
		
		byte x=(byte)a;//强制类型转换
		
		System.out.println(x);//128-二进制的10000000
		
	}
	
}
