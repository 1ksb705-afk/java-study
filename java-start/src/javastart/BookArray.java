package javastart;

import java.util.Scanner;

class BookA{
	String title;
	int price;
	
	BookA(String i, int j){
		this.title = i;
		this.price = j;
		}
	
	
}




public class BookArray {

	public static void main(String[] args) { 		
		BookA[] c = new BookA[3];
		 Scanner sc = new Scanner(System.in);

		for(int i = 0 ; i < c.length ; i++) {
			System.out.println("제목을 입력하세요:  ");
			String title = sc.nextLine();
			System.out.print("가격을 입력하세요:  ");
			int price = sc.nextInt();
			sc.nextLine();
				c[i]= new BookA(title,price); //배열 요소, 객체 생성
			
		}
		
		for(int j = 0; j < c.length; j++) {
			System.out.println(c[j].title + ",  " + c[j].price);
		}
		
		sc.close();

}

}