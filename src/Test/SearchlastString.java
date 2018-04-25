package Test;

public class SearchlastString {
    public static void main(String[] args)
    {
        String strOrig = "I miss jingjing very much";
        int lastIndex = strOrig.lastIndexOf("jingjing");
        if (lastIndex == -1)
        {
            System.out.println("没有找到jingjing");
        }
        else
        {
            System.out.println("jingjing最后出现的位置: "+lastIndex);
        }
    }
}
