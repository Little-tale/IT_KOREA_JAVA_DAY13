package accesModifier;

public class A
{
	//필드
	public int var1; // 공용 
	int var2; //디폴트 다른 패키지 접근 불가
	protected int var3; // 상속관계를 가진 자식 접근 가능
	private int var4;	// 
	
	public A() {}

	public int getVar4()
	{
		return var4;
	}

	public int setVar4(int var4) {
		this.var4 = var4;
		return this.var4;
	}

	
//	public int getVar4()
//	{
//		return var4;
//	}
//	
//	public void setVar4(int var4)
//	{
//		this.var4 = var4;
//	}
//	
	
	
	
	
}
