package Test;
import java.util.StringTokenizer;

public class JavaStringSplitEmp2 {
    public static void main(String[] args){
            String str = "This is String, split by StringTokenizer.create by runoob";
            StringTokenizer st = new StringTokenizer(str);

            System.out.println("------通过空格分割------");
            while (st.hasMoreElements()){
                System.out.println(st.nextElement());
                //System.out.println("");
            }
            System.out.println("------通过逗号分割------");
            StringTokenizer st2 = new StringTokenizer(str, ",");

            while (st2.hasMoreElements()){
                System.out.println(st2.nextElement());
                System.out.println("");
            }

        }
    }

