package done;

public class one {
	
	public static void main(String[]args){
		//
		String result="";
		for(int i=0; i<6;i++){
			int a=(int)(Math.random()*26+97);
			result=result+ (char)a;
			
		}
		System.out.println(result);
	}

}
