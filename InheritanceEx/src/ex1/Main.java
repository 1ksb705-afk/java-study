package ex1;


public class Main {

	public static void main(String[] args) {
	   Dog d = new Dog();
	   
	   d.name="뽀삐"; 
	   d.age=2; 
	   d.color="검은색"; 
	   
	   
	   System.out.println(d.name+ "," +d.age+"," +d.color);
	   
	   
	   d.eat(); //부모(super)
	   d.sleep(); //부모(super)
	   // 자식 클래스 메서드 호출
	   d.bark(); //자식(sub)
	   d.run(); //자식(sub)
	   
	}
}
