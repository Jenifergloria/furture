package book;
//�������ص���Ϣ,ͨ��get and set ������ѡ����⹫����Ϣ,ͬ����������,�Ϳ��Ե���
//this ָ��Ķ���,���ǵ��ø÷����Ķ���
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
