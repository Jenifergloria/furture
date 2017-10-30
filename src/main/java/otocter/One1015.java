package otocter;

public class One1015{
	public static void main(String[]args){
		One1015 hello= new One1015();
		hello.test();
		hello.test("你好,梁小姐!");
	}	
		
	public void test(){
		System.out.println("无参数");
	}
	public void test(String name ){
		System.out.println(name);
	}
}
