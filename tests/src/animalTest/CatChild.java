package animalTest;

public class CatChild extends AnimalParent{
	String color;
	int weight;
	
	CatChild(String name,int age,String color,int weight){
		super(name,age); 
		this.weight = weight;
	}
	
	void showDog() {
		show();
		System.out.println("색상: "+color);
		System.out.println("몸무게: "+weight);
	}
	
}