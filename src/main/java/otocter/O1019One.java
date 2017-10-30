package otocter;

public class O1019One {
	
	public int age=10;
	public String name;
	public void eat(){
		
		System.out.println("动物具有吃东西的能力！");
	}
	//父类初始化
	public O1019One(){
		System.out.println("a执行了！");
		age=20;
		this.eat(); 
		
	}
	
	public O1019One(int age){
		System.out.println("c执行了！");
		this.age=age;
	}
	
}
