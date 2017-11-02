package book;

public class Animal {
	private String name;
	private int age;
	
	//父类的初始化
		
	Animal (String name ,int age){
		System.out.println("animal构造器");
		this.setName(name);
		this.setAge(age);
	}
	//通过get and set 暴露信息,给其它类调用
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
