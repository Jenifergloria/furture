package book;
//���������,���в���
//�ȶ���һ������ 
 class Bird extends Object {
	public void fly(){
		System.out.println("������з���!");
	}
	
	
	public static void main(String[] args){
		Narrow n= new Narrow();
		n.say();

	}
	
	
}	
 class Narrow extends Bird{
	
	public void fly(){
		System.out.println("���ڴ������!");
	}
	public void say(){
		System.out.println("��������˵��");
		//ȥ�����������fly ����
		super.fly();
	}
}	
 class superdome{	
// super���÷�
	

	
}	
	
	
	
	

