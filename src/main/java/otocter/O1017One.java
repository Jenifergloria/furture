package otocter;

public class O1017One {
	String name;
	String sex;
	static String age;
	
	public O1017One(){
		
		System.out.println("ͨ�����췽����ʼ��name");
		name="С��";
				
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public static String getAge() {
		return age;
	}
	public static void setAge(String age) {
		O1017One.age = age;
	}
	{
		System.out.println("ͨ����ʼ�����ʼ��sex");
		sex="����";
		
	}
	static{
		System.out.println("ͨ����ʼ�����ʼ��age");
		age="15";
		
	}
	public void show() {
		System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
		
	
	
	}
}