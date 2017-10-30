package otober1024;

import java.util.Arrays;


public class O1027 {
	 public static void main(String []arg){
		 int [] nums = {12,10,4,23,13,888,36,2};
				for(int i=0;i<nums.length;i++){
					for(int j=1;j<nums.length-i;j++){
						if(nums[j-1] > nums[j]){
							int a = nums[j-1];
							nums[j-1] = nums[j];
							nums[j] = a;
						}
					}
				}
				System.out.print(Arrays.toString(nums));		
	 }
}
