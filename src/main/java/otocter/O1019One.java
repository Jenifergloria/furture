package otocter;

public class O1019One {
	
	public int age=10;
	public String name;
	public void eat(){
		
		System.out.println("������гԶ�����������");
	}
	//�����ʼ��
	public O1019One(){
		System.out.println("aִ���ˣ�");
		age=20;
		this.eat(); 
		
	}
	
	public O1019One(int age){
		System.out.println("cִ���ˣ�");
		this.age=age;
	}
	
}
