package accesModifier;

public class Main {

	public static void main(String[] args)
	{
		A a = new A();
		a.var1 = 1;
		a.var2 = 2;
		a.var3 = 3;
// a.var4 = 4; // 접근 제한자를 private로 작성했기 때문에
		// 변수사용불가!!!
		
		System.out.println(a.var1+a.var2+a.var3);
		System.out.println(a.setVar4(100));
		a.getVar4();
		System.out.println(a.getVar4());
		
	}

}
