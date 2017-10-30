package otocter;

public class Fruit {

	private double weight;
	private String color;
	
	
	
	@Override
	public String toString(){
		return "width:"+this.weight+",color:"+this.color;
	}
	
	
	
	
	
	public static void main(String []args){
		System.out.println(new Fruit());
	}
}