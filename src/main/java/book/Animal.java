package book;

public class Animal {
	private String name;
	private int age;
	
	/*Animal(){
		
	}*/
	Animal (String name ,int age){
		System.out.println("animal¹¹ÔìÆ÷");
	}

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
