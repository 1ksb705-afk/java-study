package javastart;

class Person{
	String name;
	int age;


	Person(String name, int age){ 
		this.name = name;
		this.age = age;
		//this: 왼쪽 변수(객체 변수), 오른쪽 변수(매개 변수)
		//this : 객체 자신
	}
	
	//메서드 정의(기능,행위)
		void checkAdult(){
			if(age >= 19) System.out.println("성인");
			else if(age >= 10) System.out.println("청소년");
			else System.out.println("소인");
		}

}


	
public class Test1 {

	public static void main(String[] args) {
		Person p = new Person("John",19); 
        p.checkAdult();
		
	}
     

}
