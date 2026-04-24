package ex03;
//자식 클래스
public class Dog3 extends Animal03{
	String breed; //품종
	
	Dog3(String name,int age,String breed){
		super(name, age); 
		//부모생성자 호출. 자식이 부모의 쵝화 작업을 이어받음
		this.breed = breed;
	}
	void showDog(){
		show(); //부모 클래스
		System.out.println("품종:" +breed);
	}
}

