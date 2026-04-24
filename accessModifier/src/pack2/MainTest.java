package pack2;

import pack1.Parent;

public class MainTest { //public class는 어디서나 객체 생성이 가능하다. 
	//다른 패키지는 import를 해야한다.(ctrl+shift+o)

	public static void main(String[] args) {
		Parent pa = new Parent();
		Child ch = new Child();
		
		System.out.println("=== 일반 객체 접근 ===");
		
    	System.out.println("public a = " +pa.a);
//		System.out.println("protected b = " +pa.b);
//		System.out.println("default c = " +pa.c);
//		System.out.println("private d = " +pa.d);
		
		//자식 클래스 접근
		ch.printChild();
		
	}
	
}
