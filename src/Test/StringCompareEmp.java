package Test;

public class StringCompareEmp {
    public static void main(String args[]){
        String str = "I miss JINGJING";
        String anotherString = "I love JINGJING";
        Object objStr = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));//忽略大小写的差异
        System.out.println(str.compareTo(objStr.toString()));

        System.out.print("下面比较数字\n");
        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));

    }
}
