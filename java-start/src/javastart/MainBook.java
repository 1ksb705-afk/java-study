package javastart;

class Book{ 
	String title; 
	int price; 
	//생성자 오버로딩
	Book(String i, int j){ //생성자 //객체생성시 인자 2개
		title = i;
		price = j;
	}
	Book(String i){ //객체생성시 인자 1개
	  title = i;
	  price = 0;
	}
	Book(){ //객체생성시 인자 0개
		title = "c언어 정석";
		price = 0;
	}
	
	void showPrice(){
		System.out.println("제목->"+title+" 가격->"+price+"");
	}
}


public class MainBook { 

	public static void main(String[] args)  {
	Book myBook = new Book("자바의 정석",20000);	
	Book myBook2 = new Book("파이썬 정석");	
	Book myBook3 = new Book();	
	//	myBook.title ="자바의 정석"; 
//	myBook.price = 20000;
	myBook.showPrice();
	myBook2.showPrice();
	myBook3.showPrice();
	}

}
