package otocter;

public class O1018Four {
	private String name="����";
	public void show(){
		class MInner{
			int score=18;
			public int getscore(){
				return score=10;
			}
		}
		MInner mi=new MInner();
		int newscore=mi.getscore();
		System.out.println("�ӷֺ�ķ����ǣ�"+name +newscore);
		
		
	}
}
