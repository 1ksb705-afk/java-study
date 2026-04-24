package test;

class Car{ //클래스 class
	String model; //멤버변수(필드)
	int speed;
	
	Car(String model,int speed){
		this.model= model; //왼쪽 model-> 필드(멤버 변수), 오른쪽 model은 매개변수
		this.speed= speed;
		
	}
	
	//메서드 -> 기능, 행위
	void print(){
		System.out.println(model + ","+speed);
	}
	
}

public class Ex04 {
public static void main(String[] args) {
		//객체 생성(생성자)
	Car c1 = new Car("Sonata",100);
	Car c2 = new Car("Avante",120);

	//메서드 호출
	c1.print();
	c2.print();
	

}


}