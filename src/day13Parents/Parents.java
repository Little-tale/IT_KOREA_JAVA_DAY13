package day13Parents;

public class Parents
{
	// 필드
	int number;
	
	// 생성자
	public Parents(int number)
	{
		super(); // 오브첵트 클래스 데리고옴
		this.number = number;
	}
	
	
	
	
	// 메소드
	public Parents()
	{
		System.out.println("Parents 생성자 호출");
		
	}
	
	void printStr(String str)
	{
		System.out.println(str);
	}

	
	
	
}
