package done;

import java.io.File;

public class O1028one {
	public static void main(String []args){
		System.out.println(fn(10));
	}
	
	
	
	public static int fn(int n){
		//System.out.println("1");
		
		if(n==0){
			return 1;
			
		}
		else if(n==1){
			return 4;
			
			
		}
		else if(n==2){
			return 7;
			
			
		}
		
		else{
			int sum=3*fn(n-1)+2*fn(n-2)+fn(n-3);
			
			return sum;
		}
	}
	
}	
/*	public static int getFileLineCount(File file){
		if( !file.isDirectory() ) {
			//计算该文件行数
			int lines = getLine(file);
			return lines;
		}
		
		File [] childs = file.listFiles();
		int sum = 0;
		for(File child : childs){
			sum = sum + getFileLineCount(child);
		}
		return sum;
	} 
	
	public static int getLine(File file){
		int lines = 0;
		return lines;
	}

}*/
