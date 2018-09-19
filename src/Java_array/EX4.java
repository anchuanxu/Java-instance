import java.util.Scanner;

public class EX4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("请输入姓名 ："); 
	    String name = sc.nextLine();
	    char[] arr = name.toCharArray();
	    boolean flag = true;
	    for(int i = 0;i<arr.length;i++){
	    	if(arr[i]==' '||(arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')){
	    	}else{
	    		flag = false;
	    		break;
	    	}
	    }
	    if(flag==true){
	    	System.out.println(arr);
	    }else{
	    	System.out.println("this is not a valid name");
	    }
	}
}
