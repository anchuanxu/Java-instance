package learn_44;
//求1-10000之间能被99整除的数字
public class ForCycle
{
	public static void main(String[] args)
	{
		int count=0;
		for (int i=0;i<=10000;i++)
		{
			if(i%99==0)
			{
				System.out.print(i+" ");
				count ++;
				if(count%10==0)
				{
					System.out.println();
				}
			}
			
		}
		System.out.println();
		System.out.println("总计共有"+count+"个数字能够被整除");
	}
}
