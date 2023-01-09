package casting;

class Tv{
	   //필드
	   int vol;
	   int ch;
	   boolean power;
	   
	   //메소드
	   void chUp() {   
	   }
	   void chDown() {   
	   }
	   void volUp() {   
	   }
	   void volDown() {   
	   }
	   void powerOnOff() {   
	   }
	}

	class SmartTv extends Tv{
	   //메소드
	   void netflix() {
	      
	   }
	}

	public class ClassTest {
	   public static void main(String[] args) {
	      //up casting
	      //1.
	      SmartTv smartTv = new SmartTv();
	      //자료형  변수명   = 값;
//	      Tv tv = (Tv)smartTv();
	      
	      //2.
//	      Tv tv = (Tv)new SmartTv();
	      
	      //3.
	      Tv tv = new SmartTv();
	      //부모클래스 타입의 참조변수로 자식클래스 타입의 객체를 참조한다.(가리키게 한다)
	      // 부모클래스 타입의 참조변수에 자식클래스 타입의 객체의 주소값을 저장한다.
	      tv.ch = 3;
	      tv.vol = 10;
	      tv.power = false;
	   }
	}