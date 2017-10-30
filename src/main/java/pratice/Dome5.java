package pratice;

public class Dome5 {
	public static void main(String[]args){
		
		new Dome5().getNum();
	}
	
	public void getNum(){
		int a=1;
		int b=0;
		int c=0;
		for( a=1;a<=9;a++){
			
			for( b=0;b<=9;b++){
				
				for( c=0;c<=9;c++){
					int sum=a*100+c*10+b;
					sum=sum+b*100+a*10+c;
					sum=sum+b*100+c*10+a;
					sum=sum+c*100+a*10+b;
					sum=sum+c*100+b*10+a;
					
					if(sum==2012){
						System.out.println(a*100+b*10+c);
					}
				}
				
			}
			
		}
	}
}
