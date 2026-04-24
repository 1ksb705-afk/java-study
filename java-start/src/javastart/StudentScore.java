package javastart;

import java.util.Scanner;

class StudentP{
	String name;
	int score;
	
	StudentP(String name,int score){
		this.name = name;
		this.score = score;
	}
	
	
	
}






public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//학생 수 키보드로부터 입력
		System.out.println("반 학생 수 입력");
		int cnt = sc.nextInt();
		sc.nextLine();
		//학생수입력 배열 객체 생성
		StudentP[] stu = new StudentP[cnt];
		//반복문을 통해서 배열 요소 객체 생성
		//값을 키보드로부터 입력받음
		for(int i= 0;i <stu.length ;i++) {
			System.out.println((i+1)+"번째 학생 이름 입력: ");
			String name = sc.nextLine();
			System.out.println((i+1)+ "번째 학생 점수 입력: ");
			int score = sc.nextInt();
			sc.nextLine();
			stu[i]= new StudentP(name,score);
		}
		// 이름검색
		while(true) {
			System.out.println("검색할 학생 이름: ");
			String sname = sc.nextLine();
			
			if(sname.equals("그만")) break; //while문 탈출
			
			boolean k = false;
			for(int j= 0; j<stu.length;j++) {
				if(stu[1].name.equals(sname)) {
					System.out.println(sname+"의 점수는 : "+stu[j].score);
					k=true;
					break; //for문 탈출 //break는 가장 가까운 반복문을 탈주한다.
					
				}//if 
				
			}//for 
		
		if(k) { //boolean은 기본이 true-> false이면 !(not)
		System.out.println("찾는 사람이 없습니다.");
		
		}//if
		
		}//while
		
		}
}

