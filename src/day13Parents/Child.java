package day13Parents;

public class Child extends Parents
{
	//필드
	int data;
	
	//메소드 
	void printInt (int num)
	{
		System.out.println(num);
	}

	public Child()
	{
		System.out.println("애기 생성자 호출~");
	}

	public Child(int number, int data) {
		super(number);
		this.data = data;
	}

	
	// 생성자
	
}
