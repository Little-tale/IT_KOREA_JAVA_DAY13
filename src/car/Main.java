package car;

public class Main {
	public static void main(String[] args)
	{
		// 자식 객체생성
		Supercar bmw = new Supercar("porsche"
				,"red",430_000_000,true);
//		bmw.brand = "BMW";
		bmw.boosterOn();
		bmw.enginStart();
		
		Supercar KiA = new Supercar("Seltos", "black", 30_000_000, true);
		KiA.enginStart();
		
		
		
		
	}

}
