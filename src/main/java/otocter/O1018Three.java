package otocter;

public class O1018Three {
	private static int score=94;
	private static int age=15;
	public static class SInner{
		int score=84;
		public void show(){
			
			System.out.println("外部score："+O1018Three.score);
			System.out.println("内部score："+score);
			System.out.println(age);
		}
		
		
	}
}
