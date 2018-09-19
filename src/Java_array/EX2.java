public class EX2 {
	public static void main(String[] args) {
		 String str = "aaacc好啊accjjj1jjkJkkoo";
		        int[] nums = new int[52];
		        //遍历str中的每个字符
		        for(char i : str.toCharArray()) {
		            //在a-z之间
		            if(i >= 97 && i <= 123 ) {
		                //计数
		                nums[i - 97]++;
		            }else if (i >= 65 && i <= 90 ){
		            	nums[i - 29]++;
		            }
		        }

		        //统计字符串中出现的所有字母和个数
		        for(int i = 0; i<nums.length; i++) {
		            if(nums[i] != 0) {
		            	if(i<=26){
		            		char j = (char) (i + 97);
		            		System.out.println(j+"出现的次数为"+nums[i]);
		                }else{
		                	char j = (char) (i + 29);
		            		System.out.println(j+"出现的次数为"+nums[i]);
		                }
		            }
		        }

		    }
}
