package book;
//对于隐藏的信息,通过get and set 方法来选择对外公开信息,同包的其它类,就可以调用
//this 指向的对象,就是调用该方法的对象
public class UserInformation {
	private String name;
	private int age;
	
	public String getName(){
		return name;
		
	}
	public void setName(String name){
		this.name=name;
	
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
		
	}
	public void show(){
		System.out.println(this.age + this.name);
	}
	

}
