package book;

public class AnimalEnter {
	public static void main(String[]args){
		//子类的初始化测试类
		Fish f=new Fish("小鱼鱼",18,50);
		f.say();
		
		Animal a = new Animal("123", 12);
			
		a = f;
		
	}
	
}
