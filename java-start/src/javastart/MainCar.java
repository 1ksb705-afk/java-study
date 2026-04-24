package javastart;

class Car{ 
	String model; 
	int speed; 
	Car(String model, int speed){ 
		this.model = model;
		this.speed = speed;
		//this: 왼쪽 변수(객체 변수), 오른쪽 변수(매개 변수)
		//this : 객체 자신
	}
	
	Car(String model){ 
		  this.model = model;
		  speed = 0;
	}
		  Car(){
			  model = "트럭";
			  speed = 0;
			  
		  }
	
	//메서드 정의(기능,행위)
	void showPrint(){
		System.out.println(model+" ,"+speed);
	}
}


public class MainCar { //실행하는 클래스

	public static void main(String[] args)  
	{
	Car c1 = new Car("Sonata",100); //객체(인스턴스) 생성	
	Car c2 = new Car("Avante",80);	
	Car c3 = new Car("Avante");	
	Car c4 = new Car();	

	c1.showPrint(); //메서드 호출
	c2.showPrint();
	

	}

}
