package learn_44;

public class DoubleCycle {
	//要求打印出如下图形
/*	
    ***********
	*********
	********
	*******
	******
	*****
	****
	***
	**
	*
*/
	public static void main(String[] args)
	{
		int num = 10;
		for (int i=0;i<10;i++)
		{
			for (int j=0;j<num;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			num--;
		}
	}

}
