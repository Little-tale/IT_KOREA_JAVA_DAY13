package accesModifier2;

import java.lang.reflect.Method;

import accesModifier.A;

class Child extends A
{
	int bb;
	void method()
	{
		var3 = 4;
		System.out.println(var3);
	}
}



public class Test {

	public static void main(String[] args)
	{
		A a = new A();
		Child b = new Child();
		a.var1 =3;
		b.method();
	}

}
