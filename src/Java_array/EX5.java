import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("请输入日期："); 
	    String dt = sc.nextLine();
	    
	    String regEx = "[0-9]{2}-[0-9]{2}-[0-9]{2}";
	    Matcher matcher = Pattern.compile(regEx).matcher(dt);
	    // 字符串是否与正则表达式相匹配
	    if(matcher.matches()){
	    	System.out.println("match");
	    }else{
	    	System.out.println("no match");
	    }  
	}
}
