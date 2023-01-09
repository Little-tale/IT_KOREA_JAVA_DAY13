package car;

public class Supercar extends Car
{
	// 필드
		boolean booster;
				
		
		//생성자
		
		
		public Supercar(String brand, String color, int price ,boolean booster)
		{
			super(brand, color, price);
			this.booster = booster;
		}
		
		
		
		
		
		void boosterOn()
		{
			System.out.println("부스터 온");
		}
		
		void boosterOff()
		{
			System.out.println("부스터 오프");
		}
		

	
		
		//오버라이딩
		
		@Override
		void enginStart()
		{
			System.out.println(brand+" 오버라이딩 엔진 온 부릉 부릉~");
		}
		void start()
		{
			super.enginStart();
		}

}
