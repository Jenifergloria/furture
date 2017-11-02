package book;

public class Fish extends Animal {
	private int weight;
	//子类初始化
	//子类在调用自己构造器之前,先调用父类的构造器
	Fish(String name, int age,int weight) {
		//super();
		super(name, age);
		this.weight=weight;
		
		// TODO Auto-generated constructor stub
	}
	//打印是否初始化成功?
	public void say(){
		System.out.println(super.getName()+super.getAge()+this.weight);
	}
	
	
}
