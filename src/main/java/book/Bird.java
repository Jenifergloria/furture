package book;
//先定义一个父类
 class Bird extends Object {
	public void fly(){
		System.out.println("在天空中飞翔!");
		
	
	
}	
 class Narrow extends Bird{
	
	public void fly(){
		System.out.println("我在大海上面飞!");
	}
	public void say(){
		System.out.println("这个鸟可以说话");
		//去父类对象中找fly 方法
		super.fly();
	}
	
}	
class superdome{	
// super的用法
	public static void main(String[] args){
		Narrow n= new Narrow();
		n.say();
	}
}
	
	
	
	
	
	

