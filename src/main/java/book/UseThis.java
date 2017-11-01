package book;

public class UseThis {
	public static void main(String[]args){
		UserInformation a=new UserInformation();
		a.setName("nancy");
		String n=a.getName();
		
		
		
		a.setAge(18);
		int g=a.getAge();
		a.show();
		System.out.println(n+g);
		
		//UserInformationµÄ×ÓÀàUeruer
		Ueruer b= new Ueruer();
		//    System.out.println(b);
;		b.setName("wendy");
		String name=b.getName();
		
		b.setAge(20);
		int age=b.getAge();
		b.show();
		System.out.println(name+age);
	}
}
