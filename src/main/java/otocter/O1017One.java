package otocter;

public class O1017One {
	String name;
	String sex;
	static String age;
	
	public O1017One(){
		
		System.out.println("通过构造方法初始化name");
		name="小明";
				
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
		System.out.println("通过初始化块初始化sex");
		sex="男生";
		
	}
	static{
		System.out.println("通过初始化块初始化age");
		age="15";
		
	}
	public void show() {
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
		
	
	
	}
}