package book;

public class Fish extends Animal {
	private int weight;
	//�����ʼ��
	//�����ڵ����Լ�������֮ǰ,�ȵ��ø���Ĺ�����
	Fish(String name, int age,int weight) {
		//super();
		super(name, age);
		this.weight=weight;
		
		// TODO Auto-generated constructor stub
	}
	//��ӡ�Ƿ��ʼ���ɹ�?
	public void say(){
		System.out.println(super.getName()+super.getAge()+this.weight);
	}
	
	
}
