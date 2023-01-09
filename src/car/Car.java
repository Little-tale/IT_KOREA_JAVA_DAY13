package car;

public class Car
{ // 브랜드, 색깔, 가격
	
	String brand;
	String color;
	int price;
	
	//생성자
//	public Car() {}
//	

	

	public Car(String brand, String color, int price)
	{
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}





	//메소드
	void enginStart()
	{
		System.out.println("welcome 부릉~");
	}
	void enginOff()
	{
		System.out.println("Good bye my orner");
	}
	
}
