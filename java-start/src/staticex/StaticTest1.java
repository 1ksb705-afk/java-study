package staticex;

class Counter{
	int cnt = 0; //객체(c1, c2)가 생성될 때마다
	// 메모리에 각각 새로 만들어지는 개별 변수이다.
	
	void increase() {
		cnt++;
	}
	
}


public class StaticTest1 {

	public static void main(String[] args) {
		Counter c1 = new Counter(); //c1만을 위한 별도의 공간을 할당한다.
		Counter c2 = new Counter();
		
		c1.increase();//c1 객체 내부에 있는 cnt 값만 
		// 1 증가시키며, 다른 객체에는 영향을 주지 않는다.
		c2.increase();
		
		System.out.println("c1:"+c1.cnt); //특정 객체의 이름(c1,c2)을 
		//통해서만 변수에 접근할 수 있다.
		System.out.println("c2:"+c2.cnt);

	}

}
