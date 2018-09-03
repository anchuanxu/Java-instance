package learn_44;
//函数的重载，仅仅和函数的参数个数和类型有关，与返回值无关。
public class FunctionTest3 {

	public static void main(String[] args) 
	{
		Add(2008,10);
		Add("I ","love china");
	}
	static void Add(int a , int b)
	{
		int sum;
		sum = a + b;
		System.out.println(sum);
	}
	static void Add(String str1,String str2)
	{
		String str;
		str = str1 + str2;
		System.out.println(str);
	}
}
