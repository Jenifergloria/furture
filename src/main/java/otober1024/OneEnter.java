package otober1024;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class OneEnter {
	public static void main(String[]args){
			
		/*Aminal a=new Aminal();

		
		
		
		
		//Obj2.wacthdoor();//���ǲ�����ģ�����ͨ����������ã����������еķ���
		Dog b=new Dog();
		
		Aminal c=(Aminal)b;//
	
		//��������ת���� ǿ������ת��
		if(c instanceof Dog){
			Dog d=(Dog)c;
			
		}else{
			System.out.println("ok ");
			}*/
		
		int [] nums = {12,34,434,323,43,788,56,2};
		sort(nums);
		System.out.print(Arrays.toString(nums));
	}
	
	/**
	 * ð������
	 * @param nums
	 */
	public static void sort(int [] nums){
		for(int i=0;i<nums.length;i++){
			for(int j=1;j<nums.length-i;j++){
				if(nums[j-1] < nums[j]){
					int a = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = a;
				}
			}
		}
	}
	/*public static void sort(int[]nums){
		for (int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[j-1]<nums[j]){
					int a=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=a;
				}
			}
		}
	}*/
	
}
