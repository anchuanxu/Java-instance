package learn_44;

public class ShowArray {

	public static void main(String[] args) 
	{
		int  [][] x=new int [2][10];
		x[0][0]=100;
		x[1][x[1].length-1]=900;
		showArray(x);
		

	}
	//二维数组的遍历方法
	static void showArray(int [][] array)
	{
		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
