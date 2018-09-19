import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class EX3 {
	   public static void main(String args[]){
	        String str="good good strudy,day day up";
	        int sum=0;
	        List<Integer> list=new ArrayList<Integer>();
	        Map<Integer,String> map=new HashMap<Integer, String>();
	        String[] words=str.split(" |,");
	        for(int i=0;i<words.length;i++){
	            map.put(i,words[i]);      
	        }
	        Set<Entry<Integer, String>> set=map.entrySet();       
	        Iterator<Entry<Integer, String>>   iterator=set.iterator();           
	        while (iterator.hasNext() ){        
	            Map.Entry  mapentry = (Map.Entry) iterator.next();  
	            int j=0; 
	            //给定的单词
	            if(mapentry.getValue().equals("good")){
	                j++;
	                sum+=j;
	                list.add((Integer) mapentry.getKey()+1); 
	            }    
	        } 
	        System.out.println("一共出现："+sum+";"+"位置分别是："+list.toString());
	    }
}
