package accessex;

class Sample {
	public int a;
	private int b;
	int c;
}

public class AccessEx{
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a= 10;
		// sample.b= 10; // 클래스가 다르기 때문에 오류 발생
		sample.c= 10;
	}
}