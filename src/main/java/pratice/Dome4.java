package pratice;

public class Dome4 {
	public static void main(String[]args){
		int sum = 1;
		for(int a=1;a<=9;a++){
			for(int b=0;b<=9;b++){
				if(b==1) continue;
				for(int c=0;c<=9;c++){
					if(c==5) continue;
					System.out.println(sum++);
				}
			}
		}
	}
}
