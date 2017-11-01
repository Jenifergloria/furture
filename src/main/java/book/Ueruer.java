package book;

public class Ueruer extends UserInformation {
	//因为private没有继承的,所以子类也要对父类隐藏的信息,通过set and get 方法调用
	
	//this 在构造器中
	//this 还可以在方法中
	//以下是打印出构造器中this指向的对象, 跟Ueruer 的new出来的对象b 打印出来的一样
	//book.Ueruer@15db9742
	//book.Ueruer@15db9742
	Ueruer()
	{
		System.out.println(this);
	}
}
