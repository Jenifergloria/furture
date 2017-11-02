package November2;
//多态的实现
public class AnimalOneEnter {
	public static void main(String[] args){
		AnimalBreeder p=new AnimalBreeder();
		Dog d=new Dog();
		p.feed(d);
		Cat c=new Cat();
		p.feed(c);
	}
}
