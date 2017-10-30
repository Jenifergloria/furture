package pratice;

public class MainEntry {

	
	public static void main(String[]args){
		//取最大年龄的值
		Dome3 liangyiyue= new Dome3();
		liangyiyue.setMaxAge(100);
		
		
		
		Dome3 liangzonghuya= new Dome3();
		liangzonghuya.setMaxAge(88);
		
		
		
		int maxScore=liangyiyue.getMaxAge();
		System.out.println("1最大年龄是"+maxScore);
		int maxScore2=liangzonghuya.getMaxAge();
		System.out.println("2最大年龄是"+maxScore2);
		
		
		Dome3.YOUNG_AGE = 18;
		System.out.println(liangzonghuya.YOUNG_AGE);
		liangyiyue.YOUNG_AGE = 19;
		System.out.println(liangzonghuya.YOUNG_AGE);

	}
}
