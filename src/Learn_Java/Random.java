package learn_44;

public class Random 
{
	//生成随机数
	//math.random();能生成一个0（含）-1（不含）之间的随机double类型的小数
	public static void main(String[] args)
	{
		int i=0;
		int max=0;
		do 
		{
			int num=(int)(Math.random()*10);
			System.out.println(num);//生成0到9之间的伪随机数
			i++;
			if (num>max)
				max=num;	
		}
		while(i<10);
		System.out.println("其中数值最大的数字是"+max);
	}
}
