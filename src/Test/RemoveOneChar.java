package Test;

public class RemoveOneChar {
    public static void main(String[] args){
        String str = "This s is java";
        System.out.println(removeCharAt(str,5));
    }
    public static String removeCharAt(String s,int pos)
    {
        return s.substring(0,pos)+s.substring(pos+1);
    }
}
