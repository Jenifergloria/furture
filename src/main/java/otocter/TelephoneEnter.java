package otocter;

public class TelephoneEnter {
	public static void main(String[]args){
		Telephone a=new Telephone();
		a.cap=10;
		a.cpu=12;
		a.size=13;
		Telephone a1=new Telephone();
		a1.cap=10;
		a1.cpu=12;
		a1.size=13;
		if(a.equals(a1)){
			System.out.println("相同的");
			
		}
		else{
			System.out.println("不相同的");
		}	
		
	}
}
