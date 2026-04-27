package staticex;

class Counter2{ //static 변수는 클래스가 메모리에 로딩될 때 생성
	static int cnt =0; //1번만 생성되며,(끝까지 감)
	//모든 객체가 공동으로 사용하는 공유 변수이다.
	
	static void increase() {//객체 생성(new)하지 않고도 클래스 이름으로 
		//직접 호출해서 실행할 수 있는 정적 메소드이다.
		cnt++;
	}
}

public class StaticTest2 {

	public static void main(String[] args) {
		Counter2.increase(); //공용 공간에 있는 cnt 값을 직접 찾아가서 
		// 1 증가시킨다.
		Counter2.increase();
		
		System.out.println("count: " + Counter2.cnt);
		//클래스 이름(Counter2)으로 데이터에 접근한다.

	}

}
