package learn_44;

public class TestArray {

	public static void main(String[] args)
	{
		double  [][]x=new double [2][10];
		randomArray(x);
		showArray(x);
		sumArray(x);
	}
	static void showArray(double [][] array)
	{
		System.out.println("二维数组为：");
		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array[i].length;j++)
			{
				System.out.print("a["+i+"]["+j+"]=");
				System.out.printf("%.2f",array[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	static void sumArray(double [][] array)
	{
		double sum=0;
		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array[i].length;j++)
			{
				sum+=array[i][j];
			}
		}
		System.out.print("二维数组的和为：");
		System.out.printf("%.2f",sum);
	}
	static void randomArray(double [][] array)
	{
		for (int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=Math.random()*100;
			}
		}
	}

}
