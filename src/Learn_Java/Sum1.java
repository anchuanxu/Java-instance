package learn_44;

public class Sum1 
{
	public static void main(String[] args)
	{
		/*
		int s=0;
		for(int i=0;i<100;i++)
		{
			s+=i;
			if(s>3000)
			{
				System.out.println("股票涨到要求的值3000了！当前循环到第"+i+"次"+"，当前的值是"+s+".");
				break;//用于结束离自己最近的一次循环
			}
		}*/
		//例子：给十个人发工资，第七个人不给发
		/*AAA:for(int i=1;i<=10;i++)//分给10个人
				{
					
						BBB:for (int j=1;j<=5;j++)//每个人分5K
						{
							if(i==7)
							{
								break AAA;//可以直接打断外循环；
							}
							System.out.println("第"+i+"个人得到了第"+j+"次工资$");
						}
				}*/
		//continue
		//例子：求1-100之间能被5整除的数字
		/*for(int i=1;i<100;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}*/
		for (int i=1;i<100;i++)
		{
			if(i%5!=0)
			{
				continue;
				
			}
			else {
				System.out.println(i);
			}
		}
	}
	}
